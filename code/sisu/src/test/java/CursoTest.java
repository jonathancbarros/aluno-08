import com.google.gson.Gson;
import org.junit.Test;
import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CursoTest {
    private Gson gson = new Gson();

    @Test
    public void init() throws Exception {
        Instituicao[] instituicoes = gson.fromJson(new FileReader("src/main/resources/instituicoes.json"), Instituicao[].class);
        Instituicao.setUp(instituicoes);

        Curso[] cursos = gson.fromJson(new FileReader("src/main/resources/2cursos.json"), Curso[].class);
        Curso.setUp(cursos);
        assertEquals(Curso.getCursos().isEmpty(), true);

        Curso curso = gson.fromJson(new FileReader("src/main/resources/arquitetura.json"), Curso.class);
        Curso.setUp(curso);

        assertEquals(Curso.getCursos().isEmpty(), false);
    }

    @Test
    public void calcularVagasReservadas() throws Exception {
        try {
            Instituicao[] instituicoes = gson.fromJson(new FileReader("src/main/resources/instituicoes.json"), Instituicao[].class);
            Instituicao.setUp(instituicoes);
            Curso curso = gson.fromJson(new FileReader("src/main/resources/arquitetura.json"), Curso.class);
            Curso.setUp(curso);
            //fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        assertEquals(15, Curso.getCursos().get(0).getTotalVagasReservadas());
        assertEquals(15, Curso.getCursos().get(0).getVagasComuns());
        assertEquals(4, Curso.getCursos().get(0).getVagasReservadas().get(2).intValue());
    }


    @Test
    public void setListaDeAprovados() throws Exception {
        try {
            Instituicao[] instituicoes = gson.fromJson(new FileReader("src/main/resources/instituicoes.json"), Instituicao[].class);
            Instituicao.setUp(instituicoes);
            Curso curso = gson.fromJson(new FileReader("src/main/resources/arquitetura.json"), Curso.class);
            Curso.setUp(curso);
            Candidato[] candidatos = gson.fromJson(new FileReader("src/main/resources/candidatos_arquitetura.json"), Candidato[].class);
            Candidato.setUp(candidatos);
            Curso.realizarApuracao();
            //fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Curso.imprimirListaDeAprovados();
    }

}