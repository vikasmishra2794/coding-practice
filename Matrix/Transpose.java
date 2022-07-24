package Matrix;

import java.util.*;

public class Transpose {
    // public static void matrixTranspose() {
    //     int[][] A = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
    //     int[][] temp;
    //     if(A.length == A[0].length) {
    //         temp = new int[A.length][A[0].length];
    //     } else {
    //         temp = new int[A[0].length][A.length];
    //     }
    //     for(int i = 0; i < A.length; i++) {
    //         for(int j = 0; j < A[i].length; j++) {
    //             temp[j][i] = A[i][j];
    //         }
    //     }
    //     System.out.println(Arrays.deepToString(temp));
    // }
    public static void solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < A.get(0).size(); i++) {
            ArrayList<Integer> temp1 = new ArrayList<Integer>();
            for(int j = 0; j < A.size(); j++) {
                temp1.add(A.get(j).get(i));
            }
            temp.add(temp1);
        }
        for(ArrayList<Integer> data: temp) {
            for(int d : data) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // matrixTranspose();
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
        // for(ArrayList<Integer> data: A) {
        //     for(int d : data) {
        //         System.out.print(d + " ");
        //     }
        // }
        solve(A);
    }
}
