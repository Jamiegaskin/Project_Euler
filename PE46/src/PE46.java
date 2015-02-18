/**
 * Created by Jamie on 2/18/15.
 */
public class PE46 {
    public static void main(String[] args) {
        Primes primes = new Primes(1000);
        int primeTest, testMinusPrime;
        boolean done = false;
        boolean canBeExpressed;
        for (int test = 35; !done; test+=2) {
            if (test > primes.top()) {
                primes = new Primes(2*test);
            }
            if (primes.isPrime(test)) {
                continue;
            }

            canBeExpressed = false;
            for (primeTest = primes.firstPrime(); primeTest < test && !canBeExpressed; primeTest = primes.nextPrime()) {
                testMinusPrime = test - primeTest;
                if (isDoubleOfSquare(testMinusPrime)) {
                    canBeExpressed = true;
                }
            }
            if (!canBeExpressed) {
                System.out.println(test + " cannot be expressed as the sum of a prime and twice a square");
                done = true;
            }
        }
    }

    public static boolean isDoubleOfSquare(int x) {
        return (Math.sqrt(x/2.)%1<.00000001);
    }
}
