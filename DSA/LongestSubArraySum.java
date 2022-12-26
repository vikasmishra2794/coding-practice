import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArraySum {
    public static ArrayList<Integer> longestSubArrLength(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int maxLength = 0;
        int prefixSum = A.get(0);
        int start = -1;
        hm.put(prefixSum, 0);
        if (prefixSum == 0) {
            start = 0;
            maxLength = 1;
        }
        for(int i = 1; i < A.size(); i++) {
            prefixSum += A.get(i);
            if (prefixSum == 0) {
                start = 0;
                maxLength = i + 1;
            } else if(!hm.containsKey(prefixSum)) {
                hm.put(prefixSum, i);
            } else {
                if (maxLength < Math.max(maxLength, i - hm.get(prefixSum))) {
                    maxLength = Math.max(maxLength, i - hm.get(prefixSum));
                    start = hm.get(prefixSum) + 1;
                }
            }
        }
        for(int i = start; i < start + maxLength; i++) {
            result.add(A.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0, 22, 7, 21, -11, -6, -7, -16, -2));
        System.out.println(longestSubArrLength(A));
    }
}
