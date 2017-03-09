
public class Prime {

    public static boolean isPrime(int n) {
        if (n <= 1 || (n > 2 && (n % 2) == 0)) {
            return false;
        }

        for(int c = 3; c <= (int) Math.sqrt((double) n); c++) {
            if ((n % c) == 0) {
                return false;
            }
        }

        return true;
    }
}
