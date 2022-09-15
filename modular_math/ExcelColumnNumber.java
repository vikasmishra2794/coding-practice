package modular_math;

public class ExcelColumnNumber {
    public static int titleToNumber(String A) {
        int base26 = 1;
        int result = 0;
        for(int i = A.length() - 1; i >= 0; i--) {
            result += base26 * (A.charAt(i) - 64);
            base26 *= 26;
        }
        return result;
    }
    public static void main(String[] args) {
        String A = "AA";
        System.out.println(titleToNumber(A));
    }
}
