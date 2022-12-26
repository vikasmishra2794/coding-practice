package hashing;
import java.util.*;

public class ShaggyDistance {
    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < A.size(); i++) {
            if(hm.containsKey(A.get(i))) {
                int length = i - hm.get(A.get(i));
                minLength = Math.min(minLength, length);
            } else {
                hm.put(A.get(i), i);
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,1));
        System.out.println(solve(A));
    }
}
