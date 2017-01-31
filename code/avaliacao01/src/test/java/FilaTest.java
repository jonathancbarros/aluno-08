

import junit.framework.TestCase;

/**
 * Created by Jonathan Correia de Barros on 31/01/17.
 *
 */
public class FilaTest extends TestCase {
    public void testAdd() throws Exception {
        Fila fila = new Fila(-1);

        fila.add(1);
        assertEquals(1, fila.size());

        int i = 0;
        while(i < 9) {
            fila.add(1);
            i++;
        }
        fila.add(1);
        assertEquals(10, fila.size());
    }

    public void testRemove() throws Exception {
        Fila fila = new Fila(-1);

        fila.add(1);
        assertEquals(1, fila.size());

        assertEquals(0, fila.remove());
    }

    public void testPrint() throws Exception {
        Fila fila = new Fila(-1);

        fila.add(1);
        fila.add(5);
        fila.print();
    }

    public void testElement() throws Exception {
        Fila fila = new Fila(-1);

        fila.add(1);
        fila.add(5);
        assertEquals(1, fila.element());
    }

}
