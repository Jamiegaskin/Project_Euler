/**
 * Created by Jamie on 11/5/14.
 */
public class PE43 {
    static long sum = 0;
    public static void main(String[] args) {
        permute("", "0123456789");
        System.out.println(sum);
    }

    public static void permute(String existing, String in) {
        if (in.length() == 0) {
            if (testSubstringDivisibility(existing)) {
                System.out.println(existing);
                sum += Long.parseLong(existing);
            }
        }
        for (int k = 0; k < in.length(); k++) {
            permute(existing + in.charAt(k), in.substring(0, k) + in.substring(k + 1));
        }
    }

    public static boolean testSubstringDivisibility(String in) {
        if (Integer.parseInt(in.substring(1, 4)) % 2 != 0) {
            return false;
        }
        if (Integer.parseInt(in.substring(2, 5)) % 3 != 0) {
            return false;
        }
        if (Integer.parseInt(in.substring(3, 6)) % 5 != 0) {
            return false;
        }
        if (Integer.parseInt(in.substring(4, 7)) % 7 != 0) {
            return false;
        }
        if (Integer.parseInt(in.substring(5, 8)) % 11 != 0) {
            return false;
        }
        if (Integer.parseInt(in.substring(6, 9)) % 13 != 0) {
            return false;
        }
        if (Integer.parseInt(in.substring(7, 10)) % 17 != 0) {
            return false;
        }
        return true;
    }
}
