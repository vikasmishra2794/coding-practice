package Matrix;

import java.util.*;

public class Transpose {
    public static void matrixTranspose() {
        int[][] A = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
        int[][] temp;
        if(A.length == A[0].length) {
            temp = new int[A.length][A[0].length];
        } else {
            temp = new int[A[0].length][A.length];
        }
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                temp[j][i] = A[i][j];
            }
        }
        System.out.println(Arrays.deepToString(temp));
    }
    // public static void solve(ArrayList<ArrayList<Integer>> A) {
    //     ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
    //     for(int i = 0; i < A.size(); i++) {
    //         ArrayList<Integer> temp1 = new ArrayList<Integer>();
    //         for(int j = 0; j < A.get(i).size(); j++) {
    //             temp1.add(A.get(j).get(i));
    //         }
    //         temp.add(temp1);
    //     }
    //     for(ArrayList<Integer> data: temp) {
    //         for(int d : data) {
    //             System.out.print(d + " ");
    //         }
    //     }
    // }
    public static void main(String[] args) {
        matrixTranspose();
        // int[][] B = {{1,2,3}, {4,5,6}, {7,8,9}};
        // ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>> ();
        // for(int i = 0; i < 3; i++) {
        //     ArrayList<Integer> temp = new ArrayList<Integer>();
        //     for(int j = 0; j < 3; j++) {
        //         temp.add(B[i][j]);
        //     }
        //     A.add(temp);
        // }
        // for(ArrayList<Integer> data: A) {
        //     for(int d : data) {
        //         System.out.print(d + " ");
        //     }
        // }
        // solve(A);
    }
}
