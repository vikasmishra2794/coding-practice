package sorting;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueElements {
    public static int solve(int[] A) {
        Arrays.sort(A);
        int prev = A[0];
        int stepsCount = 0;
        for(int i = 1; i < A.length; i++) {
            if(A[i] <= prev) {
                stepsCount += (A[i] == prev) ? 1 : prev - A[i] + 1;
                A[i] = prev + 1;
                prev = A[i];
            } else {
                prev = A[i];
            }
        }
        return stepsCount;
    }
    public static void main(String[] args) {
        int[] A = {1,2,1,2};
        System.out.println(solve(A));
    }
}
