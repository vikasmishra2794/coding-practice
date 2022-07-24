package bitmasking;
import java.util.*;

public class MinXOR {
    public int findMinXor(ArrayList<Integer> A) {
        int val = 0;
        int minXor = Integer.MAX_VALUE;
        Collections.sort(A);
        for(int i = 1; i < A.size(); i++) {
            val = A.get(i - 1) ^ A.get(i);
            minXor = Math.min(val, minXor);
        }
        return minXor;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0, 2, 5, 7));
        MinXOR obj = new MinXOR();
        System.out.println(obj.findMinXor(A));
    }
}
