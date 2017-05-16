import org.junit.Test;

import java.io.FileReader;


public class SisuTest {
    @Test
    public void realizarApuracao() throws Exception {
        Sisu sisu = new Sisu(
                new FileReader("src/main/resources/instituicoes.json"),
                new FileReader("src/main/resources/cursos.json"),
                new FileReader("src/main/resources/candidatos.json")
        );
        Curso.realizarApuracao();
        Curso.imprimirListaDeAprovados();
    }
}
