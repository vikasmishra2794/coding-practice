public class LongestPalindrome {
    public static String LongestPossiblePalindrome(String A) {
        int maxLength = 1, start = 0;
        if(A.length() < 2) {
            return A;
        }
        for(int i = 0; i < A.length(); i++) {
            int low = i - 1;
            int high = i + 1;
            while(high < A.length() && A.charAt(high) == A.charAt(i))
            high++;
            while(low >= 0 && A.charAt(low) == A.charAt(i))
            low--;
            while(low >= 0 && high < A.length() && A.charAt(low) == A.charAt(high)) {
                low--;
                high++;
            }
            int length = high - low  - 1;
            if(maxLength < length) {
                maxLength = length;
                start = low + 1;
            }
        }
        return A.substring(start, start+maxLength);
    }
    public static void main(String[] args) {
        System.out.println(LongestPossiblePalindrome("aa"));
    }
}
