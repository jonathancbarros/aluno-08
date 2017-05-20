import java.util.ArrayList;
import java.util.Arrays;

public class Candidato implements Constants{

    private int id;
    private String nome;
    private boolean escolaPublica;
    private double rendaPerCapita;
    private int idCursoPrimeiraOpcao;
    private int idCursoSegundaOpcao;
    private int tipoCota;
    private double notaEnem;
    private int etnia;

    private static ArrayList<Candidato> candidatos = new ArrayList<Candidato>();

    public static ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public static void setUp(Candidato[] candidatos) throws Exception {
        for (Candidato candidato : Arrays.asList(candidatos)) {
            if (validate(candidato)) {
                Candidato.candidatos.add(candidato);
            }
        }
    }

    public static void setUp(Candidato candidato) throws Exception {
        if (validate(candidato)) {
            candidatos.add(candidato);
        }
    }

    private static boolean validate(Candidato candidato) throws Exception {
        if (!isIdValid(candidato.id)) {
            throw new Exception("O candidato " + candidato.nome + " não foi cadastrado pois o ID informado já existe.");
        } if (!isNomeValid(candidato.nome)) {
            throw new Exception("O candidato " + candidato.nome + " não foi cadastrado pois o Nome informado já existe.");
        } if (!isNotaEnemValid(candidato.notaEnem)) {
            throw new Exception("O candidato " + candidato.nome + " não foi cadastrado pois a Nota do Enem informada é inválida.");
        } if (!isOpcoesValid(candidato.idCursoPrimeiraOpcao, candidato.idCursoSegundaOpcao)) {
            throw new Exception("O candidato " + candidato.nome + " não foi cadastrado pois as opções de curso são inválidas.");
        } if (!isCotaValid(candidato.tipoCota)) {
            throw new Exception("O candidato " + candidato.nome + " não foi cadastrado pois o Tipo de Cota selecionado é inválido.");
        } if (!isEtniaValid(candidato.etnia)) {
            throw new Exception("O candidato " + candidato.nome + " não foi cadastrado pois a Etnia selecionada é inválida.");
        }
        return true;
    }

    private static boolean isIdValid(int id) {
        if (id <= 0)
            return false;

        for (Candidato candidato: candidatos) {
            if (candidato.id == id) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNomeValid(String nome) {
        for (Candidato candidato: candidatos) {
            if (candidato.nome.equals(nome)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNotaEnemValid(double notaEnem) {
        return notaEnem > 0;
    }

    private static boolean isEtniaValid(int etnia) {
        return etnia == BRANCO || etnia == PRETO || etnia == PARDO || etnia == INDIGENA;
    }

    private static boolean isCotaValid(int tipoCota) {
        return tipoCota == VAGA_COMUM || tipoCota == TIPO_1 || tipoCota == TIPO_2 || tipoCota == TIPO_3 || tipoCota == TIPO_4;
    }

    private static boolean isOpcoesValid(int idCursoPrimeiraOpcao, int idCursoSegundaOpcao) {
        if (idCursoPrimeiraOpcao == idCursoSegundaOpcao) {
            return false;
        }
        return Curso.getCursoById(idCursoPrimeiraOpcao) != null && Curso.getCursoById(idCursoSegundaOpcao) != null;
    }

    public Candidato(int id, String nome, boolean escolaPublica, double rendaPerCapita,
                     int idCursoPrimeiraOpcao, int idCursoSegundaOpcao, int tipoCota, double notaEnem, int etnia) {
        this.id = id;
        this.nome = nome;
        this.escolaPublica = escolaPublica;
        this.rendaPerCapita = rendaPerCapita;
        this.idCursoPrimeiraOpcao = idCursoPrimeiraOpcao;
        this.idCursoSegundaOpcao = idCursoSegundaOpcao;
        this.tipoCota = tipoCota;
        this.notaEnem = notaEnem;
        this.etnia = etnia;
    }

    public boolean isBranco() {
        return etnia == BRANCO;
    }

    public int getIdCursoPrimeiraOpcao() {
        return idCursoPrimeiraOpcao;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public boolean isBaixaRenda() {
        return rendaPerCapita <= (937.00 * 1.5);
    }

    public boolean isTipo1() {
        return tipoCota == TIPO_1 && isBaixaRenda() && !isBranco() && escolaPublica;
    }

    public boolean isTipo2() {
        return tipoCota == TIPO_2 && isBaixaRenda() && escolaPublica;
    }

    public boolean isTipo3() {
        return tipoCota == TIPO_3 && !isBaixaRenda() && !isBranco() && escolaPublica;
    }

    public boolean isTipo4() {
        return tipoCota == TIPO_4 && !isBaixaRenda() && escolaPublica;
    }

    @Override
    public String toString() {
        return nome + " - " + "Nota no Enem: " + notaEnem;
    }
}
