package searching;
import  java.util.*;

public class SpecialInteger {
    public static boolean subArraySizeCheck(ArrayList<Integer> A, int B, int mid) {
        int sum = 0;
        for(int i = 0; i< mid; i++) {
            sum += A.get(i);
        }
        if(sum > B) {
            return false;
        }
        for(int i = mid; i< A.size(); i++) {
            sum = sum + A.get(i) - A.get(i - mid);
            if(sum > B) {
                return false;
            }
        }
        return true;
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int sum = 0, ans = A.size(), l = 0;
        for(int i = 0; i < A.size(); i++) {
            sum += A.get(i);
            while(sum > B) {
                sum -= A.get(l);
                l++;
                ans = Math.min(ans, i - l + 1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, 17, 100, 11));
        int B = 130;
        System.out.println(solve(A, B));
    }
}
