import java.util.ArrayList;
import java.util.Arrays;

public class Instituicao {

    private int id;
    private String nome;

    public static ArrayList<Instituicao> instituicoes;

    public Instituicao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static void setUp(Instituicao[] instituicoes) {
        Instituicao.instituicoes = new ArrayList<Instituicao>(Arrays.asList(instituicoes));
    }

    public static Instituicao getInstituicaoById(int id) {
        for (Instituicao instituicao: instituicoes) {
            if (instituicao.id == id) {
                return instituicao;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }
}
