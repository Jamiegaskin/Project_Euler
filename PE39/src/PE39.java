/**
 * Created by Jamie on 9/3/14.
 */
public class PE39 {
    public static final int MAX = 1000;

    public static void main(String[] args) {
        int c;
        double cDouble;
        int[] values = new int[MAX];

        for (int a = MAX - 1; a > 1; a--) {
            for (int b = 1; b < a; b++) {
                cDouble = Math.sqrt(a*a + b*b); // pythagorean formula
                if (cDouble % 1 > .00000001) {
                    continue;
                }
                c = (int) cDouble;
                if (a + b + c > MAX) {
                    a--;
                    b = 1;
                    break;
                }
                values[a + b + c - 1]++;
            }
        }

        int max = 0;
        int maxIndex = 0;
        for (int k = 0; k < values.length; k++){
            if (values[k] > max) {
                maxIndex = k;
                max = values[k];
            }
        }
        System.out.println((maxIndex + 1) + " " + max);
    }
}
