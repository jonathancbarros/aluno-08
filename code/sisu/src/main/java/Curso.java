import com.google.gson.JsonSyntaxException;

import java.util.*;

public class Curso implements Constants {
    // Propriedades Padrões:
    private int id;
    private String nome;
    private int idInstituicao;
    private int vagasOfertadas;

    // Propriedades Computadas:
    private int vagasComuns;
    private int totalVagasReservadas;
    private HashMap<Integer, Integer> vagasReservadas;
    private ArrayList<Candidato> aprovadosVagasComum = new ArrayList<Candidato>();
    private ArrayList<Candidato> aprovadosVagasReservadasTipo1 = new ArrayList<Candidato>();
    private ArrayList<Candidato> aprovadosVagasReservadasTipo2 = new ArrayList<Candidato>();
    private ArrayList<Candidato> aprovadosVagasReservadasTipo3 = new ArrayList<Candidato>();
    private ArrayList<Candidato> aprovadosVagasReservadasTipo4 = new ArrayList<Candidato>();

    public Curso(int id, String nome, int idInstituicao, int vagasOfertadas) {
        this.id = id;
        this.nome = nome;
        this.idInstituicao = idInstituicao;
        this.vagasOfertadas = vagasOfertadas;
    }

    // Propriedades e operações estáticas para manter o estado da aplicação:
    private static ArrayList<Curso> cursos = new ArrayList<Curso>();

    public static ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**
     * Função para receber um array do tipo Curso e adicionar a lista estática de cursos
     * @param cursos - Cursos há serem registrados
     */
    public static void setUp(Curso[] cursos) throws Exception {
        for (Curso curso : Arrays.asList(cursos)) {
            if (validateCurso(curso)) {
                Curso.cursos.add(curso);
            }
        }
        init();
    }

    /**
     * @param curso - Similarmente ao método anterior, esse aqui recebe apenas um objeto do tipo Curso
     * @throws Exception - A exceção é lançada quando o id da instituição passado não existe nos registros de instituições
     */
    public static void setUp(Curso curso) throws Exception {
        if (validateCurso(curso)) {
            cursos.add(curso);
            init();
        }
    }

    public static void reset() {
        cursos.clear();
    }

    private static boolean validateCurso(Curso curso) throws Exception {
        if (Instituicao.getInstituicaoById(curso.idInstituicao) == null) {
            throw new Exception("O curso " + curso.nome + " não foi cadastrado por que não há uma Instituição registrada com o ID informado.");
        } if (!isIdValid(curso.id)) {
            throw new Exception("O curso " + curso.nome + " não foi cadastrado pois o ID informado já existe.");
        } if (!isVagasValid(curso.vagasOfertadas)) {
            throw new Exception("O curso " + curso.nome + " não foi cadastrado pois o número de vagas é um valor inválido.");
        } if (!isNomeValid(curso)) {
            throw new Exception("O curso " + curso.nome + " não foi cadastrado pois o nome do curso já foi usado para essa mesma instituição.");
        }
        return true;
    }

