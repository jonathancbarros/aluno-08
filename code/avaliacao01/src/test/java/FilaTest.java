import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;

public class FilaTest extends TestCase {

    public void testGetCapacidade() throws Exception {
        assertEquals(10, new Fila(Integer.MAX_VALUE).getCapacidade());
        assertEquals(10, new Fila(Integer.MIN_VALUE).getCapacidade());
        assertEquals(5,  new Fila(5).getCapacidade());
        assertEquals(10, new Fila(0).getCapacidade());
    }

    public void testAdd() throws Exception {
        Fila fila = new Fila(3);
        fila.add(Integer.MAX_VALUE);
        fila.add(Integer.MIN_VALUE);
        fila.add(0);
        assertEquals(3, fila.size());
    }

    public void testAdicionarEmFilaCheia() {
        Fila fila = new Fila(1);
        fila.add(0);
        try {
            fila.add(1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void testRemove() throws Exception {
        Fila fila = new Fila(-1);
        fila.add(1);
        fila.remove();
        assertEquals(0, fila.size());
    }

    public void testRemoverEmFilaVazia() throws Exception {
       Fila fila = new Fila(0);
        try {
            fila.remove();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }

    public void testEmpty() throws Exception {
        Fila fila = new Fila(1);
        assertEquals(true, fila.empty());
        fila.add(1);
        assertEquals(false, fila.empty());
        fila.remove();
        assertEquals(true, fila.empty());
    }

    public void testSize() throws Exception {
        Fila fila = new Fila(2);
        assertEquals(0, fila.size());
        fila.add(1);
        assertEquals(1, fila.size());
        fila.remove();
        assertEquals(0, fila.size());
    }

    public void testElement() throws Exception {
        Fila fila = new Fila(2);
        try {
            fila.element();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        fila.add(10);
        assertEquals(10, fila.element());
        fila.add(15);
        assertEquals(10, fila.element());
    }

    public void testPrint() throws Exception {
        Fila fila = new Fila(3);
        try {
            fila.print();
            fila.add(1);
            assertEquals("1", fila.print());
            fila.add(2);
            assertEquals("1, 2", fila.print());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
