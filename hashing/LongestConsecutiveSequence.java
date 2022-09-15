package hashing;
import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(final List<Integer> A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int maxLength = 0;
        for(int data: A) {
            hs.add(data);
        }
        for(int i = 0; i < A.size(); i++) {
            if (hs.contains(A.get(i) - 1)) {
                continue;
            } else {
                int data = A.get(i);
                int length = 1;
                while(hs.contains(data + 1)) {
                    length++;
                    data++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        // Wrong Approach!
        // for(int data: A) {
        //     int length = 1;
        //     while(hs.contains(data - 1)) {
        //         length++;
        //         data--;
        //     }
        //     maxLength = Math.max(maxLength, length);
        // }
        return maxLength;
    }
    public static void main(String[] args) {
        List<Integer> A = new  ArrayList<Integer>(Arrays.asList(2,1));
        System.out.println(longestConsecutive(A));
    }
}
