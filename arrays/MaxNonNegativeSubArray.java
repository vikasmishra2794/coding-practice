package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        long max = Long.MIN_VALUE;
        int i = 0;
        int finalStartIndex = 0, finalEndIndex = 0;
        while(i < A.size()) {
            long sum = 0;
            int startIndex = i;
            while(i < A.size() && A.get(i) >= 0) {
                sum += (long)A.get(i);
                i++;
            }
            int endIndex = i - 1;
            if (max < sum) {
                max = sum;
                finalStartIndex = startIndex;
                finalEndIndex = endIndex;
            }
            while(i < A.size() && A.get(i) < 0) {
                i++;
            }
        }
        for(int j = finalStartIndex; j <= finalEndIndex; j++) {
            result.add(A.get(j));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer> (Arrays.asList(336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421));
        ArrayList<Integer> B = new ArrayList<Integer> ();
        B = maxset(A);
        for(int data: B) {
            System.out.print(data+ " ");
        }
    }
}
