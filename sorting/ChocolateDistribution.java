package sorting;
import java.util.Arrays;

public class ChocolateDistribution {
    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int i = 0, j = B - 1;
        int min = Integer.MAX_VALUE;
        while(A.length > 0 && i < A.length && j < A.length && j >= 0) {
            min = Math.min(min, A[j++] - A[i++]);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] A = {};
        int B = 1;
        System.out.println(solve(A, B));
    }
}
