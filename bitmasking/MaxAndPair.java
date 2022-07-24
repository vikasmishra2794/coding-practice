package bitmasking;

import java.util.*;

public class MaxAndPair {
    public static int countNumbers(int[] arr, int pattern) {
        int count = 0;
        for(int i = 0; i  < arr.length; i++) {
            if((arr[i] & pattern) == pattern) {
                count++;
            }
        }
        return count;
    }
    // 31 * N Solution
    public static int maxAnd(int[] arr) {
        int pattern = 0;
        for(int i = 31; i >= 0; i--) {
            int count = countNumbers(arr, (pattern | 1<<i));
            if(count >= 2) {
                pattern = pattern | 1<<i;
            }
        }
        return pattern;
    }
    // N*Log N Solution
    public static int maxPair(int[] A) {
        Arrays.sort(A);
        int val = 0;
        int maxVal = Integer.MIN_VALUE;
        for(int i = 1; i < A.length; i++) {
            val = A[i - 1] & A[i];
            maxVal = Math.max(val, maxVal);
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] A = {4,8,12,16,17};
        System.out.println(maxPair(A));
    }
}
