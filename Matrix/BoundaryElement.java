package Matrix;

public class BoundaryElement {
    public static void printBoundary() {
        int[][] A = {{1,2,3},{4},{5},{6}};
        if (A.length == 1) {
            for(int i = 0; i < A[0].length; i++) {
                System.out.print(A[0][i] + " ");
            }
        } else if (A[0].length == 1) {
            for(int i = 0; i < A.length; i++) {
                System.out.print(A[i][0] + " ");
            }
        } else {
            for(int i = 0; i < A[0].length; i++) {
                System.out.print(A[0][i]+ " ");
            }
            for(int i = 1; i < A.length; i++) {
                System.out.print(A[i][A[i].length - 1]+ " ");
            }

            for(int i = A[A.length - 1].length - 2; i >= 0; i--) {
                System.out.print(A[A.length - 1][i]+ " ");
            }

            for(int i = A.length - 2; i >= 1; i--) {
                System.out.print(A[i][0]+ " ");
            }
       }
    }
    public static void main(String[] args) {
        printBoundary();
    }
}
