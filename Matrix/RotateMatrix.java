package Matrix;

import java.util.ArrayList;

public class RotateMatrix {
    public static void transpose(ArrayList<ArrayList<Integer>> A) {
        int temp = 0;
        for(int i = 0; i < A.size(); i++) {
            for(int j = i + 1; j < A.get(i).size(); j++) {
                temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }
    }

    public static void solve(ArrayList<ArrayList<Integer>> A) {
        int i = 0;
        int j = A.size() - 1;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        transpose(A);
        while(i < j) {
            temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
        }
        for(ArrayList<Integer> data: A) {
            for(int element: data) {
                System.out.print(element + " ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int[][] B = {
            {21, 62, 16, 44, 55, 100, 16, 86, 29}, {62, 72, 85, 35, 14, 1, 89, 15, 73}, {42, 44, 30, 56, 25, 52, 61, 23, 54},
            {5, 35, 12, 35, 55, 74, 50, 50, 80}, {2, 65, 65, 82, 26, 36, 66, 60, 1}, {18, 1, 16, 91, 42, 11, 72, 97, 35},
            {23, 57, 9, 28, 13, 44, 40, 47, 98}
        };
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>> ();
        for(int i = 0; i < B.length; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < B[i].length; j++) {
                temp.add(B[i][j]);
            }
            A.add(temp);
        }
        solve(A);
    }
}
