package hashing;
import java.util.*;

public class LargestContineousSequence {
    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int maxLength = Integer.MIN_VALUE;
        int start = -1, end = - 1;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int prefix = 0;
        hm.put(0, -1);
        for(int i = 0; i < A.size(); i++) {
            prefix += A.get(i);
            if(hm.containsKey(prefix) && (i - hm.get(prefix)) > maxLength) {
                start = hm.get(prefix);
                end = i;
                maxLength = (i - hm.get(prefix));
            } else if (hm.containsKey(prefix)) { 
                continue;
            } else {
                hm.put(prefix, i);
            }
        }
        for(int i = start + 1; i <= end; i++) {
            result.add(A.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList( -16, -10, -7, -11, 16, -15, 2, 28, -27, 19, -20, -22, -22, 21, -21, 18, -20, 24, 24, -12, -27, 2, -13, 3, 1, -18, 10, 20, -29, -4));
        ArrayList<Integer> result = lszero(A);
        for(int data: result) {
            System.out.println(data);
        }
    }
}
