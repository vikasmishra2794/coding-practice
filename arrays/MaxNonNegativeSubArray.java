package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        int[] cumSum = new int[A.size()];
        int maxSum = A.get(0);
        int maxIndex = 0;
        cumSum[0] = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) < 0) {
                cumSum[i] = -1;
            } else if (i > 0 && cumSum[i - 1] < 0) {
                cumSum[i] = A.get(i);
            } else {
                cumSum[i] = (cumSum[i - 1]) + A.get(i);
            }
        }
        for(int i = 1; i < cumSum.length; i++) {
            if(maxSum <= cumSum[i]) {
                maxSum = cumSum[i];
                maxIndex = i;
            }
        }
        int start = maxIndex;
        int end = maxIndex;
        while(maxIndex >= 0 && maxIndex < cumSum.length && cumSum[maxIndex] >= 0) {
            start--;
            maxIndex--;
        }
        for(int index = start + 1; index <= end; index++) {
            result.add(A.get(index));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer> (Arrays.asList(0, 0, -1, 0 ));
        ArrayList<Integer> B = new ArrayList<Integer> ();
        B = maxset(A);
        for(int data: B) {
            System.out.print(data+" ");
        }
    }
}
