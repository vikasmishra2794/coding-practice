public class KthSymbolRecursion {
    public static int generateString(String s, int i, int A, int B) {
        if (i == A) {
            return (int)s.charAt(B - 1) - 48;
        }
        StringBuffer s1 = new StringBuffer();
        for(int k = 0; k < s.length(); k++) {
            if(s.charAt(k) == '0') {
                s1.append("01");
            } else {
                s1.append("10");
            }
        }
        return generateString(s1.toString(), i+1, A, B);
    }
    public static int kthSymbol(int A, int B) {
        return generateString("0", 1, A, B);
    }
    public static void main(String[] args) {
        System.out.println(kthSymbol(2,2));
    }
}
