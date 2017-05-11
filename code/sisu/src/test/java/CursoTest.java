import com.google.gson.Gson;
import org.junit.Test;
import java.io.FileReader;
import static org.junit.Assert.*;

public class CursoTest {

    private Gson gson = new Gson();

    @Test
    public void calcularVagasReservadas() throws Exception {
        Curso curso = gson.fromJson(new FileReader("src/main/resources/arquitetura.json"), Curso.class);
        curso.init();
        assertEquals(15, curso.getTotalVagasReservadas());
        assertEquals(15, curso.getVagasComuns());
        assertEquals(4, curso.getVagasReservadas().get(2).intValue());
    }

    @Test
    public void setListaDeAprovados() throws Exception {
    }

}