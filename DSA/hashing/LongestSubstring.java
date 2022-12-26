package hashing;
import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String A) {
        HashSet<String> hs = new HashSet<String>();
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        while(j < A.length()) {
            if(!hs.contains(""+A.charAt(j))) {
                hs.add(""+A.charAt(j));
                max = Math.max(max, hs.size());
                j++;
            } else {
                hs.remove(""+A.charAt(i));
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
    }
}
