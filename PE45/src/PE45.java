/**
 * Created by Jamie on 2/17/15.
 */
import java.util.*;
public class PE45 {
    static HashMap<Long, Long> pentagonals = new HashMap<Long, Long>();
    static HashMap<Long, Long> hexagonals = new HashMap<Long, Long>();
    static long triangleN = 288;
    static long pentagonN = 166;
    static long hexagonN = 144;
    public static void main(String[] args) {
        long nextTriangle;
        boolean done = false;
        while (!done) {
            updatePentagon(triangleN + 12);
            updateHexagon(triangleN + 12);
            for (int k = 0; k < 12 && !done; k++) {
                nextTriangle = triangleN * (triangleN + 1) / 2;
                if (pentagonals.containsKey(nextTriangle) && hexagonals.containsKey(nextTriangle)) {
                    System.out.println("T(" + triangleN + ") = P(" + pentagonals.get(nextTriangle) + ") = H(" +
                            hexagonals.get(nextTriangle) + ") = " + nextTriangle);
                    done = true;
                }
                triangleN++;
            }
        }
    }

    public static void updatePentagon(long n) {
        long top = 2 * n / 3;
        long nextPentagonal;
        while (pentagonN <= top) {
            pentagonN++;
            nextPentagonal = pentagonN * (3 * pentagonN - 1) / 2;
            pentagonals.put(nextPentagonal, pentagonN);
        }
    }

    public static void updateHexagon(long n) {
        long top = n / 2;
        long nextHexagonal;
        while (hexagonN <= top) {
            hexagonN++;
            nextHexagonal = hexagonN * (2 * hexagonN - 1);
            hexagonals.put(nextHexagonal, hexagonN);
        }
    }
}
