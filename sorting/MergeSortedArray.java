package sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static int[] solve(final int[] A, final int[] B) {
        int[] result = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while(i < A.length && j < B.length) {
            if(A[i] <= B[j]) {
                result[k] = A[i];
                i++;
            } else {
                result[k] = B[j];
                j++;
            }
            k++;
        }
        while(i < A.length) {
            result[k] = A[i];
            i++;
            k++;
        }
        while(j < B.length) {
            result[k] = B[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] A = {3};
        int[] B = {-4, -3};
        System.out.println(Arrays.toString(solve(A, B)));
    }
}
