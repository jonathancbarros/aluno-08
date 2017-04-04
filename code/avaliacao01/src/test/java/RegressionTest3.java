import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        Fila fila1 = new Fila((int) '4');
        fila1.add(97);
        boolean b4 = fila1.empty();
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        java.lang.String str6 = fila1.print();
        int i7 = fila1.size();
        fila1.add(0);
        int i10 = fila1.remove();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
        Fila fila1 = new Fila(97);
        int i2 = fila1.size();
        fila1.add(100);
        fila1.add(3);
        int i7 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        fila1.add(0);
        int i13 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        fila1.add((int) (byte) 0);
        fila1.add((int) (short) -1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        fila1.add(10);
        fila1.add((int) (byte) 0);
        java.lang.String str14 = fila1.print();
        try {
            int i15 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1, 10, 0" + "'", str14.equals("1, 10, 0"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        java.lang.String str6 = fila1.print();
        int i7 = fila1.getCapacidade();
        fila1.add(2);
        fila1.add((int) (short) 0);
        int i12 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        fila1.add(97);
        java.lang.String str9 = fila1.print();
        int i10 = fila1.size();
        int i11 = fila1.size();
        try {
            java.lang.String str12 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32, 97" + "'", str9.equals("32, 97"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        boolean b14 = fila1.empty();
        int i15 = fila1.size();
        int i16 = fila1.size();
        boolean b17 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.size();
        fila1.add((int) (byte) 0);
        boolean b7 = fila1.empty();
        int i8 = fila1.element();
        java.lang.String str9 = fila1.print();
        fila1.add((int) 'a');
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "52, 0" + "'", str9.equals("52, 0"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        fila1.add(35);
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        java.lang.String str11 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "35" + "'", str11.equals("35"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        fila1.add((int) (byte) 0);
        int i13 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((int) (byte) -1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        int i7 = fila1.size();
        try {
            java.lang.String str8 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 0);
        boolean b5 = fila1.empty();
        boolean b6 = fila1.empty();
        fila1.add((int) (short) -1);
        int i9 = fila1.size();
        java.lang.String str10 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0, -1" + "'", str10.equals("0, -1"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        fila1.add((int) ' ');
        boolean b9 = fila1.empty();
        int i10 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        int i10 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        int i4 = fila1.element();
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        fila1.add((int) ' ');
        fila1.add(3);
        java.lang.String str11 = fila1.print();
        boolean b12 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10, 32, 3" + "'", str11.equals("10, 32, 3"));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.element();
        int i8 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        int i13 = fila1.size();
        boolean b14 = fila1.empty();
        java.lang.String str15 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "52, 100" + "'", str15.equals("52, 100"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        int i13 = fila1.size();
        int i14 = fila1.remove();
        try {
            java.lang.String str15 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.size();
        boolean b12 = fila1.empty();
        java.lang.String str13 = fila1.print();
        int i14 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "35" + "'", str13.equals("35"));
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 1);
        int i5 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
        Fila fila1 = new Fila(97);
        int i2 = fila1.getCapacidade();
        fila1.add((int) '#');
        boolean b5 = fila1.empty();
        int i6 = fila1.remove();
        int i7 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 97);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 35);
        org.junit.Assert.assertTrue(i7 == 97);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        fila1.add((int) (short) 0);
        int i8 = fila1.remove();
        boolean b9 = fila1.empty();
        int i10 = fila1.remove();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        fila1.add(35);
        int i10 = fila1.getCapacidade();
        fila1.add((int) (short) 1);
        int i13 = fila1.getCapacidade();
        int i14 = fila1.remove();
        fila1.add(0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
        Fila fila1 = new Fila((int) (short) 10);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.size();
        fila1.add(100);
        int i7 = fila1.element();
        int i8 = fila1.remove();
        fila1.add(0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        fila1.add((int) (short) 1);
        int i12 = fila1.element();
        fila1.add((int) (byte) 10);
        java.lang.String str15 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "1, 1, 10" + "'", str15.equals("1, 1, 10"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) '#');
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        boolean b8 = fila1.empty();
        fila1.add(4);
        int i11 = fila1.size();
        java.lang.String str12 = fila1.print();
        fila1.add((int) ' ');
        java.lang.String str15 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 35);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35" + "'", str7.equals("35"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4" + "'", str12.equals("4"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "32" + "'", str15.equals("32"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        fila1.add((int) (byte) 10);
        int i9 = fila1.size();
        int i10 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i9 == 3);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        boolean b3 = fila1.empty();
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        fila1.add(97);
        int i8 = fila1.size();
        fila1.add(10);
        int i11 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        fila1.add((int) (short) 0);
        int i16 = fila1.remove();
        int i17 = fila1.remove();
        java.lang.String str18 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 32);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0" + "'", str18.equals("0"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.size();
        fila1.add((int) ' ');
        java.lang.String str9 = fila1.print();
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "97, 32" + "'", str9.equals("97, 32"));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        Fila fila1 = new Fila(35);
        fila1.add((int) (short) 0);
        int i4 = fila1.remove();
        boolean b5 = fila1.empty();
        try {
            java.lang.String str6 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add(3);
        java.lang.String str8 = fila1.print();
        fila1.add(35);
        int i11 = fila1.remove();
        try {
            int i12 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3" + "'", str8.equals("3"));
        org.junit.Assert.assertTrue(i11 == 35);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        java.lang.String str10 = fila1.print();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        int i13 = fila1.getCapacidade();
        boolean b14 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 0);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        fila1.add(4);
        fila1.add((int) (byte) 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 0);
        int i10 = fila1.element();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        Fila fila1 = new Fila((int) (short) 10);
        boolean b2 = fila1.empty();
        fila1.add((int) (short) -1);
        int i5 = fila1.size();
        fila1.add(0);
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        int i10 = fila1.remove();
        int i11 = fila1.size();
        fila1.add(4);
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
        Fila fila1 = new Fila((int) '#');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.size();
        int i7 = fila1.remove();
        boolean b8 = fila1.empty();
        boolean b9 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        boolean b8 = fila1.empty();
        fila1.add(35);
        int i11 = fila1.getCapacidade();
        boolean b12 = fila1.empty();
        fila1.add((int) (short) 10);
        int i15 = fila1.size();
        boolean b16 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 3);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.element();
        int i13 = fila1.getCapacidade();
        boolean b14 = fila1.empty();
        int i15 = fila1.size();
        java.lang.String str16 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "52" + "'", str16.equals("52"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) '#');
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        boolean b8 = fila1.empty();
        fila1.add(4);
        int i11 = fila1.size();
        java.lang.String str12 = fila1.print();
        int i13 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 35);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35" + "'", str7.equals("35"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4" + "'", str12.equals("4"));
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        int i6 = fila1.size();
        java.lang.String str7 = fila1.print();
        boolean b8 = fila1.empty();
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "97, 32" + "'", str7.equals("97, 32"));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.size();
        fila1.add(35);
        fila1.add(3);
        int i9 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i9 == 35);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.element();
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.remove();
        fila1.add((int) (short) 100);
        java.lang.String str11 = fila1.print();
        int i12 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "32, 100" + "'", str11.equals("32, 100"));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        boolean b6 = fila1.empty();
        int i7 = fila1.remove();
        int i8 = fila1.element();
        fila1.add(3);
        int i11 = fila1.element();
        boolean b12 = fila1.empty();
        int i13 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(i11 == 32);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.remove();
        boolean b6 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        fila1.add(35);
        int i7 = fila1.size();
        fila1.add(32);
        boolean b10 = fila1.empty();
        int i11 = fila1.remove();
        int i12 = fila1.size();
        boolean b13 = fila1.empty();
        boolean b14 = fila1.empty();
        int i15 = fila1.element();
        boolean b16 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 35);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        int i8 = fila1.element();
        int i9 = fila1.remove();
        java.lang.String str10 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-1" + "'", str10.equals("-1"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add(0);
        int i11 = fila1.element();
        int i12 = fila1.remove();
        int i13 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        try {
            int i11 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        fila1.add((int) (short) 0);
        int i11 = fila1.remove();
        fila1.add((int) '#');
        int i14 = fila1.element();
        int i15 = fila1.size();
        int i16 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i14 == 35);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
        Fila fila1 = new Fila(32);
        fila1.add((int) (short) 1);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.remove();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        Fila fila1 = new Fila(2);
        int i2 = fila1.size();
        try {
            int i3 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        fila1.add((int) (short) 10);
        boolean b7 = fila1.empty();
        int i8 = fila1.remove();
        int i9 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.size();
        fila1.add(35);
        int i7 = fila1.getCapacidade();
        fila1.add(3);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        int i8 = fila1.remove();
        try {
            int i9 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.element();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        java.lang.String str11 = fila1.print();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0, 32" + "'", str11.equals("0, 32"));
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        int i11 = fila1.element();
        int i12 = fila1.remove();
        int i13 = fila1.getCapacidade();
        int i14 = fila1.size();
        try {
            int i15 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
        Fila fila1 = new Fila(35);
        fila1.add((int) (short) 0);
        int i4 = fila1.remove();
        int i5 = fila1.getCapacidade();
        fila1.add((-1));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 35);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add((-1));
        boolean b13 = fila1.empty();
        int i14 = fila1.element();
        int i15 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        fila1.add(35);
        int i7 = fila1.size();
        fila1.add(32);
        boolean b10 = fila1.empty();
        fila1.add((int) (byte) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        boolean b11 = fila1.empty();
        boolean b12 = fila1.empty();
        try {
            java.lang.String str13 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.remove();
        fila1.add((int) (short) 10);
        int i11 = fila1.size();
        int i12 = fila1.remove();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add(3);
        java.lang.String str8 = fila1.print();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.size();
        fila1.add((int) (byte) 100);
        java.lang.String str13 = fila1.print();
        int i14 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3" + "'", str8.equals("3"));
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "100" + "'", str13.equals("100"));
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        boolean b5 = fila1.empty();
        int i6 = fila1.getCapacidade();
        fila1.add((int) (byte) 1);
        boolean b9 = fila1.empty();
        fila1.add(97);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        int i7 = fila1.size();
        fila1.add(0);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add(1);
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        int i9 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add(3);
        java.lang.String str8 = fila1.print();
        int i9 = fila1.getCapacidade();
        fila1.add(35);
        int i12 = fila1.size();
        boolean b13 = fila1.empty();
        java.lang.String str14 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3" + "'", str8.equals("3"));
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "35" + "'", str14.equals("35"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        java.lang.String str4 = fila1.print();
        fila1.add((int) (short) 100);
        java.lang.String str7 = fila1.print();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "97" + "'", str4.equals("97"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100" + "'", str7.equals("100"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        boolean b6 = fila1.empty();
        int i7 = fila1.remove();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.size();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        fila1.add((int) (short) 0);
        int i11 = fila1.size();
        int i12 = fila1.getCapacidade();
        java.lang.String str13 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1, 0" + "'", str13.equals("1, 0"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        try {
            int i10 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.element();
        int i6 = fila1.size();
        int i7 = fila1.element();
        int i8 = fila1.size();
        int i9 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 32);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 32);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.getCapacidade();
        java.lang.String str12 = fila1.print();
        boolean b13 = fila1.empty();
        boolean b14 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35" + "'", str12.equals("35"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        java.lang.String str10 = fila1.print();
        int i11 = fila1.size();
        int i12 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10, -1, 35" + "'", str10.equals("10, -1, 35"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(2);
        int i6 = fila1.remove();
        try {
            java.lang.String str7 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
        Fila fila1 = new Fila((int) ' ');
        int i2 = fila1.getCapacidade();
        boolean b3 = fila1.empty();
        int i4 = fila1.size();
        boolean b5 = fila1.empty();
        int i6 = fila1.getCapacidade();
        try {
            java.lang.String str7 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 32);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        fila1.add((int) (short) 0);
        int i16 = fila1.remove();
        int i17 = fila1.getCapacidade();
        java.lang.String str18 = fila1.print();
        fila1.add((int) (byte) 1);
        boolean b21 = fila1.empty();
        int i22 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "32, 0" + "'", str18.equals("32, 0"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add((int) (short) 100);
        int i6 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        boolean b7 = fila1.empty();
        boolean b8 = fila1.empty();
        java.lang.String str9 = fila1.print();
        fila1.add((int) '4');
        int i12 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10, -1" + "'", str9.equals("10, -1"));
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        boolean b6 = fila1.empty();
        int i7 = fila1.remove();
        int i8 = fila1.element();
        fila1.add(3);
        boolean b11 = fila1.empty();
        int i12 = fila1.element();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 32);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.getCapacidade();
        java.lang.String str12 = fila1.print();
        try {
            java.lang.String str13 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35" + "'", str12.equals("35"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        java.lang.String str5 = fila1.print();
        try {
            int i6 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "52" + "'", str5.equals("52"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add((-1));
        boolean b13 = fila1.empty();
        int i14 = fila1.size();
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        java.lang.String str6 = fila1.print();
        int i7 = fila1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add(3);
        fila1.add((-1));
        int i10 = fila1.element();
        boolean b11 = fila1.empty();
        boolean b12 = fila1.empty();
        int i13 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        java.lang.String str10 = fila1.print();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.getCapacidade();
        try {
            java.lang.String str14 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        boolean b8 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(2);
        java.lang.String str6 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2" + "'", str6.equals("2"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add(35);
        boolean b11 = fila1.empty();
        fila1.add((int) '#');
        int i14 = fila1.size();
        int i15 = fila1.getCapacidade();
        int i16 = fila1.element();
        java.lang.String str17 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i16 == 35);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "35, 35" + "'", str17.equals("35, 35"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 1);
        int i5 = fila1.size();
        fila1.add(4);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(1);
        int i12 = fila1.element();
        int i13 = fila1.element();
        int i14 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        boolean b13 = fila1.empty();
        int i14 = fila1.remove();
        try {
            int i15 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.size();
        fila1.add((int) (byte) 0);
        boolean b7 = fila1.empty();
        boolean b8 = fila1.empty();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        int i8 = fila1.size();
        fila1.add(100);
        int i11 = fila1.remove();
        boolean b12 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        int i4 = fila1.element();
        boolean b5 = fila1.empty();
        int i6 = fila1.element();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        fila1.add((int) (short) 0);
        int i11 = fila1.remove();
        fila1.add((int) '#');
        int i14 = fila1.element();
        int i15 = fila1.size();
        boolean b16 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i14 == 35);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        int i10 = fila1.element();
        int i11 = fila1.remove();
        int i12 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i11 == 10);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        int i14 = fila1.getCapacidade();
        int i15 = fila1.getCapacidade();
        int i16 = fila1.size();
        int i17 = fila1.remove();
        int i18 = fila1.getCapacidade();
        int i19 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 32);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.remove();
        fila1.add((int) (byte) -1);
        int i8 = fila1.element();
        int i9 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        fila1.add((int) (short) 0);
        int i11 = fila1.remove();
        int i12 = fila1.getCapacidade();
        boolean b13 = fila1.empty();
        boolean b14 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        Fila fila1 = new Fila((int) (byte) 100);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) 0);
        int i7 = fila1.getCapacidade();
        fila1.add((-1));
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        boolean b12 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.size();
        fila1.add(0);
        int i12 = fila1.remove();
        try {
            int i13 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        fila1.add(35);
        java.lang.String str10 = fila1.print();
        int i11 = fila1.getCapacidade();
        boolean b12 = fila1.empty();
        fila1.add((int) (short) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        boolean b7 = fila1.empty();
        java.lang.String str8 = fila1.print();
        boolean b9 = fila1.empty();
        try {
            java.lang.String str10 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.element();
        fila1.add(2);
        java.lang.String str13 = fila1.print();
        int i14 = fila1.getCapacidade();
        int i15 = fila1.size();
        try {
            int i16 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "52, 2" + "'", str13.equals("52, 2"));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.size();
        boolean b12 = fila1.empty();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        int i5 = fila1.element();
        int i6 = fila1.element();
        fila1.add(0);
        int i9 = fila1.element();
        fila1.add(32);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
        Fila fila1 = new Fila((int) (short) 10);
        boolean b2 = fila1.empty();
        fila1.add((int) (short) -1);
        fila1.add((-1));
        fila1.add((int) (byte) -1);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        fila1.add((int) (short) 10);
        fila1.add((int) (byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        int i4 = fila1.getCapacidade();
        boolean b5 = fila1.empty();
        boolean b6 = fila1.empty();
        try {
            int i7 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.element();
        fila1.add((int) (byte) -1);
        java.lang.String str12 = fila1.print();
        try {
            int i13 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "52, -1" + "'", str12.equals("52, -1"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
        Fila fila1 = new Fila(97);
        int i2 = fila1.getCapacidade();
        fila1.add((int) '#');
        boolean b5 = fila1.empty();
        fila1.add(10);
        int i8 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 97);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 35);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(1);
        int i12 = fila1.remove();
        fila1.add(52);
        int i15 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        boolean b5 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 1);
        int i5 = fila1.element();
        boolean b6 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        fila1.add(35);
        int i7 = fila1.size();
        fila1.add(32);
        int i10 = fila1.size();
        int i11 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue(i11 == 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 1);
        int i5 = fila1.element();
        int i6 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.size();
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        try {
            int i8 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.size();
        fila1.add(35);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
        Fila fila1 = new Fila((int) (short) -1);
        int i2 = fila1.getCapacidade();
        boolean b3 = fila1.empty();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        try {
            int i6 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.element();
        int i12 = fila1.remove();
        fila1.add((int) (short) 100);
        int i15 = fila1.remove();
        try {
            java.lang.String str16 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 35);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.remove();
        int i14 = fila1.size();
        int i15 = fila1.size();
        java.lang.String str16 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "32" + "'", str16.equals("32"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        fila1.add((int) (short) 10);
        fila1.add((int) (byte) 1);
        int i9 = fila1.remove();
        int i10 = fila1.element();
        boolean b11 = fila1.empty();
        int i12 = fila1.getCapacidade();
        java.lang.String str13 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10, 1" + "'", str13.equals("10, 1"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        int i4 = fila1.getCapacidade();
        java.lang.String str5 = fila1.print();
        try {
            java.lang.String str6 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 35);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) (short) 100);
        java.lang.String str5 = fila1.print();
        try {
            java.lang.String str6 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
        Fila fila1 = new Fila(35);
        int i2 = fila1.getCapacidade();
        boolean b3 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 35);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.size();
        int i10 = fila1.getCapacidade();
        boolean b11 = fila1.empty();
        java.lang.String str12 = fila1.print();
        fila1.add((int) (byte) 1);
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "52" + "'", str12.equals("52"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        java.lang.String str10 = fila1.print();
        fila1.add(0);
        int i13 = fila1.size();
        int i14 = fila1.element();
        int i15 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add((-1));
        int i13 = fila1.remove();
        fila1.add(10);
        boolean b16 = fila1.empty();
        java.lang.String str17 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10" + "'", str17.equals("10"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        Fila fila1 = new Fila((int) (byte) 100);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.element();
        boolean b6 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        fila1.add((int) (byte) 1);
        int i11 = fila1.remove();
        fila1.add((int) ' ');
        int i14 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i14 == 32);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
        Fila fila1 = new Fila((int) ' ');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.getCapacidade();
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 32);
        org.junit.Assert.assertTrue(i3 == 32);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        fila1.add(35);
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        int i11 = fila1.element();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 35);
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        int i9 = fila1.size();
        int i10 = fila1.getCapacidade();
        boolean b11 = fila1.empty();
        int i12 = fila1.getCapacidade();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        Fila fila1 = new Fila(4);
        try {
            int i2 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        boolean b11 = fila1.empty();
        int i12 = fila1.element();
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        int i7 = fila1.element();
        boolean b8 = fila1.empty();
        fila1.add((int) (short) 100);
        int i11 = fila1.getCapacidade();
        int i12 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 32);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 32);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        int i4 = fila1.getCapacidade();
        boolean b5 = fila1.empty();
        fila1.add(97);
        int i8 = fila1.size();
        int i9 = fila1.remove();
        try {
            int i10 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 97);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        fila1.add(35);
        java.lang.String str10 = fila1.print();
        int i11 = fila1.getCapacidade();
        fila1.add(1);
        boolean b14 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        java.lang.String str10 = fila1.print();
        try {
            int i11 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10, -1, 35" + "'", str10.equals("10, -1, 35"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        boolean b8 = fila1.empty();
        java.lang.String str9 = fila1.print();
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        java.lang.String str6 = fila1.print();
        int i7 = fila1.getCapacidade();
        fila1.add(2);
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
        Fila fila1 = new Fila((int) '#');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        fila1.add(52);
        fila1.add((int) (byte) 10);
        int i8 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.remove();
        fila1.add((int) (short) 10);
        int i11 = fila1.size();
        int i12 = fila1.remove();
        try {
            int i13 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.remove();
        try {
            int i9 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        int i10 = fila1.getCapacidade();
        fila1.add((int) '4');
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.size();
        try {
            int i5 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        boolean b5 = fila1.empty();
        fila1.add(10);
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        fila1.add(100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        Fila fila1 = new Fila((int) (short) -1);
        fila1.add((int) (short) 10);
        int i4 = fila1.size();
        fila1.add(0);
        java.lang.String str7 = fila1.print();
        try {
            int i8 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10, 0" + "'", str7.equals("10, 0"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test165");
        Fila fila1 = new Fila((int) (short) 10);
        boolean b2 = fila1.empty();
        fila1.add((int) (short) -1);
        int i5 = fila1.size();
        fila1.add(0);
        int i8 = fila1.size();
        int i9 = fila1.size();
        int i10 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test166");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.remove();
        int i11 = fila1.getCapacidade();
        fila1.add(97);
        java.lang.String str14 = fila1.print();
        fila1.add((int) '#');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "97" + "'", str14.equals("97"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) '#');
        boolean b6 = fila1.empty();
        java.lang.String str7 = fila1.print();
        boolean b8 = fila1.empty();
        int i9 = fila1.size();
        int i10 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35" + "'", str7.equals("35"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        fila1.add(0);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.getCapacidade();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test169");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        int i9 = fila1.getCapacidade();
        fila1.add(3);
        boolean b12 = fila1.empty();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
        Fila fila1 = new Fila((int) (byte) -1);
        fila1.add((int) (byte) 100);
        fila1.add((-1));
        int i6 = fila1.remove();
        fila1.add(0);
        org.junit.Assert.assertTrue(i6 == 100);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        int i11 = fila1.element();
        int i12 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test172");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        int i7 = fila1.element();
        int i8 = fila1.remove();
        boolean b9 = fila1.empty();
        fila1.add(0);
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 32);
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0" + "'", str12.equals("0"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add(3);
        fila1.add((-1));
        int i10 = fila1.element();
        boolean b11 = fila1.empty();
        int i12 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test174");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        int i9 = fila1.size();
        int i10 = fila1.size();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        int i13 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test175");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        java.lang.String str6 = fila1.print();
        int i7 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32" + "'", str6.equals("32"));
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        fila1.add((int) (short) 10);
        int i15 = fila1.getCapacidade();
        fila1.add(10);
        fila1.add((int) (byte) 100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        fila1.add((int) (short) 100);
        java.lang.String str10 = fila1.print();
        fila1.add((int) (short) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0, 100" + "'", str10.equals("0, 100"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.size();
        int i7 = fila1.element();
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        Fila fila1 = new Fila((int) '4');
        fila1.add((int) (short) 10);
        fila1.add(10);
        int i6 = fila1.element();
        org.junit.Assert.assertTrue(i6 == 10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test180");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        fila1.add(3);
        boolean b8 = fila1.empty();
        java.lang.String str9 = fila1.print();
        int i10 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32, 3" + "'", str9.equals("32, 3"));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test181");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        try {
            java.lang.String str3 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) ' ');
        int i6 = fila1.size();
        int i7 = fila1.remove();
        try {
            int i8 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 32);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test183");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.element();
        int i13 = fila1.size();
        int i14 = fila1.element();
        int i15 = fila1.size();
        fila1.add(0);
        int i18 = fila1.remove();
        fila1.add(97);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 52);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test184");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) 'a');
        fila1.add(0);
        int i7 = fila1.remove();
        fila1.add(3);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i7 == 97);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test185");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        java.lang.String str4 = fila1.print();
        int i5 = fila1.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test186");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.getCapacidade();
        boolean b11 = fila1.empty();
        fila1.add(1);
        boolean b14 = fila1.empty();
        int i15 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        int i11 = fila1.element();
        int i12 = fila1.remove();
        int i13 = fila1.getCapacidade();
        fila1.add((int) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test188");
        Fila fila1 = new Fila((int) (short) -1);
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        fila1.add(97);
        int i6 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test189");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) ' ');
        fila1.add((int) 'a');
        int i8 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 32);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        int i8 = fila1.element();
        int i9 = fila1.size();
        java.lang.String str10 = fila1.print();
        fila1.add(3);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10, -1" + "'", str10.equals("10, -1"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
        Fila fila1 = new Fila(3);
        int i2 = fila1.getCapacidade();
        try {
            int i3 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
        Fila fila1 = new Fila((int) (short) 10);
        int i2 = fila1.size();
        fila1.add((int) '#');
        boolean b5 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        int i11 = fila1.element();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.remove();
        fila1.add((int) (short) 10);
        int i11 = fila1.size();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.element();
        int i13 = fila1.getCapacidade();
        boolean b14 = fila1.empty();
        int i15 = fila1.size();
        boolean b16 = fila1.empty();
        java.lang.String str17 = fila1.print();
        int i18 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "52" + "'", str17.equals("52"));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test196");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        fila1.add((int) (short) 0);
        int i8 = fila1.remove();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        boolean b5 = fila1.empty();
        int i6 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 1);
        int i5 = fila1.element();
        java.lang.String str6 = fila1.print();
        int i7 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        boolean b10 = fila1.empty();
        boolean b11 = fila1.empty();
        boolean b12 = fila1.empty();
        int i13 = fila1.size();
        boolean b14 = fila1.empty();
        java.lang.String str15 = fila1.print();
        fila1.add((int) '#');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-1, 10, 0" + "'", str15.equals("-1, 10, 0"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test201");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.element();
        fila1.add((int) (byte) 100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.getCapacidade();
        fila1.add(10);
        fila1.add(4);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test203");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(32);
        fila1.add(1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test204");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add(32);
        fila1.add((int) '#');
        java.lang.String str8 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32, 35" + "'", str8.equals("32, 35"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test205");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add((-1));
        int i13 = fila1.remove();
        fila1.add(10);
        int i16 = fila1.size();
        boolean b17 = fila1.empty();
        int i18 = fila1.remove();
        try {
            int i19 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(100);
        boolean b12 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test207");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(1);
        int i12 = fila1.element();
        int i13 = fila1.element();
        fila1.add(97);
        int i16 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test208");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        int i4 = fila1.remove();
        fila1.add(100);
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test209");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        java.lang.String str10 = fila1.print();
        try {
            int i11 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "52" + "'", str10.equals("52"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        int i10 = fila1.remove();
        boolean b11 = fila1.empty();
        fila1.add(10);
        boolean b14 = fila1.empty();
        int i15 = fila1.remove();
        int i16 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test211");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) ' ');
        int i6 = fila1.size();
        int i7 = fila1.size();
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        try {
            int i11 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32" + "'", str8.equals("32"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add(35);
        boolean b11 = fila1.empty();
        int i12 = fila1.element();
        int i13 = fila1.element();
        int i14 = fila1.element();
        int i15 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue(i13 == 35);
        org.junit.Assert.assertTrue(i14 == 35);
        org.junit.Assert.assertTrue(i15 == 35);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test214");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        fila1.add(35);
        boolean b10 = fila1.empty();
        int i11 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 0);
        boolean b5 = fila1.empty();
        boolean b6 = fila1.empty();
        fila1.add((int) (short) -1);
        int i9 = fila1.getCapacidade();
        fila1.add((-1));
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        fila1.add((int) (short) 10);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.remove();
        int i8 = fila1.element();
        fila1.add(97);
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test217");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.remove();
        int i12 = fila1.element();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add(0);
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        fila1.add((int) (short) 10);
        boolean b7 = fila1.empty();
        int i8 = fila1.remove();
        int i9 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        Fila fila1 = new Fila((int) (short) -1);
        int i2 = fila1.getCapacidade();
        boolean b3 = fila1.empty();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        try {
            int i6 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test221");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.element();
        fila1.add((int) ' ');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test222");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        fila1.add(97);
        int i9 = fila1.getCapacidade();
        fila1.add((int) (short) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        int i10 = fila1.size();
        java.lang.String str11 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1, 10, 0" + "'", str11.equals("-1, 10, 0"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test224");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        java.lang.String str7 = fila1.print();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "97" + "'", str7.equals("97"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test225");
        Fila fila1 = new Fila(32);
        fila1.add((int) (short) 1);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add((int) (short) 10);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 32);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test226");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        fila1.add(1);
        int i12 = fila1.remove();
        java.lang.String str13 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1" + "'", str13.equals("1"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test227");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        int i14 = fila1.getCapacidade();
        int i15 = fila1.size();
        int i16 = fila1.element();
        int i17 = fila1.remove();
        int i18 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 32);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test228");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test229");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) -1);
        boolean b10 = fila1.empty();
        int i11 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test230");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        fila1.add(35);
        int i7 = fila1.size();
        fila1.add(32);
        boolean b10 = fila1.empty();
        int i11 = fila1.getCapacidade();
        fila1.add(100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test231");
        Fila fila1 = new Fila((int) (short) 10);
        boolean b2 = fila1.empty();
        fila1.add((int) (byte) 100);
        java.lang.String str5 = fila1.print();
        int i6 = fila1.size();
        int i7 = fila1.size();
        fila1.add((int) (short) 100);
        int i10 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test232");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        fila1.add(35);
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.remove();
        fila1.add((-1));
        int i14 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 35);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test233");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        boolean b11 = fila1.empty();
        int i12 = fila1.size();
        boolean b13 = fila1.empty();
        int i14 = fila1.element();
        java.lang.String str15 = fila1.print();
        try {
            int i16 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 35);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "35" + "'", str15.equals("35"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test234");
        Fila fila1 = new Fila((int) (byte) 1);
        fila1.add((int) (byte) 100);
        int i4 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test235");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        java.lang.String str4 = fila1.print();
        fila1.add((-1));
        int i7 = fila1.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "97" + "'", str4.equals("97"));
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test236");
        Fila fila1 = new Fila(97);
        int i2 = fila1.size();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.size();
        fila1.add(100);
        int i8 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test237");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 1);
        int i5 = fila1.size();
        boolean b6 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test238");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        boolean b11 = fila1.empty();
        int i12 = fila1.size();
        boolean b13 = fila1.empty();
        int i14 = fila1.remove();
        boolean b15 = fila1.empty();
        fila1.add(0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 35);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test239");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.remove();
        fila1.add(52);
        java.lang.String str8 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test240");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        fila1.add((int) (byte) 1);
        int i12 = fila1.size();
        int i13 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test241");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        fila1.add((int) '#');
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test242");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        try {
            int i8 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "97" + "'", str7.equals("97"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test243");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) '#');
        boolean b6 = fila1.empty();
        int i7 = fila1.element();
        int i8 = fila1.element();
        java.lang.String str9 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 35);
        org.junit.Assert.assertTrue(i8 == 35);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "35" + "'", str9.equals("35"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test244");
        Fila fila1 = new Fila(97);
        int i2 = fila1.size();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.size();
        boolean b6 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test245");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test246");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        int i4 = fila1.size();
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        try {
            int i8 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test247");
        Fila fila1 = new Fila((int) ' ');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.getCapacidade();
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        try {
            java.lang.String str6 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 32);
        org.junit.Assert.assertTrue(i3 == 32);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test248");
        Fila fila1 = new Fila((int) (short) 10);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.size();
        fila1.add(100);
        int i7 = fila1.remove();
        boolean b8 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test249");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        int i5 = fila1.remove();
        int i6 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test250");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) (short) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test251");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add(1);
        boolean b5 = fila1.empty();
        int i6 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test252");
        Fila fila1 = new Fila((int) (short) -1);
        fila1.add((int) (short) 10);
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.remove();
        try {
            int i7 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test253");
        Fila fila1 = new Fila((int) '#');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add(35);
        org.junit.Assert.assertTrue(i2 == 35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test254");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(32);
        int i12 = fila1.element();
        int i13 = fila1.size();
        int i14 = fila1.element();
        int i15 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i12 == 32);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 32);
        org.junit.Assert.assertTrue(i15 == 32);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test255");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        int i3 = fila1.size();
        fila1.add((int) (short) 1);
        int i6 = fila1.remove();
        int i7 = fila1.size();
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test256");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        fila1.add(0);
        int i10 = fila1.getCapacidade();
        java.lang.String str11 = fila1.print();
        try {
            int i12 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "52, 0" + "'", str11.equals("52, 0"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test257");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) ' ');
        int i6 = fila1.size();
        int i7 = fila1.remove();
        boolean b8 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 32);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test258");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.getCapacidade();
        int i6 = fila1.remove();
        int i7 = fila1.getCapacidade();
        boolean b8 = fila1.empty();
        try {
            int i9 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test259");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        int i4 = fila1.element();
        int i5 = fila1.size();
        int i6 = fila1.size();
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test260");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        int i10 = fila1.getCapacidade();
        fila1.add((int) '4');
        int i13 = fila1.size();
        fila1.add((int) (short) -1);
        fila1.add(32);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test261");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        int i14 = fila1.getCapacidade();
        int i15 = fila1.getCapacidade();
        int i16 = fila1.remove();
        fila1.add(32);
        int i19 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i19 == 32);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test262");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.element();
        int i9 = fila1.size();
        int i10 = fila1.remove();
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test263");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.remove();
        int i11 = fila1.getCapacidade();
        fila1.add(97);
        int i14 = fila1.getCapacidade();
        java.lang.String str15 = fila1.print();
        boolean b16 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "97" + "'", str15.equals("97"));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test264");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.element();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        java.lang.String str11 = fila1.print();
        int i12 = fila1.size();
        fila1.add((int) (short) 100);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0, 32" + "'", str11.equals("0, 32"));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test265");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        fila1.add(97);
        java.lang.String str11 = fila1.print();
        fila1.add((int) '#');
        int i14 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "97" + "'", str11.equals("97"));
        org.junit.Assert.assertTrue(i14 == 35);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test266");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        int i4 = fila1.getCapacidade();
        boolean b5 = fila1.empty();
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        java.lang.String str9 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "97" + "'", str9.equals("97"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test267");
        Fila fila1 = new Fila((int) (short) 10);
        int i2 = fila1.size();
        int i3 = fila1.size();
        try {
            java.lang.String str4 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test268");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        int i10 = fila1.getCapacidade();
        fila1.add((int) ' ');
        int i13 = fila1.getCapacidade();
        int i14 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test269");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.remove();
        fila1.add((int) (short) 10);
        int i11 = fila1.element();
        int i12 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 32);
        org.junit.Assert.assertTrue(i12 == 32);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test270");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        fila1.add((int) (byte) 10);
        int i9 = fila1.element();
        java.lang.String str10 = fila1.print();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10, -1, 10" + "'", str10.equals("10, -1, 10"));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test271");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        fila1.add(3);
        int i8 = fila1.size();
        int i9 = fila1.element();
        int i10 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 32);
        org.junit.Assert.assertTrue(i10 == 32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test272");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.element();
        int i13 = fila1.getCapacidade();
        int i14 = fila1.element();
        boolean b15 = fila1.empty();
        java.lang.String str16 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "52" + "'", str16.equals("52"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test273");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        fila1.add((int) (short) 0);
        int i16 = fila1.getCapacidade();
        fila1.add(100);
        int i19 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test274");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (byte) -1);
        int i6 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test275");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        boolean b4 = fila1.empty();
        fila1.add((int) (short) 1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test276");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.element();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        java.lang.String str11 = fila1.print();
        boolean b12 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0, 32" + "'", str11.equals("0, 32"));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test277");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        fila1.add((int) (short) 0);
        int i16 = fila1.remove();
        fila1.add((int) '4');
        int i19 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i19 == 3);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test278");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        fila1.add((int) (short) 0);
        int i16 = fila1.element();
        int i17 = fila1.remove();
        boolean b18 = fila1.empty();
        int i19 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 2);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test279");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.remove();
        int i7 = fila1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i6 == 52);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test280");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) ' ');
        int i6 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i9 = fila1.size();
        int i10 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 32);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test281");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.remove();
        int i11 = fila1.getCapacidade();
        fila1.add(97);
        fila1.add((int) (byte) 10);
        int i16 = fila1.remove();
        int i17 = fila1.size();
        int i18 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i18 == 97);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test282");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 0);
        boolean b5 = fila1.empty();
        boolean b6 = fila1.empty();
        fila1.add((int) (short) -1);
        int i9 = fila1.getCapacidade();
        java.lang.String str10 = fila1.print();
        fila1.add((int) '#');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0, -1" + "'", str10.equals("0, -1"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test283");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        int i10 = fila1.remove();
        int i11 = fila1.element();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.size();
        fila1.add(52);
        int i16 = fila1.remove();
        int i17 = fila1.size();
        boolean b18 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test284");
        Fila fila1 = new Fila(0);
        int i2 = fila1.getCapacidade();
        int i3 = fila1.getCapacidade();
        try {
            int i4 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i3 == 10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test285");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        int i7 = fila1.size();
        java.lang.String str8 = fila1.print();
        int i9 = fila1.getCapacidade();
        try {
            java.lang.String str10 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32" + "'", str8.equals("32"));
        org.junit.Assert.assertTrue(i9 == 97);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test286");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) 'a');
        fila1.add((int) (byte) 1);
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        java.lang.String str9 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "97, 1" + "'", str9.equals("97, 1"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test287");
        Fila fila1 = new Fila(3);
        fila1.add(0);
        int i4 = fila1.size();
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test288");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add(32);
        int i6 = fila1.remove();
        int i7 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 32);
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test289");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.element();
        int i8 = fila1.element();
        java.lang.String str9 = fila1.print();
        try {
            int i10 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "97" + "'", str9.equals("97"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test290");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        boolean b5 = fila1.empty();
        fila1.add(4);
        int i8 = fila1.size();
        int i9 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 100);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test291");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        fila1.add(10);
        int i14 = fila1.getCapacidade();
        boolean b15 = fila1.empty();
        int i16 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 97);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test292");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        int i4 = fila1.size();
        try {
            java.lang.String str5 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test293");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        fila1.add((int) (short) 0);
        int i16 = fila1.element();
        boolean b17 = fila1.empty();
        int i18 = fila1.element();
        fila1.add(10);
        int i21 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test294");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.size();
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35" + "'", str12.equals("35"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test295");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 35);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test296");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b8 = fila1.empty();
        int i9 = fila1.element();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test297");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        boolean b11 = fila1.empty();
        int i12 = fila1.size();
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test298");
        Fila fila1 = new Fila(97);
        int i2 = fila1.getCapacidade();
        try {
            int i3 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 97);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test299");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(2);
        fila1.add((int) (byte) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test300");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        fila1.add(10);
        fila1.add((int) (byte) 0);
        boolean b14 = fila1.empty();
        int i15 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test301");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        fila1.add((int) (short) 1);
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i8 == 32);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test302");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        fila1.add(0);
        int i10 = fila1.size();
        boolean b11 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test303");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        int i4 = fila1.element();
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test304");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        fila1.add(1);
        java.lang.String str10 = fila1.print();
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0, 1" + "'", str10.equals("0, 1"));
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test305");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) ' ');
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 32);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test306");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        try {
            int i7 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test307");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i6 == 52);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test308");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        fila1.add((int) (byte) 1);
        int i12 = fila1.getCapacidade();
        int i13 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test309");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.size();
        int i6 = fila1.remove();
        try {
            int i7 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test310");
        Fila fila1 = new Fila((int) (byte) 100);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) 0);
        int i7 = fila1.remove();
        int i8 = fila1.remove();
        try {
            int i9 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test311");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.size();
        int i8 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test312");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        fila1.add((int) (short) 10);
        fila1.add(0);
        int i17 = fila1.element();
        int i18 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 97);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test313");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.element();
        boolean b8 = fila1.empty();
        int i9 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test314");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.getCapacidade();
        boolean b11 = fila1.empty();
        fila1.add(97);
        int i14 = fila1.remove();
        boolean b15 = fila1.empty();
        fila1.add(35);
        int i18 = fila1.size();
        int i19 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(i19 == 97);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test315");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add(3);
        java.lang.String str8 = fila1.print();
        fila1.add((int) '#');
        java.lang.String str11 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3" + "'", str8.equals("3"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "35" + "'", str11.equals("35"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test316");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.element();
        int i10 = fila1.size();
        fila1.add((int) (byte) 100);
        int i13 = fila1.getCapacidade();
        boolean b14 = fila1.empty();
        boolean b15 = fila1.empty();
        int i16 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test317");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        fila1.add(35);
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        int i10 = fila1.element();
        int i11 = fila1.remove();
        try {
            java.lang.String str12 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertTrue(i10 == 35);
        org.junit.Assert.assertTrue(i11 == 35);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test318");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        fila1.add(0);
        java.lang.String str9 = fila1.print();
        int i10 = fila1.getCapacidade();
        boolean b11 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0, 0" + "'", str9.equals("0, 0"));
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test319");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        fila1.add(35);
        boolean b9 = fila1.empty();
        java.lang.String str10 = fila1.print();
        int i11 = fila1.size();
        fila1.add((int) (short) 10);
        int i14 = fila1.element();
        int i15 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test320");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        int i6 = fila1.size();
        int i7 = fila1.element();
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 97);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test321");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        fila1.add((int) 'a');
        fila1.add((int) ' ');
        fila1.add((int) '4');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test322");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add(3);
        java.lang.String str8 = fila1.print();
        int i9 = fila1.getCapacidade();
        fila1.add(35);
        int i12 = fila1.size();
        int i13 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3" + "'", str8.equals("3"));
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 35);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test323");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        int i7 = fila1.element();
        fila1.add((int) (byte) 10);
        java.lang.String str10 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 32);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "32, 10" + "'", str10.equals("32, 10"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test324");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 32);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test325");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(100);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100" + "'", str6.equals("100"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test326");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        java.lang.String str7 = fila1.print();
        fila1.add(100);
        java.lang.String str10 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100" + "'", str10.equals("100"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test327");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        fila1.add(35);
        int i10 = fila1.remove();
        fila1.add(2);
        int i13 = fila1.element();
        int i14 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 32);
        org.junit.Assert.assertTrue(i14 == 32);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test328");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        fila1.add((int) (short) 1);
        int i12 = fila1.size();
        java.lang.String str13 = fila1.print();
        boolean b14 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1, 1" + "'", str13.equals("1, 1"));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test329");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        fila1.add((int) (byte) -1);
        int i11 = fila1.element();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test330");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        boolean b11 = fila1.empty();
        int i12 = fila1.size();
        int i13 = fila1.getCapacidade();
        fila1.add(1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test331");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test332");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        int i9 = fila1.size();
        fila1.add((int) (byte) 100);
        int i12 = fila1.getCapacidade();
        int i13 = fila1.getCapacidade();
        int i14 = fila1.getCapacidade();
        int i15 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test333");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.element();
        boolean b11 = fila1.empty();
        int i12 = fila1.remove();
        fila1.add((int) (byte) 100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test334");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        fila1.add(35);
        int i10 = fila1.remove();
        int i11 = fila1.size();
        boolean b12 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test335");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.element();
        fila1.add(4);
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test336");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        java.lang.String str7 = fila1.print();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        fila1.add(32);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test337");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        fila1.add((int) (short) 1);
        int i12 = fila1.element();
        fila1.add((int) (byte) 10);
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test338");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        fila1.add(97);
        int i10 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test339");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) 'a');
        fila1.add(0);
        fila1.add(4);
        int i9 = fila1.size();
        int i10 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i9 == 3);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test340");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        boolean b5 = fila1.empty();
        fila1.add(4);
        boolean b8 = fila1.empty();
        int i9 = fila1.size();
        java.lang.String str10 = fila1.print();
        try {
            java.lang.String str11 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100, 4" + "'", str10.equals("100, 4"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test341");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test342");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add((-1));
        int i13 = fila1.remove();
        fila1.add(10);
        int i16 = fila1.size();
        int i17 = fila1.element();
        java.lang.String str18 = fila1.print();
        int i19 = fila1.getCapacidade();
        boolean b20 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 10);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10" + "'", str18.equals("10"));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test343");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        int i11 = fila1.element();
        int i12 = fila1.remove();
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test344");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.element();
        int i12 = fila1.remove();
        fila1.add((int) (short) 100);
        int i15 = fila1.remove();
        fila1.add(100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 35);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test345");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i9 = fila1.remove();
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i9 == 32);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test346");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        boolean b5 = fila1.empty();
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 32);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test347");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        int i5 = fila1.element();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        boolean b8 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test348");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) 'a');
        fila1.add(0);
        fila1.add(4);
        fila1.add(52);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test349");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.remove();
        int i8 = fila1.size();
        fila1.add(35);
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test350");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        int i6 = fila1.remove();
        int i7 = fila1.remove();
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 32);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test351");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.remove();
        int i9 = fila1.element();
        boolean b10 = fila1.empty();
        fila1.add((int) ' ');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 32);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test352");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.element();
        int i9 = fila1.size();
        int i10 = fila1.remove();
        int i11 = fila1.remove();
        int i12 = fila1.getCapacidade();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 32);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test353");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) 'a');
        fila1.add(0);
        fila1.add((int) (byte) 100);
        fila1.add((int) (byte) 100);
        boolean b11 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test354");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        boolean b8 = fila1.empty();
        int i9 = fila1.getCapacidade();
        try {
            int i10 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 97);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test355");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        int i10 = fila1.remove();
        try {
            int i11 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test356");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        java.lang.String str4 = fila1.print();
        try {
            int i5 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test357");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        boolean b6 = fila1.empty();
        int i7 = fila1.element();
        int i8 = fila1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test358");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        try {
            int i5 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test359");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 0);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add(2);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test360");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test361");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.size();
        int i10 = fila1.size();
        int i11 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 52);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test362");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test363");
        Fila fila1 = new Fila((int) (short) -1);
        int i2 = fila1.getCapacidade();
        boolean b3 = fila1.empty();
        boolean b4 = fila1.empty();
        fila1.add((int) (short) 0);
        java.lang.String str7 = fila1.print();
        int i8 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test364");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        fila1.add((int) '#');
        int i10 = fila1.element();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.remove();
        int i13 = fila1.element();
        int i14 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(i13 == 35);
        org.junit.Assert.assertTrue(i14 == 35);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test365");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.remove();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        fila1.add(97);
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i6 == 32);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test366");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.size();
        fila1.add((int) (byte) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test367");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        fila1.add(35);
        boolean b9 = fila1.empty();
        java.lang.String str10 = fila1.print();
        int i11 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add(35);
        fila1.add(4);
        int i18 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i18 == 10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test368");
        Fila fila1 = new Fila((int) ' ');
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 32);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test369");
        Fila fila1 = new Fila(32);
        fila1.add(32);
        int i4 = fila1.getCapacidade();
        int i5 = fila1.element();
        org.junit.Assert.assertTrue(i4 == 32);
        org.junit.Assert.assertTrue(i5 == 32);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test370");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        int i5 = fila1.element();
        java.lang.String str6 = fila1.print();
        try {
            int i7 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test371");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        boolean b5 = fila1.empty();
        int i6 = fila1.element();
        fila1.add(100);
        fila1.add(35);
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i11 == 10);
        org.junit.Assert.assertTrue(i12 == 3);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test372");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        java.lang.String str10 = fila1.print();
        fila1.add(0);
        int i13 = fila1.element();
        int i14 = fila1.remove();
        try {
            int i15 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test373");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add(35);
        boolean b11 = fila1.empty();
        int i12 = fila1.size();
        int i13 = fila1.element();
        int i14 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 35);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test374");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        fila1.add(52);
        int i9 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test375");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.remove();
        int i9 = fila1.element();
        boolean b10 = fila1.empty();
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 32);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test376");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        java.lang.String str8 = fila1.print();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32" + "'", str8.equals("32"));
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test377");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        int i4 = fila1.getCapacidade();
        boolean b5 = fila1.empty();
        fila1.add(97);
        int i8 = fila1.size();
        int i9 = fila1.element();
        java.lang.String str10 = fila1.print();
        boolean b11 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "97" + "'", str10.equals("97"));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test378");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        boolean b7 = fila1.empty();
        boolean b8 = fila1.empty();
        int i9 = fila1.size();
        fila1.add((int) (short) 100);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test379");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.getCapacidade();
        int i6 = fila1.remove();
        try {
            java.lang.String str7 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test380");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        fila1.add((int) (short) 0);
        int i16 = fila1.remove();
        int i17 = fila1.remove();
        int i18 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 32);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test381");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.element();
        int i13 = fila1.getCapacidade();
        int i14 = fila1.element();
        boolean b15 = fila1.empty();
        boolean b16 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test382");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        int i10 = fila1.element();
        int i11 = fila1.size();
        fila1.add((int) (short) 100);
        int i14 = fila1.size();
        int i15 = fila1.size();
        int i16 = fila1.element();
        fila1.add((int) (byte) 1);
        int i19 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue(i14 == 4);
        org.junit.Assert.assertTrue(i15 == 4);
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test383");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        int i3 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        boolean b6 = fila1.empty();
        fila1.add(0);
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test384");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        try {
            java.lang.String str8 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test385");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '4');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test386");
        Fila fila1 = new Fila(97);
        int i2 = fila1.size();
        fila1.add(0);
        int i5 = fila1.element();
        java.lang.String str6 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test387");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        fila1.add((int) (short) 10);
        int i15 = fila1.getCapacidade();
        int i16 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i16 == 3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test388");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add((int) '#');
        int i11 = fila1.size();
        int i12 = fila1.element();
        boolean b13 = fila1.empty();
        java.lang.String str14 = fila1.print();
        try {
            int i15 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "35" + "'", str14.equals("35"));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test389");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        fila1.add((int) (byte) 100);
        int i12 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test390");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        java.lang.String str7 = fila1.print();
        int i8 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i11 = fila1.size();
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "97" + "'", str12.equals("97"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test391");
        Fila fila1 = new Fila((int) (short) -1);
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        fila1.add(97);
        fila1.add((int) ' ');
        java.lang.String str8 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "97, 32" + "'", str8.equals("97, 32"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test392");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        int i10 = fila1.element();
        int i11 = fila1.size();
        fila1.add((int) (short) 100);
        boolean b14 = fila1.empty();
        java.lang.String str15 = fila1.print();
        boolean b16 = fila1.empty();
        try {
            java.lang.String str17 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10, -1, 35, 100" + "'", str15.equals("10, -1, 35, 100"));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test393");
        Fila fila1 = new Fila((int) (short) 10);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        int i4 = fila1.getCapacidade();
        boolean b5 = fila1.empty();
        int i6 = fila1.size();
        int i7 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test394");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        try {
            java.lang.String str8 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test395");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.size();
        int i10 = fila1.getCapacidade();
        boolean b11 = fila1.empty();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test396");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        boolean b5 = fila1.empty();
        int i6 = fila1.element();
        fila1.add(100);
        int i9 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == 100);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test397");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.element();
        int i6 = fila1.size();
        int i7 = fila1.element();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 32);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test398");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.remove();
        int i8 = fila1.size();
        fila1.add(35);
        int i11 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test399");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        int i10 = fila1.element();
        int i11 = fila1.size();
        fila1.add((int) (short) 100);
        java.lang.String str14 = fila1.print();
        int i15 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10, -1, 35, 100" + "'", str14.equals("10, -1, 35, 100"));
        org.junit.Assert.assertTrue(i15 == 10);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test400");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        int i10 = fila1.size();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue(i11 == 3);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test401");
        Fila fila1 = new Fila((int) '#');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test402");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        int i5 = fila1.remove();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        int i9 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test403");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        fila1.add(0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test404");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        int i10 = fila1.getCapacidade();
        fila1.add((int) ' ');
        int i13 = fila1.getCapacidade();
        fila1.add(35);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test405");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        boolean b7 = fila1.empty();
        boolean b8 = fila1.empty();
        java.lang.String str9 = fila1.print();
        try {
            java.lang.String str10 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test406");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        int i8 = fila1.getCapacidade();
        try {
            int i9 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test407");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.element();
        boolean b8 = fila1.empty();
        int i9 = fila1.element();
        java.lang.String str10 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0" + "'", str10.equals("0"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test408");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        fila1.add((int) (short) 0);
        int i11 = fila1.size();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test409");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test410");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        int i5 = fila1.element();
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.remove();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 35);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test411");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.remove();
        try {
            java.lang.String str6 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 32);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test412");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        boolean b8 = fila1.empty();
        fila1.add(0);
        int i11 = fila1.remove();
        int i12 = fila1.size();
        int i13 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test413");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        int i5 = fila1.getCapacidade();
        fila1.add(100);
        int i8 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test414");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        int i13 = fila1.size();
        int i14 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test415");
        Fila fila1 = new Fila(3);
        try {
            int i2 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test416");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        int i10 = fila1.remove();
        boolean b11 = fila1.empty();
        int i12 = fila1.remove();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test417");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.getCapacidade();
        java.lang.String str14 = fila1.print();
        int i15 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "52" + "'", str14.equals("52"));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test418");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        java.lang.String str12 = fila1.print();
        int i13 = fila1.getCapacidade();
        fila1.add((int) (byte) -1);
        int i16 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "52" + "'", str12.equals("52"));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test419");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        java.lang.String str4 = fila1.print();
        int i5 = fila1.getCapacidade();
        fila1.add((int) (short) 0);
        int i8 = fila1.remove();
        int i9 = fila1.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test420");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.size();
        try {
            int i6 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test421");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.remove();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.getCapacidade();
        int i14 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i13 == 100);
        org.junit.Assert.assertTrue(i14 == 100);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test422");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        fila1.add((int) (short) 10);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.remove();
        int i8 = fila1.element();
        fila1.add(10);
        boolean b11 = fila1.empty();
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test423");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        int i14 = fila1.element();
        java.lang.String str15 = fila1.print();
        boolean b16 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-1, 32" + "'", str15.equals("-1, 32"));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test424");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.getCapacidade();
        boolean b11 = fila1.empty();
        fila1.add(1);
        fila1.add((int) (byte) 10);
        boolean b16 = fila1.empty();
        int i17 = fila1.size();
        int i18 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 3);
        org.junit.Assert.assertTrue(i18 == 3);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test425");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        boolean b12 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test426");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        fila1.add((int) (short) 10);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.remove();
        int i8 = fila1.element();
        fila1.add(97);
        int i11 = fila1.remove();
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test427");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        fila1.add(32);
        int i12 = fila1.remove();
        int i13 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 32);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test428");
        Fila fila1 = new Fila((int) (short) 10);
        int i2 = fila1.size();
        int i3 = fila1.size();
        try {
            int i4 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test429");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(32);
        int i12 = fila1.element();
        java.lang.String str13 = fila1.print();
        fila1.add((int) '#');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i12 == 32);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "32" + "'", str13.equals("32"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test430");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        fila1.add((int) (short) 10);
        int i7 = fila1.size();
        java.lang.String str8 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10, 10" + "'", str8.equals("10, 10"));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test431");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        fila1.add(35);
        java.lang.String str9 = fila1.print();
        int i10 = fila1.getCapacidade();
        fila1.add((int) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "35" + "'", str9.equals("35"));
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test432");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        java.lang.String str12 = fila1.print();
        int i13 = fila1.getCapacidade();
        fila1.add((int) (byte) -1);
        int i16 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "52" + "'", str12.equals("52"));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test433");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        fila1.add(97);
        fila1.add(35);
        int i11 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i11 == 32);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test434");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        java.lang.String str14 = fila1.print();
        int i15 = fila1.size();
        try {
            int i16 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-1, 32" + "'", str14.equals("-1, 32"));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test435");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(1);
        int i12 = fila1.remove();
        fila1.add(52);
        int i15 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test436");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test437");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        boolean b6 = fila1.empty();
        int i7 = fila1.remove();
        boolean b8 = fila1.empty();
        try {
            int i9 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test438");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add((-1));
        int i13 = fila1.remove();
        fila1.add(10);
        int i16 = fila1.size();
        int i17 = fila1.getCapacidade();
        int i18 = fila1.element();
        int i19 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test439");
        Fila fila1 = new Fila((int) (byte) 100);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) 0);
        int i7 = fila1.getCapacidade();
        fila1.add((-1));
        int i10 = fila1.getCapacidade();
        int i11 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test440");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        java.lang.String str8 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0, 32" + "'", str8.equals("0, 32"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test441");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        int i12 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test442");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.remove();
        fila1.add((int) (short) 10);
        int i11 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test443");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        int i12 = fila1.remove();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test444");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        fila1.add((int) (byte) 1);
        int i11 = fila1.remove();
        fila1.add((int) ' ');
        int i14 = fila1.getCapacidade();
        fila1.add(10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test445");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.size();
        fila1.add(0);
        int i12 = fila1.getCapacidade();
        fila1.add(0);
        int i15 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test446");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        int i4 = fila1.element();
        java.lang.String str5 = fila1.print();
        try {
            int i6 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test447");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.remove();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        fila1.add((int) (byte) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test448");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        java.lang.String str8 = fila1.print();
        fila1.add((int) (short) 100);
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test449");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        fila1.add(10);
        int i12 = fila1.element();
        fila1.add((int) (short) 1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test450");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        boolean b3 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test451");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        boolean b5 = fila1.empty();
        fila1.add(4);
        boolean b8 = fila1.empty();
        int i9 = fila1.size();
        java.lang.String str10 = fila1.print();
        fila1.add((-1));
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100, 4" + "'", str10.equals("100, 4"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test452");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) 'a');
        fila1.add(0);
        fila1.add((int) (byte) 100);
        fila1.add((int) (byte) 100);
        fila1.add(0);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test453");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        java.lang.String str5 = fila1.print();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test454");
        Fila fila1 = new Fila(52);
        fila1.add((int) (short) 0);
        int i4 = fila1.remove();
        try {
            int i5 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test455");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        java.lang.String str10 = fila1.print();
        fila1.add(0);
        int i13 = fila1.size();
        int i14 = fila1.remove();
        try {
            java.lang.String str15 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test456");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.element();
        int i8 = fila1.element();
        java.lang.String str9 = fila1.print();
        int i10 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "97" + "'", str9.equals("97"));
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test457");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        int i9 = fila1.size();
        int i10 = fila1.size();
        int i11 = fila1.size();
        try {
            int i12 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test458");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        fila1.add((int) (short) 0);
        int i11 = fila1.size();
        int i12 = fila1.remove();
        java.lang.String str13 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0" + "'", str13.equals("0"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test459");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        java.lang.String str4 = fila1.print();
        fila1.add((int) (short) 100);
        int i7 = fila1.size();
        fila1.add((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "97" + "'", str4.equals("97"));
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test460");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        fila1.add((int) (short) 10);
        fila1.add((int) (byte) 1);
        int i9 = fila1.remove();
        int i10 = fila1.element();
        boolean b11 = fila1.empty();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.element();
        boolean b14 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test461");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        int i13 = fila1.size();
        int i14 = fila1.remove();
        fila1.add((int) (byte) -1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test462");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        boolean b10 = fila1.empty();
        boolean b11 = fila1.empty();
        boolean b12 = fila1.empty();
        int i13 = fila1.size();
        int i14 = fila1.element();
        int i15 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test463");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        fila1.add(35);
        boolean b9 = fila1.empty();
        java.lang.String str10 = fila1.print();
        boolean b11 = fila1.empty();
        fila1.add(100);
        boolean b14 = fila1.empty();
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test464");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        boolean b8 = fila1.empty();
        int i9 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test465");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        java.lang.String str14 = fila1.print();
        int i15 = fila1.size();
        boolean b16 = fila1.empty();
        try {
            int i17 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-1, 32" + "'", str14.equals("-1, 32"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test466");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add((-1));
        java.lang.String str13 = fila1.print();
        boolean b14 = fila1.empty();
        int i15 = fila1.getCapacidade();
        int i16 = fila1.size();
        fila1.add(0);
        int i19 = fila1.getCapacidade();
        int i20 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-1" + "'", str13.equals("-1"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test467");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add((-1));
        int i13 = fila1.remove();
        fila1.add(10);
        int i16 = fila1.size();
        int i17 = fila1.getCapacidade();
        int i18 = fila1.size();
        fila1.add(32);
        fila1.add(52);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test468");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        int i10 = fila1.element();
        int i11 = fila1.remove();
        int i12 = fila1.getCapacidade();
        int i13 = fila1.size();
        try {
            int i14 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test469");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        fila1.add(35);
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        int i10 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test470");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.getCapacidade();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 1);
        int i10 = fila1.element();
        int i11 = fila1.element();
        int i12 = fila1.size();
        int i13 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test471");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        java.lang.String str4 = fila1.print();
        int i5 = fila1.getCapacidade();
        fila1.add((int) (short) 0);
        fila1.add((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test472");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        int i4 = fila1.getCapacidade();
        boolean b5 = fila1.empty();
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test473");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) (short) 1);
        int i5 = fila1.element();
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test474");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        int i9 = fila1.size();
        fila1.add((int) (byte) 100);
        int i12 = fila1.getCapacidade();
        int i13 = fila1.element();
        int i14 = fila1.size();
        int i15 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 100);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test475");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        int i10 = fila1.remove();
        int i11 = fila1.remove();
        int i12 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test476");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        int i10 = fila1.remove();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test477");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        int i8 = fila1.element();
        int i9 = fila1.size();
        int i10 = fila1.remove();
        int i11 = fila1.remove();
        boolean b12 = fila1.empty();
        int i13 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 32);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 10);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test478");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        int i11 = fila1.element();
        fila1.add((int) (short) -1);
        boolean b14 = fila1.empty();
        int i15 = fila1.size();
        int i16 = fila1.element();
        java.lang.String str17 = fila1.print();
        try {
            java.lang.String str18 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-1, -1" + "'", str17.equals("-1, -1"));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test479");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        fila1.add((int) ' ');
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test480");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        int i14 = fila1.getCapacidade();
        int i15 = fila1.size();
        boolean b16 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test481");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "97" + "'", str8.equals("97"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test482");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        int i13 = fila1.size();
        int i14 = fila1.remove();
        fila1.add(97);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test483");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.size();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "52" + "'", str12.equals("52"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test484");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        java.lang.String str6 = fila1.print();
        int i7 = fila1.size();
        try {
            int i8 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test485");
        Fila fila1 = new Fila(3);
        fila1.add(0);
        java.lang.String str4 = fila1.print();
        int i5 = fila1.size();
        int i6 = fila1.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test486");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        java.lang.String str5 = fila1.print();
        try {
            int i6 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test487");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        int i11 = fila1.element();
        int i12 = fila1.remove();
        boolean b13 = fila1.empty();
        try {
            int i14 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test488");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.size();
        java.lang.String str10 = fila1.print();
        try {
            int i11 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0" + "'", str10.equals("0"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test489");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        fila1.add((int) (byte) 0);
        boolean b13 = fila1.empty();
        boolean b14 = fila1.empty();
        boolean b15 = fila1.empty();
        int i16 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test490");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        fila1.add(35);
        java.lang.String str10 = fila1.print();
        boolean b11 = fila1.empty();
        fila1.add(32);
        fila1.add((int) (short) 1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test491");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        fila1.add(35);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 35);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test492");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(1);
        int i12 = fila1.remove();
        fila1.add(52);
        boolean b15 = fila1.empty();
        int i16 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test493");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        java.lang.String str10 = fila1.print();
        boolean b11 = fila1.empty();
        fila1.add(10);
        fila1.add((int) '#');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "52" + "'", str10.equals("52"));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test494");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        boolean b6 = fila1.empty();
        int i7 = fila1.remove();
        boolean b8 = fila1.empty();
        boolean b9 = fila1.empty();
        try {
            java.lang.String str10 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test495");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        java.lang.String str4 = fila1.print();
        fila1.add((-1));
        int i7 = fila1.element();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "97" + "'", str4.equals("97"));
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test496");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        int i9 = fila1.element();
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test497");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        fila1.add(52);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test498");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        fila1.add(1);
        int i10 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test499");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        boolean b8 = fila1.empty();
        fila1.add((-1));
        fila1.add((int) ' ');
        int i13 = fila1.size();
        fila1.add((int) (short) 0);
        int i16 = fila1.size();
        int i17 = fila1.element();
        int i18 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i16 == 3);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test500");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        int i7 = fila1.element();
        int i8 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 32);
        org.junit.Assert.assertTrue(i8 == 32);
    }
}

