import java.util.ArrayList;

/**
 * Created by Jamie on 11/1/14.
 * uses PEtools
 */
public class PE37 {
    public static Primes primes = new Primes(1000000);
    public static void main(String[] args) {
        ArrayList<Integer> truncatablePrimes = new ArrayList<Integer>();

        for (int k = 13; truncatablePrimes.size() < 11; k += 2) {
            if (k > primes.top()) {
                primes = new Primes(primes.top()*2);
            }
            if (testPrimeTruncatability(k)) {
                System.out.println("Success with " + k);
                truncatablePrimes.add(k);
            }
        }

        int sum = 0;
        for (int k = 0; k < 11; k++) {
            sum += truncatablePrimes.get(k);
        }
        System.out.println(sum);
    }

    public static boolean testPrimeTruncatability(int x) {
        for (int forward = x; forward > 0; forward = removeFirstDigit(forward)) {
            if (!primes.isPrime(forward)) {
                return false;
            }
        }
        for (int backward = removeLastDigit(x); backward > 0; backward = removeLastDigit(backward)) {
            if (!primes.isPrime(backward)) {
                return false;
            }
        }
        return true;
    }

    public static int removeFirstDigit(int x) {
        if (x < 1) {
            return 0;
        }
        int numDigits = (int)Math.floor(Math.log10(x)) + 1;
        int first = x / (int)Math.pow(10, numDigits - 1);
        x -= first * Math.pow(10, numDigits - 1);
        return x;
    }

    public static int removeLastDigit(int x) {
        return x / 10;
    }
}
