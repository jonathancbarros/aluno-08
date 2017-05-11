import org.junit.Test;

import java.io.FileReader;


public class SisuTest {
    /*@org.junit.Before
    public void setUp() throws Exception {
        Sisu sisu = new Sisu();
        sisu.registrarInstituicoes();
        sisu.registrarCursos();
    }*/

    /*@Test
    public void registrarInstituicoesSemArquivo() throws Exception {
        Sisu sisu = new Sisu();
        try {
            sisu.registrarInstituicoes(new FileReader(""));
            fail();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }*/

    /*@Test
    public void registrarInstituicoesComArquivoVazio() throws Exception {
        Sisu sisu = new Sisu();
        try {
            sisu.registrarInstituicoes(new FileReader("src/main/resources/vazio.json"));
            fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/

    @Test
    public void registrarCursos() throws Exception {
        Sisu sisu = new Sisu(new FileReader("src/main/resources/instituicoes.json"));
        sisu.registrarCursos(new FileReader("src/main/resources/cursos.json"));
    }

    @Test
    public void registrarCandidatos() throws Exception {
        Sisu sisu = new Sisu(new FileReader("src/main/resources/instituicoes.json"));
        sisu.registrarCandidatos(new FileReader("src/main/resources/candidatos.json"));
    }

    @Test
    public void realizarApuracao() throws Exception {
        Sisu sisu = new Sisu(
                new FileReader("src/main/resources/instituicoes.json"),
                new FileReader("src/main/resources/cursos.json"),
                new FileReader("src/main/resources/candidatos.json")
        );

        sisu.realizarApuracao();
        sisu.printListDeAprovados();
    }

}
