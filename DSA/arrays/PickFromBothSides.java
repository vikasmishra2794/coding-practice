package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides {
    public static int solve(ArrayList<Integer> A, int B) {
        int[] prefix = new int[A.size()];
        int[] suffix = new int[A.size()];
        prefix[0] = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            prefix[i] = prefix[i - 1] + A.get(i);
        }
        suffix[A.size() - 1] = A.get(A.size() - 1);
        for(int i = A.size() - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + A.get(i);
        }
        int i = 0, j = B;
        int max = Integer.MIN_VALUE;
        while(i <= j && (i + j) == B) {
            if(i == 0 && j == B) {
                max = Math.max(max, suffix[A.size() - j]);
                max = Math.max(max, prefix[j - 1]);
            } else {
                max = Math.max(max, suffix[A.size() - j] + prefix[i - 1]);
                max = Math.max(max, suffix[A.size() - i] + prefix[j - 1]);
            }
            i++;
            j--;
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, -2, 3 , 1, 2));
        System.out.println(solve(A, 3));
    }
}
