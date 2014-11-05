import java.util.HashSet;
/**
 * Created by Jamie on 11/5/14.
 */
public class TriangleNumbers {
    private HashSet<Integer> nums;

    public TriangleNumbers(int num) {
        nums = new HashSet<Integer>();
        for (int k = 1; k <= num; k++) {
            nums.add((k+1)*k/2);
        }
    }

    public boolean isTriangleNumber(int x) {
        return nums.contains(x);
    }
}
