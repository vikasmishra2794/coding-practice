package sorting;

public class KthSmallestElement {
    public static int kthsmallest(final int[] A, int B) {
        int temp = 0;
        for(int i = 0; i < B; i++) {
            int min = A[i];
            int index = i;
            for(int j = i + 1; j < A.length; j++) {
                if(min > A[j]) {
                    min = A[j];
                    index = j;
                }
            }
            temp = A[i];
            A[i] = min;
            A[index] = temp;
        }
        return A[B - 1];
    }
    public static void main(String[] args) {
        final int[] A = {2, 1};
        int B = 2;
        System.out.println(kthsmallest(A, B));
    }
}
