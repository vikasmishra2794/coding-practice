package modular_math;
import java.util.*;

public class PairSum {
    public static int nCr(int n, int r) {
    return fact(n) / (fact(r) *
                  fact(n - r));
    }
 
// Returns factorial of n
    public static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
    public static int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0;
        for(int i = 0; i < A.size(); i++) {
            hm.put(A.get(i)%B, hm.getOrDefault(A.get(i)%B, 0) + 1);
        }
        if (hm.containsKey(0))
        sum += nCr(hm.get(0), 2);
        for(int i = 1; i <= B/2; i++) {
            if(B %2 == 0 && i == B/2 && hm.containsKey(B/2)) {
                sum += nCr(hm.get(B/2), 2);
            } else if(hm.containsKey(i) && hm.containsKey(B - i)) {
                sum += hm.get(i) * hm.get(B - i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solve(A, 2));
    }
}
