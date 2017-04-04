import org.junit.Test;

import java.io.File;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ReaderTest {
    @Test
    public void readAll() throws Exception {
        Reader reader = new Reader();

            byte[] resultWithCharacterA = reader.readAll(new File("src/test/resources/arquivo_com_caractere_a.txt"));
            assertEquals(Arrays.toString(resultWithCharacterA), "[97]");

            byte[] resultWithEmptyFile = reader.readAll(new File("src/test/resources/arquivo_vazio.txt"));
            assertEquals(Arrays.toString(resultWithEmptyFile), "[]");

            byte[] resultWithInvalidFile = reader.readAll(new File("src/test/resources/arquivo_inexistente.txt"));
            assertEquals(resultWithInvalidFile, null);

    }
}