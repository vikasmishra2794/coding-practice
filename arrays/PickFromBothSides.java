package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides {
    public static int solve(ArrayList<Integer> A, int B) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        while(i <= B/2) {
            int sum = 0;
            int left = i;
            int right = B - i;
            for(int k = 0; k < left; k++) {
                sum += A.get(k);
            }
            for(int k = A.size() - 1; k >= A.size() - right; k--) {
                sum += A.get(k);
            }
            max = Math.max(max, sum);
            left = B - i;
            right = i;
            sum = 0;
            for(int k = 0; k < left; k++) {
                sum += A.get(k);
            }
            for(int k = A.size() - 1; k >= A.size() - right; k--) {
                sum += A.get(k);
            }
            max = Math.max(max, sum);
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,2));
        System.out.println(solve(A, 1));
    }
}
