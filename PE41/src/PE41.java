/**
 * Created by Jamie on 11/3/14.
 */
public class PE41 {
    public static void main(String[] args) {
        Primes primes = new Primes(100000000);
        boolean found = false;
        for (int k = primes.lastPrime(); !found; k = primes.previousPrime()) {
            if (Tests.is1tonPandigital(k)) {
                System.out.println(k);
                found = true;
            }
        }
    }
}
