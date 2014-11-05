package Tools;
import java.util.*;

/**
 * Created by Jamie on 10/8/14.
 * Sieve of Eratosthenes
 * to save time, internally the primes are falses.
 * actual number is index*2 + 3;
 */
public class Primes {
    private boolean[] mPrimes;

    public Primes(int top) {
        mPrimes = new boolean[top/2];
        int actualNum;
        for(int k = 0; k < top/2; k++) {
            if (!mPrimes[k]) {
                actualNum = k*2+3;
                for (int j = actualNum; j*actualNum < top + 1 && j*actualNum > 0; j+=2) {
                    mPrimes[(j*actualNum-3)/2] = true;
                }
            }
        }
    }

    public void printAllPrimes() {
        System.out.println(2);
        for (int k = 0; k < mPrimes.length; k++) {
            if (!mPrimes[k]) {
                System.out.println(k*2+3);
            }
        }
    }

    public boolean isPrime(int x) {
        if (x==2) {
            return true;
        }
        else if (x < 2) {
            return false;
        }
        else if (x % 2 == 0) {
            return false;
        }
        return !mPrimes[(x-3)/2];
    }

    public int top() {
        return (mPrimes.length-1)*2+3;
    }
}
