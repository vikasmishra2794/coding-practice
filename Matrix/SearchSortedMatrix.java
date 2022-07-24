package Matrix;
import java.util.*;

public class SearchSortedMatrix {
    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.size(); i++) {
            for(int j = A.get(i).size() - 1; j >= 0; j--) {
                if(B < A.get(i).get(j)) {
                    continue;
                } else if(B > A.get(i).get(j)) {
                    break;
                } else {
                    min = Math.min(min, ((i+1) * 1009 + (j + 1)));
                }
            }
        }
        if(min != Integer.MAX_VALUE) {
            return min;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] B = {
            {1,2,3}, {4, 5, 6}, {7,8,9}
        };
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>> ();
        for(int i = 0; i < B.length; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < B[i].length; j++) {
                temp.add(B[i][j]);
            }
            A.add(temp);
        }
        // ArrayList<ArrayList<Integer>> C = new ArrayList<ArrayList<Integer>> ();
        // C = solve(A, 2); 
        System.out.println(solve(A, 2));
        // for(ArrayList<Integer> row: C) {
        //     for(int data: row) {
        //         System.out.print(data+" ");
        //     }
        //     System.out.println();
        // }
    }
}
