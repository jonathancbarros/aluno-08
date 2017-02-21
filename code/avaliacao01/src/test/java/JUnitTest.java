import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.LinkedList;

public class JUnitTest {

    @Test
    public void testSameArrays() throws Exception {
        int [] array1 = {1,2,3};
        int [] array2 = {1,2,3};
        assertEquals(true, Arrays.equals(array1, array2));
    }

    @Test
    public void testSameObjects() throws Exception {
        MyClass object1 = new MyClass();
        AnotherClass object2 = new AnotherClass();

        assertEquals(false, (object1.getClass()).equals(object2.getClass()));
    }

    @Test
    public void testDifferentObjects() throws Exception {
        MyClass object1 = new MyClass();
        MyClass object2 = new MyClass();

        assertEquals(true, (object1.getClass()).equals(object2.getClass()));
    }

    @Test
    public void testSubString() throws Exception {
        assertEquals(true, "computação".contains("o") && "computação".contains("ta"));
    }

    @Test
    public void testList() throws Exception {
        LinkedList<String> list = new LinkedList();

        list.addFirst("um");
        list.addLast("dois");
        list.addLast("três");
        list.addLast("quatro");

        assertEquals(true, list.contains("dois") && list.contains("quatro"));
    }

    @Test
    public void testComputacao() throws Exception {
        assertEquals(true, "computação".equals("computação") && "computação".startsWith("comput"));
    }

    @Test
    public void testInstituto() throws Exception {
        assertEquals(false, "instituto".equals("matemática") && "instituto".equals("física"));
    }

    @Test
    public void testInstituto2() throws Exception {
        assertEquals(true, "instituto".equals("matemática") || "instituto".equals("instituto"));
    }

    @Test
    public void testNumber7() throws Exception {
        assertEquals(true, 7 != 3 && 7 != 4);
    }

    @Test
    public void testObjects() throws Exception {
        Object obj1 = new Object();
        Object obj2 = new Object();

        assertEquals(false, obj1 == obj2);
    }

    @Test
    public void testListWithA() throws Exception {
        LinkedList<String> list = new LinkedList();

        list.addFirst("amanhã");
        list.addLast("agora");
        list.addLast("quatro");

        boolean [] results = new boolean[3];
        for (int i = 0; i < 3; i++) {
            results[i] = list.get(i).contains("a");
        }

        boolean [] expected = new boolean[] {true, true, true};
        assertArrayEquals(expected, results);
    }


}
