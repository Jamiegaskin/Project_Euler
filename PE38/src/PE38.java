/**
 * Created by Jamie on 11/1/14.
 */
public class PE38 {
    public static void main(String[] args) {
        int n = 9;
        String test;
        int largest = 0;
        for (int k = 9; k < 9876; k++) {
            test = "";
            for (int j = 1; j <= n; j++) {
                test += j * k;
            }
            if (test.charAt(0) != '9') {
                k /= 10;
                k *= 90;
                continue;
            }
            if (test.length() > 9) {
                n--;
                continue;
            }
            else if (test.length() < 9) {
                continue;
            }
            if (is1to9Pandigital(test) && Integer.parseInt(test) > largest) {
                largest = Integer.parseInt(test);
            }
        }
        System.out.println(largest);
    }

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
}
