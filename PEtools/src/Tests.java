/**
 * Created by Jamie on 11/3/14.
 */
public class Tests {
    public static boolean is1to9Pandigital(String in) {
        if (in.length() != 9) {
            return false;
        }
        boolean[] digits = new boolean[10];
        int digit;
        for (int k = 0; k < in.length(); k++) {
            if (in.charAt(k) == '0') {
                return false;
            }
            digit = in.charAt(k) - '0';
            if (digits[digit]) { // already occurred
                return false;
            }
            digits[digit] = true;
        }
        return true;
    }
    public static boolean is1to9Pandigital(int in) {
        if (in > 987654321 || in < 12345679) {
            return false;
        }
        boolean[] digits = new boolean[10];
        int digit;
        int divisor = 100000000;
        while (in > 0) {
            digit = in / divisor;
            if (digit == 0) {
                return false;
            }
            if (digits[digit]) { // already occurred
                return false;
            }
            digits[digit] = true;
            in -= in / divisor * divisor;
            divisor /= 10;
        }
        return true;
    }
    public static boolean is1tonPandigital(int in) {
        int numDigits = (int)Math.log10(in) + 1;
        boolean[] digits = new boolean[numDigits + 1];
        int digit;
        int divisor = (int)Math.pow(10, numDigits - 1);
        while (in > 0) {
            digit = in / divisor;
            if (digit == 0) {
                return false;
            }
            if (digit > numDigits) {
                return false;
            }
            if (digits[digit]) { // already occurred
                return false;
            }
            digits[digit] = true;
            in -= in / divisor * divisor;
            divisor /= 10;
        }
        return true;
    }
}
