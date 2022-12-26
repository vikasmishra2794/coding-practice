package hashing;

import java.util.HashMap;

public class PalindromeCheck {
    public static int solve(String A) {
        int evenCount = 0, oddCount = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < A.length(); i++) {
            hm.put(A.charAt(i), hm.getOrDefault(A.charAt(i), 0) + 1);
        }
        for(char key: hm.keySet()) {
            if(hm.get(key) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return (oddCount <= 1) ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solve("abbaee"));
    }
}
