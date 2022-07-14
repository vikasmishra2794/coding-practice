package Matrix;

public class Jagged {
    public static void printJagged() {
        int[][] A = new int[3][];
        for(int i = 0; i < A.length; i++) {
            A[i] = new int[i + 1];
            for(int j = 0; j < A[i].length; j++) {
                A[i][j] = i + 1;
            }
        }
        for(int[] arr: A) {
            for(int data: arr) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // System.out.println("Hi");
        printJagged();
    }
}
