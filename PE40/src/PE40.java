/**
 * Created by Jamie on 11/2/14.
 */
public class PE40 {
    public static void main(String[] args) {
        int total = 1;
        for (int k = 1; k <= 1000000; k*=10) {
            total *= d(k);
            System.out.println(d(k));
        }
        System.out.println(total);
    }

    public static int d(int n) {
        int numDigits = 1;
        int digit;
        int digitMultiplier = 1;
        for (digit = 10; digit < n; digit+=9*(int)Math.pow(10, digitMultiplier-1)*digitMultiplier) {
            numDigits++;
            digitMultiplier++;
        }
        int number = (int)Math.pow(10, numDigits);
        while (digit > n) {
            number--;
            digit -= numDigits;
        }
        return ("" + (number)).charAt(n - digit) - '0';
    }
}
