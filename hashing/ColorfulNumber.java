package hashing;

import java.util.HashSet;

public class ColorfulNumber {
    public static int colorful(int A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        String str = "" + A;
        for(int i = 0; i < str.length(); i++) {
            int product = 1;
            for(int j = i; j < str.length(); j++) {
                product *= str.charAt(j) - 48;
                if (hs.contains(product)) {
                    return 0;
                }
                hs.add(product);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(colorful(23));
    }
}
