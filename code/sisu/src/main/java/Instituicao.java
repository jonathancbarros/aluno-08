import java.util.ArrayList;
import java.util.Arrays;

public class Instituicao {

    private int id;
    private String nome;

    private static ArrayList<Instituicao> instituicoes;

    public Instituicao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static void setUp(Instituicao[] instituicoes) {
        Instituicao.instituicoes = new ArrayList<Instituicao>(Arrays.asList(instituicoes));
    }

    public static Instituicao getInstituicaoById(int id) throws Exception {

        if (Instituicao.instituicoes.isEmpty()) {
            throw new Exception("Não há instituições cadastradas");
        }

        for (Instituicao instituicao: instituicoes) {
            if (instituicao.id == id) {
                return instituicao;
            }
        }

        return null;
    }

    public static String getNomeInstituicaoById(int id) throws Exception {

        Instituicao instituicao = getInstituicaoById(id);

        if (instituicao != null) {
            return instituicao.getNome();
        }

        return "Instituição não encontrada";
    }

    public String getNome() {
        return nome;
    }

}
