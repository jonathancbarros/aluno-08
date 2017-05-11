import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Curso implements Constants {

    private int id;
    private String nome;
    private int idInstituicao;
    private int vagasOfertadas;
    private HashMap<Integer, Integer> vagasReservadas;
    private int totalVagasReservadas;
    private int vagasComuns;

    private ArrayList<Candidato> aprovadosVagasComum;
    private ArrayList<Candidato> aprovadosVagasReservadasTipo1;
    private ArrayList<Candidato> aprovadosVagasReservadasTipo2;
    private ArrayList<Candidato> aprovadosVagasReservadasTipo3;
    private ArrayList<Candidato> aprovadosVagasReservadasTipo4;


    public Curso(int id, String nome, int idInstituicao, int vagasOfertadas) {
        this.id = id;
        this.nome = nome;
        this.idInstituicao = idInstituicao;
        this.vagasOfertadas = vagasOfertadas;
        calcularVagasReservadas();
    }

    /**
     * Por ordem de preferência no cálculo das vagas reservadas:
     *
     * Tipo 2: Pobre (<= 1,5 salários per capita) + Escola Pública
     * Tipo 4: Não-pobre (> 1,5 salários per capita) + Escola Pública
     * Tipo 3: Não-pobre (> 1,5 salários per capita) + Escola Pública + [Preto, pardo ou indígena]
     * Tipo 1: Pobre (<= 1,5 salários per capita) + Escola Pública + [Preto, pardo ou indígena]
     */
    public void calcularVagasReservadas()
    {
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

    public void setListaDeAprovados(ArrayList<Candidato> candidatos) {

        aprovadosVagasComum = new ArrayList<Candidato>();
        aprovadosVagasReservadasTipo1 = new ArrayList<Candidato>();
        aprovadosVagasReservadasTipo2 = new ArrayList<Candidato>();
        aprovadosVagasReservadasTipo3 = new ArrayList<Candidato>();
        aprovadosVagasReservadasTipo4 = new ArrayList<Candidato>();

        for (Candidato candidato : candidatos) {
            if (candidato.getIdCursoPrimeiraOpcao() == this.id) {
                if (candidato.isTipo1()) {
                    aprovadosVagasReservadasTipo1.add(candidato);
                } else if (candidato.isTipo2()) {
                    aprovadosVagasReservadasTipo2.add(candidato);
                } else if (candidato.isTipo3()) {
                    aprovadosVagasReservadasTipo3.add(candidato);
                } else if (candidato.isTipo4()) {
                    aprovadosVagasReservadasTipo4.add(candidato);
                } else {
                    aprovadosVagasComum.add(candidato);
                }
            }
        }

        sortList(aprovadosVagasComum);
        sortList(aprovadosVagasReservadasTipo1);
        sortList(aprovadosVagasReservadasTipo2);
        sortList(aprovadosVagasReservadasTipo3);
        sortList(aprovadosVagasReservadasTipo4);
    }

    private void sortList(ArrayList list) {
        Collections.sort(list, new Comparator<Candidato>() {
            public int compare(Candidato c1, Candidato c2) {
                return Double.compare(c2.getNotaEnem(), c1.getNotaEnem());
            }
        });
    }

    private String getAprovadosFromList(ArrayList list, int vagas) {
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < list.size() && i < vagas; i++) {
            int posicao = i + 1;
            texto.append(" Posição: ").append(posicao).append(" ").append(list.get(i).toString()).append("\n");
        }
        return texto.toString();
    }

    public String imprimirListaDeAprovados() {
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
        return " Nome do Curso: " + nome +
                "\n Vagas Ofertadas: " + vagasOfertadas +
                "\n Vagas Comuns: " + vagasComuns +
                "\n Vagas Reservadas Tipo 1: " + vagasReservadas.get(TIPO_1) +
                "\n Vagas Reservadas Tipo 2: " + vagasReservadas.get(TIPO_2) +
                "\n Vagas Reservadas Tipo 3: " + vagasReservadas.get(TIPO_3) +
                "\n Vagas Reservadas Tipo 4: " + vagasReservadas.get(TIPO_4) +
                "\n";

    }
}
