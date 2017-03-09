import org.junit.Test;

import static org.junit.Assert.*;


public class PrimeTest {
    @Test
    public void isPrime() throws Exception {
        new Prime();
        assertEquals(false, Prime.isPrime(0));
        assertEquals(false, Prime.isPrime(10002));
        assertEquals(false, Prime.isPrime(9));

        assertEquals(true, Prime.isPrime(2));
        assertEquals(true, Prime.isPrime(3));
        assertEquals(true, Prime.isPrime(919));
    }
}