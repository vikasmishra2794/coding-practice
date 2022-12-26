package sorting;

import java.util.Arrays;

public class ReversePair {
    public static int solve(int[] A) {
        Arrays.sort(A);
        int i = 0, j = A.length - 1, count = 0;
        while(j > 0) {
            while(A[j] != A[j - 1] && A[j] > 2 * A[i]) {
                i++;
                count++;
            }
            i = 0;
            j--;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {1, 3, 2, 3, 1, 8};
        System.out.println(solve(A));
    }
}
