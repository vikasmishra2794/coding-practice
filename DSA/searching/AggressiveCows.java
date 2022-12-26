package searching;
import java.util.*;

public class AggressiveCows {
    public static boolean canAdjustCows(ArrayList<Integer> A, int B, int mid) {
        int count = 1, prevCowPos = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) - prevCowPos == mid) {
                count++;
                prevCowPos = A.get(i);
            }
        }
        return (count == B);
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.size(); i++) {
            min = Math.min(min, A.get(i));
            max = Math.max(max, A.get(i));
        }
        int start = min, end = max - min;
        int ans = start;
        while(start <= end) {
            int mid = (start + end)/2;
            if(canAdjustCows(A, B, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, 17, 100, 11));
        int B = 2;
        System.out.println(solve(A, B));
    }
}
