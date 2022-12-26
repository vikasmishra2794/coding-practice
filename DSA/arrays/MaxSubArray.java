package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArray {
    public static int maxSubArray(final List<Integer> A) {
        int max = A.get(0);
        int sum = A.get(0);
        int negativeCount = (sum >= 0) ? 0 : 1;
        int maxNegative = (sum >= 0) ? Integer.MIN_VALUE : sum;
        for(int i = 1; i < A.size(); i++) {
            sum += A.get(i);
            if (sum < 0) {
                maxNegative = Math.max(maxNegative, A.get(i));
                negativeCount++;
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        if(negativeCount == A.size()) {
            return maxNegative;
        }
        return max;
    }
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer> (Arrays.asList(-5,-2,-3,4,-4));
        System.out.println(maxSubArray(A));
    }
}
