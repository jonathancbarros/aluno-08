import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        int i7 = fila1.size();
        fila1.add((int) (byte) 100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (byte) 1);
        boolean b6 = fila1.empty();
        java.lang.String str7 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        fila1.add((int) (short) 0);
        fila1.add(2);
        int i13 = fila1.element();
        java.lang.String str14 = fila1.print();
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0, 2" + "'", str14.equals("0, 2"));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        boolean b9 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.remove();
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.getCapacidade();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
        Fila fila1 = new Fila((int) (short) -1);
        fila1.add((int) (short) 10);
        int i4 = fila1.size();
        int i5 = fila1.remove();
        boolean b6 = fila1.empty();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        Fila fila1 = new Fila(3);
        fila1.add(0);
        boolean b4 = fila1.empty();
        int i5 = fila1.element();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
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
        int i16 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i16 == 3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        fila1.add(35);
        java.lang.String str10 = fila1.print();
        boolean b11 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b14 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        fila1.add(35);
        int i9 = fila1.getCapacidade();
        int i10 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 35);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
        Fila fila1 = new Fila((int) '#');
        int i2 = fila1.getCapacidade();
        try {
            int i3 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 35);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i5 = fila1.element();
        int i6 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        fila1.add(35);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.element();
        int i12 = fila1.size();
        fila1.add(10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 35);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        fila1.add(35);
        java.lang.String str10 = fila1.print();
        boolean b11 = fila1.empty();
        try {
            java.lang.String str12 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0, 32, 35" + "'", str10.equals("0, 32, 35"));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.size();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        int i11 = fila1.getCapacidade();
        int i12 = fila1.element();
        int i13 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.getCapacidade();
        int i6 = fila1.remove();
        int i7 = fila1.getCapacidade();
        try {
            int i8 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        boolean b5 = fila1.empty();
        fila1.add(10);
        int i8 = fila1.element();
        fila1.add(0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.size();
        int i10 = fila1.size();
        fila1.add(10);
        int i13 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        Fila fila1 = new Fila((int) ' ');
        boolean b2 = fila1.empty();
        fila1.add(10);
        int i5 = fila1.size();
        java.lang.String str6 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) 'a');
        fila1.add(0);
        fila1.add(4);
        int i9 = fila1.size();
        int i10 = fila1.element();
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i9 == 3);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
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
        fila1.add((int) (byte) 100);
        fila1.add((int) (byte) 10);
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
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        int i5 = fila1.element();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.size();
        fila1.add(35);
        int i11 = fila1.getCapacidade();
        int i12 = fila1.size();
        java.lang.String str13 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "35" + "'", str13.equals("35"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        fila1.add((int) (byte) 10);
        int i9 = fila1.size();
        int i10 = fila1.size();
        java.lang.String str11 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i9 == 3);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10, -1, 10" + "'", str11.equals("10, -1, 10"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        int i8 = fila1.size();
        boolean b9 = fila1.empty();
        fila1.add(0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        int i7 = fila1.element();
        boolean b8 = fila1.empty();
        fila1.add((int) (short) 100);
        fila1.add((int) (short) 100);
        int i13 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 32);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
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
        int i14 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
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
        fila1.add(0);
        int i14 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
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
        boolean b16 = fila1.empty();
        int i17 = fila1.remove();
        int i18 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.remove();
        fila1.add((int) (byte) -1);
        java.lang.String str8 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        fila1.add(32);
        fila1.add((int) (short) 100);
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "32, 100" + "'", str12.equals("32, 100"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        int i5 = fila1.element();
        int i6 = fila1.element();
        fila1.add(0);
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        fila1.add((int) (short) 10);
        int i10 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add((int) 'a');
        fila1.add((int) ' ');
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        int i8 = fila1.remove();
        int i9 = fila1.size();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.size();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
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
        boolean b15 = fila1.empty();
        int i16 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        java.lang.String str6 = fila1.print();
        int i7 = fila1.getCapacidade();
        fila1.add(2);
        java.lang.String str10 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "2" + "'", str10.equals("2"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        try {
            java.lang.String str4 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        Fila fila1 = new Fila((int) (short) -1);
        fila1.add((int) (short) 10);
        int i4 = fila1.getCapacidade();
        int i5 = fila1.remove();
        boolean b6 = fila1.empty();
        boolean b7 = fila1.empty();
        try {
            int i8 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
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
        int i13 = fila1.size();
        int i14 = fila1.size();
        int i15 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 35);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        int i5 = fila1.getCapacidade();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.size();
        fila1.add(1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i5 = fila1.element();
        java.lang.String str6 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "97" + "'", str6.equals("97"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
        Fila fila1 = new Fila((int) (short) -1);
        fila1.add((int) (short) 10);
        fila1.add(4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        Fila fila1 = new Fila(97);
        int i2 = fila1.getCapacidade();
        fila1.add((int) '#');
        boolean b5 = fila1.empty();
        fila1.add(10);
        int i8 = fila1.size();
        int i9 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 97);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 97);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        boolean b8 = fila1.empty();
        fila1.add(0);
        int i11 = fila1.remove();
        int i12 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        boolean b6 = fila1.empty();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.remove();
        fila1.add(2);
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        boolean b7 = fila1.empty();
        java.lang.String str8 = fila1.print();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        try {
            java.lang.String str12 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
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
        java.lang.String str14 = fila1.print();
        try {
            int i15 = fila1.remove();
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
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "32" + "'", str14.equals("32"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
        Fila fila1 = new Fila((int) (short) 10);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.size();
        try {
            int i5 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
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
        int i16 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-1, 10, 0" + "'", str15.equals("-1, 10, 0"));
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
        Fila fila1 = new Fila((int) (short) -1);
        boolean b2 = fila1.empty();
        fila1.add((int) (short) 100);
        java.lang.String str5 = fila1.print();
        int i6 = fila1.size();
        int i7 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        fila1.add((int) '#');
        int i10 = fila1.element();
        int i11 = fila1.element();
        fila1.add(100);
        int i14 = fila1.remove();
        int i15 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
        Fila fila1 = new Fila(52);
        fila1.add((int) (short) 0);
        int i4 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i4 == 52);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add((int) 'a');
        fila1.add(3);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i10 == 32);
        org.junit.Assert.assertTrue(i11 == 32);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        Fila fila1 = new Fila(52);
        fila1.add((int) (short) 0);
        int i4 = fila1.element();
        fila1.add((int) (byte) 1);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.size();
        fila1.add(97);
        int i10 = fila1.remove();
        int i11 = fila1.remove();
        boolean b12 = fila1.empty();
        try {
            int i13 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        Fila fila1 = new Fila((int) '#');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        int i4 = fila1.size();
        boolean b5 = fila1.empty();
        fila1.add((int) (short) -1);
        int i8 = fila1.remove();
        fila1.add(2);
        org.junit.Assert.assertTrue(i2 == 35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        fila1.add(1);
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        boolean b6 = fila1.empty();
        boolean b7 = fila1.empty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
        Fila fila1 = new Fila((int) (short) 10);
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.size();
        fila1.add(100);
        int i7 = fila1.element();
        int i8 = fila1.remove();
        try {
            int i9 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
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
        int i14 = fila1.getCapacidade();
        int i15 = fila1.getCapacidade();
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
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
        Fila fila1 = new Fila((int) ' ');
        fila1.add(52);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add((int) 'a');
        int i8 = fila1.element();
        org.junit.Assert.assertTrue(i4 == 52);
        org.junit.Assert.assertTrue(i5 == 32);
        org.junit.Assert.assertTrue(i8 == 52);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        fila1.add(35);
        int i7 = fila1.size();
        fila1.add(32);
        boolean b10 = fila1.empty();
        int i11 = fila1.remove();
        int i12 = fila1.size();
        int i13 = fila1.getCapacidade();
        java.lang.String str14 = fila1.print();
        int i15 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "35, 32" + "'", str14.equals("35, 32"));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        java.lang.String str6 = fila1.print();
        int i7 = fila1.getCapacidade();
        fila1.add(2);
        fila1.add((int) (short) 0);
        int i12 = fila1.getCapacidade();
        java.lang.String str13 = fila1.print();
        int i14 = fila1.getCapacidade();
        try {
            int i15 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "2, 0" + "'", str13.equals("2, 0"));
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.remove();
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.size();
        fila1.add(0);
        java.lang.String str12 = fila1.print();
        int i13 = fila1.size();
        fila1.add(52);
        int i16 = fila1.remove();
        int i17 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0" + "'", str12.equals("0"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i16 == 52);
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        java.lang.String str6 = fila1.print();
        int i7 = fila1.size();
        fila1.add(0);
        int i10 = fila1.remove();
        fila1.add((int) (byte) 100);
        fila1.add((int) (short) 1);
        fila1.add(0);
        int i17 = fila1.getCapacidade();
        java.lang.String str18 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "100, 1, 0" + "'", str18.equals("100, 1, 0"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
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
        int i14 = fila1.getCapacidade();
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
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 35);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
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
        fila1.add((int) (byte) 1);
        java.lang.String str16 = fila1.print();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.size();
        int i10 = fila1.element();
        int i11 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
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
        fila1.add(100);
        int i17 = fila1.getCapacidade();
        int i18 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 32);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
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
        try {
            int i14 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        int i5 = fila1.remove();
        int i6 = fila1.size();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
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
        boolean b14 = fila1.empty();
        int i15 = fila1.size();
        java.lang.String str16 = fila1.print();
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
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "35" + "'", str16.equals("35"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.size();
        int i9 = fila1.getCapacidade();
        java.lang.String str10 = fila1.print();
        try {
            int i11 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0, 97" + "'", str10.equals("0, 97"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add(32);
        java.lang.String str6 = fila1.print();
        try {
            int i7 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32" + "'", str6.equals("32"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        fila1.add(35);
        fila1.add(1);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
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
        int i12 = fila1.getCapacidade();
        int i13 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        boolean b8 = fila1.empty();
        fila1.add(0);
        int i11 = fila1.getCapacidade();
        int i12 = fila1.getCapacidade();
        java.lang.String str13 = fila1.print();
        try {
            java.lang.String str14 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "52, 0" + "'", str13.equals("52, 0"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        java.lang.String str10 = fila1.print();
        int i11 = fila1.size();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10, -1, 35" + "'", str10.equals("10, -1, 35"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        java.lang.String str8 = fila1.print();
        fila1.add((int) (short) 0);
        fila1.add(2);
        int i13 = fila1.element();
        fila1.add((int) (byte) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
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
        try {
            int i13 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        boolean b8 = fila1.empty();
        fila1.add(35);
        int i11 = fila1.element();
        fila1.add((int) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.size();
        int i7 = fila1.element();
        int i8 = fila1.element();
        int i9 = fila1.remove();
        int i10 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
        Fila fila1 = new Fila((int) '#');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        int i4 = fila1.size();
        boolean b5 = fila1.empty();
        fila1.add((int) (short) -1);
        int i8 = fila1.remove();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        boolean b6 = fila1.empty();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.remove();
        boolean b9 = fila1.empty();
        int i10 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        boolean b8 = fila1.empty();
        java.lang.String str9 = fila1.print();
        try {
            int i10 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "97" + "'", str9.equals("97"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) '#');
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        boolean b8 = fila1.empty();
        fila1.add(4);
        int i11 = fila1.getCapacidade();
        fila1.add((int) (short) -1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 35);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35" + "'", str7.equals("35"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        boolean b10 = fila1.empty();
        boolean b11 = fila1.empty();
        fila1.add((int) (byte) 1);
        int i14 = fila1.getCapacidade();
        int i15 = fila1.remove();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        java.lang.String str4 = fila1.print();
        fila1.add((int) (short) 100);
        boolean b7 = fila1.empty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "97" + "'", str4.equals("97"));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        fila1.add((int) ' ');
        fila1.add(35);
        int i10 = fila1.remove();
        int i11 = fila1.element();
        int i12 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 32);
        org.junit.Assert.assertTrue(i12 == 32);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        fila1.add(35);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        boolean b12 = fila1.empty();
        java.lang.String str13 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "35" + "'", str13.equals("35"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        boolean b10 = fila1.empty();
        try {
            int i11 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
        Fila fila1 = new Fila(32);
        fila1.add(32);
        int i4 = fila1.element();
        org.junit.Assert.assertTrue(i4 == 32);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.getCapacidade();
        fila1.add(10);
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        int i10 = fila1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "97, 10" + "'", str8.equals("97, 10"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        int i10 = fila1.remove();
        boolean b11 = fila1.empty();
        fila1.add((int) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.size();
        fila1.add((int) '4');
        int i5 = fila1.size();
        boolean b6 = fila1.empty();
        boolean b7 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
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
        fila1.add((int) (short) 1);
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
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
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
        int i12 = fila1.size();
        fila1.add(97);
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
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        boolean b7 = fila1.empty();
        boolean b8 = fila1.empty();
        int i9 = fila1.size();
        fila1.add(0);
        int i12 = fila1.element();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        int i7 = fila1.element();
        int i8 = fila1.remove();
        fila1.add((int) (short) -1);
        boolean b11 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        fila1.add(35);
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        int i10 = fila1.element();
        int i11 = fila1.element();
        fila1.add(10);
        fila1.add((int) ' ');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertTrue(i10 == 35);
        org.junit.Assert.assertTrue(i11 == 35);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
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
        fila1.add((int) (short) 1);
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 35);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35" + "'", str7.equals("35"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4" + "'", str12.equals("4"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        java.lang.String str7 = fila1.print();
        try {
            int i8 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        boolean b5 = fila1.empty();
        fila1.add(10);
        int i8 = fila1.element();
        int i9 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
        Fila fila1 = new Fila((int) (byte) 100);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) 0);
        int i7 = fila1.getCapacidade();
        fila1.add((-1));
        java.lang.String str10 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10, 0, -1" + "'", str10.equals("10, 0, -1"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) 'a');
        boolean b5 = fila1.empty();
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.element();
        int i9 = fila1.size();
        fila1.add(35);
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        Fila fila1 = new Fila(0);
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        java.lang.String str6 = fila1.print();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.size();
        fila1.add(0);
        java.lang.String str12 = fila1.print();
        int i13 = fila1.size();
        fila1.add(52);
        java.lang.String str16 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0" + "'", str12.equals("0"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "52" + "'", str16.equals("52"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.remove();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 97);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.size();
        fila1.add((int) ' ');
        java.lang.String str9 = fila1.print();
        try {
            java.lang.String str10 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "97, 32" + "'", str9.equals("97, 32"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        boolean b8 = fila1.empty();
        int i9 = fila1.getCapacidade();
        fila1.add((int) (byte) 10);
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10" + "'", str12.equals("10"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
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
        int i15 = fila1.size();
        int i16 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        int i8 = fila1.remove();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.size();
        boolean b11 = fila1.empty();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
        Fila fila1 = new Fila(0);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) ' ');
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.element();
        fila1.add((int) ' ');
        fila1.add((int) (byte) -1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 32);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 32);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        fila1.add(0);
        int i10 = fila1.getCapacidade();
        java.lang.String str11 = fila1.print();
        int i12 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "52, 0" + "'", str11.equals("52, 0"));
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
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
        java.lang.String str15 = fila1.print();
        boolean b16 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "52, 10" + "'", str15.equals("52, 10"));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.element();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
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
        int i14 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        int i8 = fila1.size();
        int i9 = fila1.size();
        java.lang.String str10 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0" + "'", str10.equals("0"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
        Fila fila1 = new Fila((int) (short) -1);
        int i2 = fila1.getCapacidade();
        boolean b3 = fila1.empty();
        boolean b4 = fila1.empty();
        fila1.add((int) (short) 0);
        java.lang.String str7 = fila1.print();
        boolean b8 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
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
        boolean b19 = fila1.empty();
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
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
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
        java.lang.String str21 = fila1.print();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "1" + "'", str21.equals("1"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
        Fila fila1 = new Fila(10);
        int i2 = fila1.size();
        int i3 = fila1.getCapacidade();
        int i4 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.getCapacidade();
        fila1.add(32);
        int i5 = fila1.size();
        fila1.add(3);
        fila1.add((int) '#');
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        fila1.add(35);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.size();
        int i12 = fila1.size();
        boolean b13 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
        Fila fila1 = new Fila((int) ' ');
        int i2 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.size();
        fila1.add((int) ' ');
        fila1.add(100);
        boolean b11 = fila1.empty();
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "97, 32, 100" + "'", str12.equals("97, 32, 100"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
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
        int i12 = fila1.size();
        try {
            int i13 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "35" + "'", str10.equals("35"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        fila1.add(100);
        int i5 = fila1.getCapacidade();
        fila1.add(100);
        int i8 = fila1.element();
        boolean b9 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        int i8 = fila1.getCapacidade();
        boolean b9 = fila1.empty();
        boolean b10 = fila1.empty();
        fila1.add(32);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
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
        fila1.add((int) (short) 100);
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
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        fila1.add(97);
        int i8 = fila1.getCapacidade();
        int i9 = fila1.remove();
        int i10 = fila1.getCapacidade();
        fila1.add((int) ' ');
        int i13 = fila1.size();
        java.lang.String str14 = fila1.print();
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "97, 32" + "'", str14.equals("97, 32"));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.getCapacidade();
        fila1.add(97);
        int i6 = fila1.size();
        boolean b7 = fila1.empty();
        fila1.add((int) (short) 1);
        int i10 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
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
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        int i5 = fila1.size();
        int i6 = fila1.getCapacidade();
        int i7 = fila1.getCapacidade();
        fila1.add((int) (short) -1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
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
        int i12 = fila1.remove();
        int i13 = fila1.getCapacidade();
        fila1.add(100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        int i3 = fila1.size();
        int i4 = fila1.size();
        try {
            int i5 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        fila1.add(35);
        boolean b10 = fila1.empty();
        int i11 = fila1.element();
        int i12 = fila1.size();
        java.lang.String str13 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0, 35" + "'", str13.equals("0, 35"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
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
        int i14 = fila1.size();
        int i15 = fila1.remove();
        int i16 = fila1.getCapacidade();
        int i17 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i14 == 3);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
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
        java.lang.String str15 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue(i14 == 4);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10, -1, 35, 100" + "'", str15.equals("10, -1, 35, 100"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
        Fila fila1 = new Fila((int) (short) 10);
        int i2 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        int i4 = fila1.element();
        boolean b5 = fila1.empty();
        java.lang.String str6 = fila1.print();
        fila1.add(35);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        java.lang.String str8 = fila1.print();
        int i9 = fila1.size();
        fila1.add(35);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        int i5 = fila1.element();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add(1);
        int i6 = fila1.element();
        java.lang.String str7 = fila1.print();
        fila1.add((int) (short) 0);
        java.lang.String str10 = fila1.print();
        try {
            int i11 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0" + "'", str10.equals("0"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        int i4 = fila1.element();
        int i5 = fila1.getCapacidade();
        boolean b6 = fila1.empty();
        java.lang.String str7 = fila1.print();
        int i8 = fila1.size();
        int i9 = fila1.size();
        int i10 = fila1.size();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        fila1.add((int) '#');
        int i10 = fila1.element();
        int i11 = fila1.element();
        java.lang.String str12 = fila1.print();
        int i13 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "52, 35" + "'", str12.equals("52, 35"));
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        fila1.add((int) (short) 0);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        fila1.add(35);
        boolean b10 = fila1.empty();
        int i11 = fila1.getCapacidade();
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0, 35" + "'", str12.equals("0, 35"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        Fila fila1 = new Fila((int) '#');
        int i2 = fila1.getCapacidade();
        int i3 = fila1.size();
        fila1.add((int) (byte) -1);
        boolean b6 = fila1.empty();
        int i7 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        Fila fila1 = new Fila((int) (byte) -1);
        fila1.add((int) (byte) 100);
        fila1.add((-1));
        fila1.add((int) (short) 10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) 'a');
        boolean b5 = fila1.empty();
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        boolean b3 = fila1.empty();
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        fila1.add(97);
        int i8 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
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
        int i12 = fila1.element();
        int i13 = fila1.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
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
        try {
            int i13 = fila1.element();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 35);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35" + "'", str7.equals("35"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4" + "'", str12.equals("4"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
        Fila fila1 = new Fila((int) (short) -1);
        fila1.add((int) (short) 10);
        int i4 = fila1.size();
        int i5 = fila1.remove();
        try {
            int i6 = fila1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        Fila fila1 = new Fila((int) (short) -1);
        fila1.add((int) (short) 10);
        int i4 = fila1.size();
        int i5 = fila1.remove();
        int i6 = fila1.getCapacidade();
        fila1.add(4);
        fila1.add((int) '4');
        boolean b11 = fila1.empty();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
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
        int i14 = fila1.getCapacidade();
        int i15 = fila1.size();
        int i16 = fila1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        fila1.add((int) '4');
        fila1.add((int) '#');
        int i10 = fila1.element();
        int i11 = fila1.element();
        int i12 = fila1.element();
        boolean b13 = fila1.empty();
        int i14 = fila1.getCapacidade();
        fila1.add(0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        fila1.add(97);
        int i9 = fila1.getCapacidade();
        java.lang.String str10 = fila1.print();
        fila1.add(3);
        int i13 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "32, 97" + "'", str10.equals("32, 97"));
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.size();
        fila1.add((int) ' ');
        fila1.add(97);
        int i9 = fila1.getCapacidade();
        boolean b10 = fila1.empty();
        java.lang.String str11 = fila1.print();
        boolean b12 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "32, 97" + "'", str11.equals("32, 97"));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
        Fila fila1 = new Fila(10);
        fila1.add(97);
        fila1.add((int) ' ');
        boolean b6 = fila1.empty();
        boolean b7 = fila1.empty();
        fila1.add((int) (byte) 100);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        int i4 = fila1.getCapacidade();
        int i5 = fila1.size();
        int i6 = fila1.size();
        int i7 = fila1.size();
        int i8 = fila1.size();
        fila1.add((int) (byte) 1);
        java.lang.String str11 = fila1.print();
        int i12 = fila1.size();
        try {
            java.lang.String str13 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1" + "'", str11.equals("1"));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
        Fila fila1 = new Fila((int) 'a');
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) (short) 0);
        int i6 = fila1.size();
        java.lang.String str7 = fila1.print();
        fila1.add(100);
        fila1.add((-1));
        int i12 = fila1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
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
        int i13 = fila1.element();
        int i14 = fila1.remove();
        boolean b15 = fila1.empty();
        fila1.add((int) (byte) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
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
        int i13 = fila1.remove();
        int i14 = fila1.getCapacidade();
        boolean b15 = fila1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i13 == 52);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
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
        fila1.add((int) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 97);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
        Fila fila1 = new Fila((int) (byte) -1);
        int i2 = fila1.size();
        fila1.add((int) (short) 10);
        fila1.add((int) (short) -1);
        int i7 = fila1.size();
        fila1.add((int) '#');
        int i10 = fila1.getCapacidade();
        java.lang.String str11 = fila1.print();
        boolean b12 = fila1.empty();
        try {
            java.lang.String str13 = fila1.print();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10, -1, 35" + "'", str11.equals("10, -1, 35"));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
        Fila fila1 = new Fila((-1));
        int i2 = fila1.getCapacidade();
        fila1.add((int) (byte) 100);
        boolean b5 = fila1.empty();
        fila1.add(4);
        boolean b8 = fila1.empty();
        int i9 = fila1.getCapacidade();
        int i10 = fila1.element();
        int i11 = fila1.size();
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        int i10 = fila1.getCapacidade();
        int i11 = fila1.getCapacidade();
        java.lang.String str12 = fila1.print();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-1, 10, 0" + "'", str12.equals("-1, 10, 0"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
        Fila fila1 = new Fila((int) '#');
        fila1.add(1);
        boolean b4 = fila1.empty();
        boolean b5 = fila1.empty();
        fila1.add((int) (short) 10);
        int i8 = fila1.element();
        int i9 = fila1.getCapacidade();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 35);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
        Fila fila1 = new Fila((int) (byte) -1);
        fila1.add((int) (byte) 100);
        fila1.add((-1));
        boolean b6 = fila1.empty();
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
        Fila fila1 = new Fila(100);
        int i2 = fila1.size();
        fila1.add((-1));
        fila1.add((int) (byte) 10);
        int i7 = fila1.size();
        fila1.add((int) (byte) 0);
        boolean b10 = fila1.empty();
        int i11 = fila1.size();
        fila1.add((int) ' ');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
        Fila fila1 = new Fila((-1));
        fila1.add((int) (byte) 10);
        int i4 = fila1.element();
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.getCapacidade();
        boolean b8 = fila1.empty();
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
        Fila fila1 = new Fila((int) (byte) -1);
        boolean b2 = fila1.empty();
        int i3 = fila1.size();
        fila1.add((int) '#');
        boolean b6 = fila1.empty();
        fila1.add((int) (byte) -1);
        int i9 = fila1.size();
        int i10 = fila1.size();
        int i11 = fila1.element();
        boolean b12 = fila1.empty();
        int i13 = fila1.getCapacidade();
        int i14 = fila1.getCapacidade();
        java.lang.String str15 = fila1.print();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 35);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "35, -1" + "'", str15.equals("35, -1"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        Fila fila1 = new Fila((int) (short) 0);
        fila1.add(97);
        boolean b4 = fila1.empty();
        int i5 = fila1.size();
        int i6 = fila1.element();
        int i7 = fila1.element();
        int i8 = fila1.element();
        java.lang.String str9 = fila1.print();
        fila1.add((int) (byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "97" + "'", str9.equals("97"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
        Fila fila1 = new Fila((int) (byte) 10);
        int i2 = fila1.size();
        boolean b3 = fila1.empty();
        boolean b4 = fila1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }
}