    public static void realizarApuracao() {
        for (Curso curso : Curso.cursos) {
            try {
                curso.setAprovadosPrimeiraOpcao();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (Curso curso : Curso.cursos) {
            curso.setAprovadosSegundaOpcao();
        }
    }

    public static void imprimirListaDeAprovados() {
        for (Curso curso : Curso.cursos) {
            System.out.println(curso.getListaDeAprovados());
        }
    }

    private static void init() {
        for (Curso curso: Curso.cursos) {
            curso.calcularVagasReservadas();
            curso.aprovadosVagasComum = new ArrayList<Candidato>();
            curso.aprovadosVagasReservadasTipo1 = new ArrayList<Candidato>();
            curso.aprovadosVagasReservadasTipo2 = new ArrayList<Candidato>();
            curso.aprovadosVagasReservadasTipo3 = new ArrayList<Candidato>();
            curso.aprovadosVagasReservadasTipo4 = new ArrayList<Candidato>();
        }
    }

    private static boolean isIdValid(int id) {
        if (id <= 0)
            return false;

        for (Curso curso: cursos) {
            if(curso.id == id) {
                return false;
            }
        }
        return true;
    }

    private static boolean isVagasValid(int vagas) {
        return vagas > 0;
    }

    private static boolean isNomeValid(Curso newCurso) {
        for (Curso curso: cursos) {
            if (curso.nome.equals(newCurso.nome) && curso.idInstituicao == newCurso.idInstituicao) {
                return false;
            }
        }
        return true;
    }

    public static Curso getCursoById(int id) {
        for (Curso curso: cursos) {
            if(curso.id == id) {
                return curso;
            }
        }
        return null;
    }

    private String nomeInstituicao() {
        try {
            return Instituicao.getNomeInstituicaoById(idInstituicao);
        } catch (Exception e) {
            return "Instituição Inválida";
        }
    }

    public HashMap<Integer, Integer> getVagasReservadas() {
        return vagasReservadas;
    }

    public int getTotalVagasReservadas() {
        return totalVagasReservadas;
    }

    public int getVagasComuns() {
        return vagasComuns;
    }

    /**
     * Por ordem de preferência no cálculo das vagas reservadas:
     *
     * Tipo 2: Pobre (<= 1,5 salários per capita) + Escola Pública
     * Tipo 4: Não-pobre (> 1,5 salários per capita) + Escola Pública
     * Tipo 3: Não-pobre (> 1,5 salários per capita) + Escola Pública + [Preto, pardo ou indígena]
     * Tipo 1: Pobre (<= 1,5 salários per capita) + Escola Pública + [Preto, pardo ou indígena]
     */
    public void calcularVagasReservadas() {
        this.vagasReservadas = new HashMap<Integer, Integer>();

        if (vagasOfertadas <= 0) {
            vagasComuns = totalVagasReservadas = 0;
            this.vagasReservadas.put(TIPO_1, 0);
            this.vagasReservadas.put(TIPO_2, 0);
            this.vagasReservadas.put(TIPO_3, 0);
            this.vagasReservadas.put(TIPO_4, 0);
        } else {
            int reserva = (int) Math.ceil(vagasOfertadas * 0.5);
            totalVagasReservadas = reserva;
            this.vagasComuns = vagasOfertadas - reserva;
            this.vagasReservadas.put(TIPO_3, (int) Math.ceil(reserva / 4));
            reserva -= (int) Math.ceil(reserva / 4);
            this.vagasReservadas.put(TIPO_1, (int) Math.ceil(reserva / 3));
            reserva -= (int) Math.ceil(reserva / 3);
            this.vagasReservadas.put(TIPO_4, (int) Math.ceil(reserva / 2));
            reserva -= (int) Math.ceil(reserva / 2);
            this.vagasReservadas.put(TIPO_2, reserva);
        }
    }

    public void setAprovadosPrimeiraOpcao() throws Exception {

        if (Candidato.getCandidatos().isEmpty()) {
            throw new Exception("Lista de Candidatos está vazia.");
        }

        for (Candidato candidato : Candidato.getCandidatos()) {
            if (candidato.getIdCursoPrimeiraOpcao() == this.id) {
                addCandidatoToAprovadosList(candidato, this);
            }
        }

        ordenarListasDeAprovados();
    }

    private void setAprovadosSegundaOpcao() {
        for (Candidato candidato : Candidato.getCandidatos()) {
            if (candidato.getIdCursoSegundaOpcao() == this.id && !isCandidatoAprovadoNaPrimeiraOpcao(candidato)) {
                addCandidatoToAprovadosList(candidato, this);
            }
        }
        ordenarListasDeAprovados();
    }

    private void addCandidatoToAprovadosList(Candidato candidato, Curso curso) {
        if (candidato.isTipo1()) {
            curso.aprovadosVagasReservadasTipo1.add(candidato);
        } else if (candidato.isTipo2()) {
            curso.aprovadosVagasReservadasTipo2.add(candidato);
        } else if (candidato.isTipo3()) {
            curso.aprovadosVagasReservadasTipo3.add(candidato);
        } else if (candidato.isTipo4()) {
            curso.aprovadosVagasReservadasTipo4.add(candidato);
        } else {
            curso.aprovadosVagasComum.add(candidato);
        }
    }

    private void sortList(ArrayList list) {
        Collections.sort(list, new Comparator<Candidato>() {
            public int compare(Candidato c1, Candidato c2) {
                return Double.compare(c2.getNotaEnem(), c1.getNotaEnem());
            }
        });
    }

    private void ordenarListasDeAprovados() {
        sortList(aprovadosVagasComum);
        sortList(aprovadosVagasReservadasTipo1);
        sortList(aprovadosVagasReservadasTipo2);
        sortList(aprovadosVagasReservadasTipo3);
        sortList(aprovadosVagasReservadasTipo4);
    }

    /**
     * @param candidato - Candidato a ser verificado
     * @return true or false caso o Candidato já tenha sido aprovado em algum curso
     */
    private boolean isCandidatoAprovadoNaPrimeiraOpcao(Candidato candidato) {

        for (Curso curso: Curso.cursos) {
            ArrayList<Candidato> listaDeAprovados = curso.aprovadosVagasComum;
            int vagas = curso.vagasComuns;

            if (candidato.isTipo1()) {
                listaDeAprovados = curso.aprovadosVagasReservadasTipo1;
                vagas = curso.vagasReservadas.get(TIPO_1);
            } else if(candidato.isTipo2()) {
                listaDeAprovados = curso.aprovadosVagasReservadasTipo2;
                vagas = curso.vagasReservadas.get(TIPO_2);
            } else if(candidato.isTipo3()) {
                listaDeAprovados = curso.aprovadosVagasReservadasTipo3;
                vagas = curso.vagasReservadas.get(TIPO_3);
            } else if(candidato.isTipo4()) {
                listaDeAprovados = curso.aprovadosVagasReservadasTipo4;
                vagas = curso.vagasReservadas.get(TIPO_4);
            }

            if (listaDeAprovados != null) {
                for (int i = 0; i < listaDeAprovados.size() && i < vagas; i++) {
                    if (listaDeAprovados.get(i) == candidato) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * @param list - Lista de Aprovados divididos por categorias
     * @param vagas - Número de vagas correspondente à categoria para limitar a impressão de aprovados
     * @return Texto formatado dos aprovados por categoria
     */
    private String getAprovadosFromList(ArrayList list, int vagas) {
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < list.size() && i < vagas; i++) {
            int posicao = i + 1;
            texto.append(" Posição: ").append(posicao).append(" ").append(list.get(i).toString()).append("\n");
        }
        return texto.toString();
    }

    public String getListaDeAprovados() {
        String texto = toString();
        texto += "\n Aprovados em Vaga Comum:\n";
        texto += getAprovadosFromList(aprovadosVagasComum, vagasComuns);

        texto += "\n Aprovados em Vagas Reservadas Tipo 1:\n";
        texto += getAprovadosFromList(aprovadosVagasReservadasTipo1, vagasReservadas.get(TIPO_1));

        texto += "\n Aprovados em Vagas Reservadas Tipo 2:\n";
        texto += getAprovadosFromList(aprovadosVagasReservadasTipo2, vagasReservadas.get(TIPO_2));

        texto += "\n Aprovados em Vagas Reservadas Tipo 3:\n";
        texto += getAprovadosFromList(aprovadosVagasReservadasTipo3, vagasReservadas.get(TIPO_3));

        texto += "\n Aprovados em Vagas Reservadas Tipo 4:\n";
        texto += getAprovadosFromList(aprovadosVagasReservadasTipo4, vagasReservadas.get(TIPO_4));

        return texto;
    }

    @Override
    public String toString() {
        return " Universidade: " + this.nomeInstituicao() +
                "\n Curso: " + nome +
                "\n Vagas Ofertadas: " + vagasOfertadas +
                "\n Vagas Comuns: " + vagasComuns +
                "\n Vagas Reservadas Tipo 1: " + vagasReservadas.get(TIPO_1) +
                "\n Vagas Reservadas Tipo 2: " + vagasReservadas.get(TIPO_2) +
                "\n Vagas Reservadas Tipo 3: " + vagasReservadas.get(TIPO_3) +
                "\n Vagas Reservadas Tipo 4: " + vagasReservadas.get(TIPO_4) +
                "\n";
    }
}
