package Matrix;

import java.util.ArrayList;
import java.util.HashSet;

public class RowToColumnZero {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        HashSet<Integer> rhs = new HashSet<Integer>();
        HashSet<Integer> chs = new HashSet<Integer>();
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < A.get(i).size(); j++) {
                if(A.get(i).get(j) == 0) {
                    rhs.add(i);
                    chs.add(j);
                }
            }
        }
        for(int i = 0; i < A.size(); i++) {
            if(rhs.contains(i)) {
                for(int j = 0; j < A.get(i).size(); j++) {
                    A.get(i).set(j, 0);
                }
            }
        }
        for(int j = 0; j < A.get(0).size(); j++) {
            if(chs.contains(j)) {
                for(int i = 0; i < A.size(); i++) {
                    A.get(i).set(j, 0);
                }
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[][] B = {
            {1,2,3,4}, {5,7,0}
        };
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>> ();
        for(int i = 0; i < B.length; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < B[i].length; j++) {
                temp.add(B[i][j]);
            }
            A.add(temp);
        }
        ArrayList<ArrayList<Integer>> C = new ArrayList<ArrayList<Integer>> ();
        C = solve(A); 
        for(ArrayList<Integer> row: C) {
            for(int data: row) {
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }
}
