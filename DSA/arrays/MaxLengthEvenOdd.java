package arrays;

public class MaxLengthEvenOdd {
    public static boolean isAlternate(int[] A, int index) {
        if(A[index] % 2 == 0) {
            if (index == 0) {
                return A[index + 1] % 2 != 0;
            } else if (index == A.length - 1) {
                return A[index - 1] % 2 != 0;
            } else {
                return A[index - 1] % 2 != 0 && A[index + 1] % 2 != 0;
            }
        } else {
            if (index == 0) {
                return A[index + 1] % 2 == 0;
            } else if (index == A.length - 1) {
                return A[index - 1] % 2 == 0;
            } else {
                return A[index - 1] % 2 == 0 && A[index + 1] % 2 == 0;
            }
        }
    }
    public static int maxEvenOddLength(int[] A) {
        int max = 1, count = 0;
        for(int i = 0; i < A.length; i++) {
            if(isAlternate(A, i)) {
                if(count == 0 && i > 0) {
                    count = 2;
                } else {
                    count++;
                }
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] A = {10,12,14,7,8};
        System.out.println(maxEvenOddLength(A));
    }
}
