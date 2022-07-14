package arrays;
import java.util.*;

public class RainWaterTrapped {
    public static int trap(final List<Integer> A) {
        int[] leftMax = new int[A.size()];
        int[] rightMax = new int[A.size()];
        int lMax = A.get(0);
        leftMax[0] = 0;
        for(int i = 1; i < A.size(); i++) {
            leftMax[i] = lMax;
            lMax = Math.max(lMax, A.get(i));
        }
        int rMax = A.get(A.size() - 1);
        rightMax[A.size() - 1] = 0;
        for(int i = A.size() - 2; i >= 0; i--) {
            rightMax[i] = rMax;
            rMax = Math.max(rMax, A.get(i));
        }
        int sum = 0;
        for(int i = 0; i < A.size(); i++) {
            int min = Math.min(leftMax[i], rightMax[i]);
            sum += (min - A.get(i)) > 0 ? (min - A.get(i)) : 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5,1,0,2,4,1,6,0,3));
        System.out.println(trap(A));
    }
}
