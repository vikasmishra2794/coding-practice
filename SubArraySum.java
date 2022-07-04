import java.util.*;

public class SubArraySum {
    public static ArrayList<Integer> longestSubArrLength(ArrayList<Integer> A, int B) {
        HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int maxLength = 0;
        long prefixSum = A.get(0);
        int start = -1;
        hm.put(prefixSum, 0);
        if (prefixSum == B) {
            start = 0;
            maxLength = 1;
        }
        for(int i = 1; i < A.size(); i++) {
            prefixSum += A.get(i);
            if (prefixSum == B) {
                start = 0;
                maxLength = i + 1;
            } else if(!hm.containsKey(prefixSum - B)) {
                hm.put(prefixSum, i);
            } else {
                if (maxLength < Math.max(maxLength, i - hm.get(prefixSum - B))) {
                    maxLength = Math.max(maxLength, i - hm.get(prefixSum - B));
                    start = hm.get(prefixSum - B) + 1;
                }
            }
        }
        for(int i = start; i < start + maxLength; i++) {
            result.add(A.get(i));
        }
        return maxLength > 0 ? result :  new ArrayList<Integer>(Arrays.asList(-1));
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, 10, 20, 100, 105));
        System.out.println(longestSubArrLength(A, 110));
    }
}
