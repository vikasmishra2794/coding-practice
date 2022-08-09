package sorting;

public class MaxMod {
    public static int solve(int[] A) {
        int max = A[0];
        int sMax = Integer.MIN_VALUE;
        for(int i = 1; i < A.length; i++) {
            if(max < A[i]) {
                sMax = max;
                max = A[i];
            } else if (A[i] < max && sMax < A[i]) {
                sMax = A[i];
            }
        }
        if(sMax == Integer.MIN_VALUE) {
            return 0;
        }
        return sMax%max;
    }
    public static void main(String[] args) {
        int []A = {2, 6, 4};
        System.out.println(solve(A));   
    }
}
