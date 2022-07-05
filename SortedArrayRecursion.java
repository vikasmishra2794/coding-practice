public class SortedArrayRecursion {
    public static boolean isSorted(int[] A, int i) {
        if(i == A.length - 1) {
            return true;
        }
        return (A[i] <= A[i + 1] && isSorted(A, i+1));
    }
    public static void main(String[] args) {
        int[] A = {2,7};
        System.out.println(isSorted(A, 0));
    }
}
