package hashing;

import java.util.HashMap;

public class tionSubstring {
    public static int solve(int A, String B) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < B.length(); i++) {
            hm.put(B.charAt(i), hm.getOrDefault(B.charAt(i), 0) + 1);
        }
        for(char key: hm.keySet()) {
            if(!(hm.get(key) % A == 0)) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(solve(1, "bc"));
    }
}
