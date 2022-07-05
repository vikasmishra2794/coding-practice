public class CheckPalindromeRecursion {
    public static boolean checkPlaindrome(String A, int i, int j) {
        if(i > j) {
            return true;
        }
        return (A.charAt(i) == A.charAt(j) && checkPlaindrome(A, i+1, j-1));
    }
    public static void main(String[] args) {
        System.out.println(checkPlaindrome("abaa", 0, 3));
    }
}
