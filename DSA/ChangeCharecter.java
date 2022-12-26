import java.util.*;

public class ChangeCharecter {
    public static int solve(String A, int B) { 
        // int distinctCount = 0;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0; i < A.length(); i++) {
            if (!hm.containsKey(""+A.charAt(i))) {
                hm.put(""+A.charAt(i), 1);
                // distinctCount++;
            } else {
                hm.put(""+A.charAt(i), hm.get(""+A.charAt(i)) + 1);
            }
        }
        while(B > 0) {
            int min = Integer.MAX_VALUE;
            String hmKey = "";
            for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                if(min > entry.getValue()) {
                    min = entry.getValue();
                    hmKey = entry.getKey();
                }
            }
            if(min <= B) {
                B = B - min;
                // distinctCount--;
                hm.remove(hmKey);
            } else {
                B = 0;
            }
        }
        return hm.size();
    }
    public static void main(String[] args) {
        System.out.println(solve("abcabbccd", 3));
    }
}
