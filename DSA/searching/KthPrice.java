package searching;
import java.util.*;

public class KthPrice {
    public static boolean kthSmallest(final List<Integer> A, int B, int mid) {
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            count += (A.get(i) <= mid) ? 1 : 0;
        }
        return count >= B;
    }
    public static int solve(final List<Integer> A, int B) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i = 0; i < A.size(); i++) {
            start = Math.min(start, A.get(i));
            end = Math.max(end, A.get(i));
        }
        int ans = end;
        while(start <= end) {
            int mid = (start + end)/2;
            if(kthSmallest(A, B, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 1, 4, 3, 2));
        int k = 3;
        System.out.println(solve(A, k));
    }
}
