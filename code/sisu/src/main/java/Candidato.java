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

    public static void setUp(Candidato[] candidatos) {
        Candidato.candidatos = new ArrayList<Candidato>(Arrays.asList(candidatos));
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
