package sorting;

import java.util.Arrays;

public class ConsecutiveElements {
    public static void main(String[] args) {
        int[] A = {3, 2, 1, 5};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        for(int i = 1; i < A.length; i++) {
            if(A[i] - A[i - 1] != 1) {
                return 0;
            }
        }
        return 1;
    }
}
