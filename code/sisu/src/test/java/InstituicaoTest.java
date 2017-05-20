import com.google.gson.Gson;
import org.junit.Test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InstituicaoTest {
    private Gson gson = new Gson();

    @Test
    public void setUp() throws Exception {
        Instituicao instituicao = gson.fromJson(new FileReader("src/test/resources/instituicao.json"), Instituicao.class);
        Instituicao.setUp(instituicao);

        assertEquals(Instituicao.getInstituicoes().get(0), instituicao);
    }

    @Test
    public void setUpWithArray() throws Exception {
        Instituicao[] instituicoes = gson.fromJson(new FileReader("src/test/resources/instituicoes.json"), Instituicao[].class);
        Instituicao.setUp(instituicoes);

        ArrayList<Instituicao> instituicoesList = new ArrayList<Instituicao>(Arrays.asList(instituicoes));
        assertEquals(instituicoesList.get(0), Instituicao.getInstituicoes().get(0));
        assertEquals(instituicoesList.get(5).getNome(), Instituicao.getInstituicoes().get(5).getNome());

        try {
            instituicoes = gson.fromJson(new FileReader("src/test/resources/instituicoes_com_mesmo_id.json"), Instituicao[].class);
            Instituicao.setUp(instituicoes);
            fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getInstituicaoById() throws Exception {
        Instituicao instituicao = gson.fromJson(new FileReader("src/test/resources/instituicao.json"), Instituicao.class);
        Instituicao.setUp(instituicao);

        assertEquals(Instituicao.getInstituicaoById(instituicao.getId()), instituicao);
    }

    @Test
    public void getNomeInstituicaoById() throws Exception {
        Instituicao instituicao = gson.fromJson(new FileReader("src/test/resources/instituicao.json"), Instituicao.class);
        Instituicao.setUp(instituicao);

        assertEquals(Instituicao.getNomeInstituicaoById(instituicao.getId()), instituicao.getNome());
    }
}