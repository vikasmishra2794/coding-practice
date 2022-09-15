package hashing;
import java.util.*;

public class ZeroSumArray {
    public static int solve(ArrayList<Integer> A) {
        HashSet<Long> hs = new HashSet<Long>();
        long sum = A.get(0);
        if(sum == 0) {
            return 1;
        }
        hs.add((long)A.get(0));
        for(int i = 1; i < A.size(); i++) {
            sum += A.get(i);
            if(hs.contains(sum) || sum == 0) {
                return 1;
            } else {
                hs.add(sum);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87, -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62));
        System.out.println(solve(A));
    }
}
