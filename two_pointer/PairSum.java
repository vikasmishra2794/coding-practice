package two_pointer;
import java.util.*;

public class PairSum {
    public static int solve(ArrayList<Integer> A, int B) {
        int i = 0, j = A.size() - 1, count = 0;
        while(i < j) {
            if(A.get(i) + A.get(j) == B) {
                count++;
                i++;
                j--;
            } else if (A.get(i) + A.get(j)  > B) {
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 6, 6, 7, 9, 9));
        int B = 13;
        solve(A, B);
    }
}
