package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndex {
    public static int solve(ArrayList<Integer> A) {
        int[] leftPrefix = new int[A.size()];
        int[] rightPrefix = new int[A.size()];
        leftPrefix[0] = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            leftPrefix[i] = leftPrefix[i - 1] + A.get(i);
        }
        rightPrefix[A.size() - 1] = A.get(A.size() - 1);
        for(int i = A.size() - 2; i >= 0; i--) {
            rightPrefix[i] = rightPrefix[i + 1] + A.get(i);
        }
        for(int i = 0; i < A.size(); i++) {
            if (leftPrefix[i] == rightPrefix[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer> (Arrays.asList(-1, -2));
        System.out.println(solve(A));
    }
}
