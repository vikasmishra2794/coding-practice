package bitmasking;
import java.util.*;

public class InterestingArray {
    public String solve(ArrayList<Integer> A) {
        int oddCount = 0;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) % 2 != 0) {
                oddCount++;
            }
        }
        if(oddCount % 2 == 0) {
            return "Yes";
        }
        return "No";
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(9, 17));
        InterestingArray obj = new InterestingArray();
        System.out.println(obj.solve(A));
    }
}
