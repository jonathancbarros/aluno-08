import java.util.ArrayList;
import java.util.Arrays;

public class Instituicao {

    private int id;
    private String nome;

    private static ArrayList<Instituicao> instituicoes = new ArrayList<Instituicao>();

    public Instituicao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static void setUp(Instituicao[] instituicoes) throws Exception {
        for (Instituicao instituicao : Arrays.asList(instituicoes)) {
            if (validate(instituicao)) {
                Instituicao.instituicoes.add(instituicao);
            }
        }
    }

    public static void setUp(Instituicao instituicao) throws Exception {
        if (validate(instituicao)) {
            Instituicao.instituicoes.add(instituicao);
        }
    }

    public static void reset() {
        instituicoes.clear();
    }

    private static boolean validate(Instituicao newInstituicao) throws Exception {
        if (newInstituicao.id <= 0)
            throw new Exception("A Instituição " + newInstituicao.nome + " não pode ser cadastrada pois o ID informado é inválido.");
        for (Instituicao instituicao: instituicoes) {
            if (instituicao.id == newInstituicao.id) {
                throw new Exception("A Instituição " + newInstituicao.nome + " não pode ser cadastrada pois o ID informado já está em uso.");
            } if (instituicao.nome.equals(newInstituicao.nome)) {
                throw new Exception("A Instituição " + newInstituicao.nome + " não pode ser cadastrada pois o nome informado já está em uso.");
            }
        }
        return true;
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

    public static ArrayList<Instituicao> getInstituicoes() {
        return instituicoes;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

}
