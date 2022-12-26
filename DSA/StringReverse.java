import java.util.Arrays;

public class StringReverse {
    public static String reverseWord(String A) {
        String[] B = A.trim().split(" ");
        String ans = "";
        System.out.println(Arrays.toString(B) + "  " + B.length);
        for(int i = B.length - 1; i >= 0; i-- ) {
            if(i > 0) {
                ans += B[i] + " ";
            } else {
                ans += B[i];
            }
        }
        System.out.println(ans.length());
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverseWord("      I    Love You   "));
    }
}