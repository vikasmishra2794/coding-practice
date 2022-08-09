package recursion;

public class ArraySorted {
    public static boolean isSorted(int[] A, int i, int j) {
        if(j == A.length || A.length == 0) {
            return true;
        }
        return A[j] > A[i] && isSorted(A, i + 1, j + 1);
    }
    public static void main(String[] args) {
        int[] A = {0};
        System.out.println(isSorted(A, 0, 1));
    }
}
