package searching;
import java.util.*;

public class MatrixSearch {
    public static int[] get2Dposition(ArrayList<ArrayList<Integer>> A, int index) {
        int[] result = new int[2];
        double rowNumber = (double)index / (double)A.get(0).size();
        int row = (int)Math.ceil(rowNumber);
        int column = index - (row - 1) * A.get(0).size();
        result[0] = row;
        result[1] = column;
        return result;
    }
    public static int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        int i = 1, j = A.size() * A.get(0).size();
        while(i <= j) {
            int mid = (i + j)/2;
            int[] position = get2Dposition(A, mid);
            if(A.get(position[0] - 1).get(position[1] - 1) == B) {
                return 1;
            } else if (A.get(position[0] - 1).get(position[1] - 1) < B) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        int[][] X = {{3}, {29}, {36}, {63}, {67}, {72}, {74}, {78}, {85}};
        // int[][] X = {{1,3,5,7}, {10,11,16,20}, {23, 30, 34, 50}};
        for(int i = 0; i < X.length; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < X[i].length; j++) {
                temp.add(X[i][j]);
            }
            A.add(temp);
        }
        System.out.println(searchMatrix(A, 41));
    }
}
