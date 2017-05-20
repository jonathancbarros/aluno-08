import com.google.gson.Gson;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CandidatoTest {
    private Gson gson = new Gson();

    @Before
    public void setUp() throws Exception {
        Instituicao instituicao = gson.fromJson(new FileReader("src/test/resources/instituicao.json"), Instituicao.class);
        Instituicao.setUp(instituicao);

        Curso[] cursos = gson.fromJson(new FileReader("src/test/resources/cursos.json"), Curso[].class);
        Curso.setUp(cursos);
    }

    @After
    public void tearDown() throws Exception {
        Instituicao.reset();
        Curso.reset();
    }

    @Test
    public void setUpCandidato() throws Exception {
        Candidato candidato = gson.fromJson(new FileReader("src/test/resources/candidato.json"), Candidato.class);
        Candidato.setUp(candidato);

        assertEquals(Candidato.getCandidatos().get(0), candidato);

        try {
            candidato = gson.fromJson(new FileReader("src/test/resources/candidato_com_dados_invalidos.json"), Candidato.class);
            Candidato.setUp(candidato);
            fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setUpCandidatos() throws Exception {
        try {
            Candidato[] candidatos = gson.fromJson(new FileReader("src/test/resources/candidatos.json"), Candidato[].class);
            Candidato.setUp(candidatos);
            ArrayList<Candidato> candidatosList = new ArrayList<Candidato>(Arrays.asList(candidatos));
            assertEquals(Candidato.getCandidatos().get(0), candidatosList.get(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void isBaixaRenda() throws Exception {
        Candidato candidato = gson.fromJson(new FileReader("src/test/resources/candidato.json"), Candidato.class);
        Candidato.setUp(candidato);
        assertEquals(Candidato.getCandidatos().get(0).isBaixaRenda(), false);
    }

    @Test
    public void isTipo4() throws Exception {
        Candidato candidato = gson.fromJson(new FileReader("src/test/resources/candidato.json"), Candidato.class);
        Candidato.setUp(candidato);

        //Nesse caso o Candidato não é Cotista tipo 4 porque ele não é de escola pública
        assertEquals(Candidato.getCandidatos().get(0).isTipo4(), false);
    }

}