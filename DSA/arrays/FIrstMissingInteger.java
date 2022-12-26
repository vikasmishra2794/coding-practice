package arrays;
import java.util.*;

public class FIrstMissingInteger {
    public static int firstMissingPositive(ArrayList<Integer> A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) > A.size() || A.get(i) <= 0) {
                A.set(i, -1);
            }
        }
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) > 0) {
                hs.add(A.get(i));
            }
        }
        for(int i = 1; i <= A.size(); i++) {
            if(!hs.contains(i)) {
                return i;
            }
        }
        return hs.size() + 1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer> (Arrays.asList(1));
        System.out.println(firstMissingPositive(A));
    }
}
