public class AddBinaryString {
    public static int addDecimal(int num1, int num2) {
        int tenPow = 1;
        int carry = 0;
        int result = 0;
        while(num1 > 0 || num2 > 0) {
            int sum = num1%10 + num2%10 + carry;
            result = result + ((sum%10) * tenPow);
            carry = sum/10;
            num1 = num1/10;
            num2 = num2/10;
            tenPow *= 10;
        }
        return result;
    }
    public static String addBinary(String num1, String num2) {
        String result = "";
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while(i >= 0 || j >= 0) {
            int sum = (i < 0 ? 0 : Integer.parseInt(""+ num1.charAt(i))) + (j < 0 ? 0 :Integer.parseInt(""+ num2.charAt(j))) + carry;
            if(sum == 2) {
                sum = 0;
                carry = 1;
            } else if(sum == 3) {
                sum = 1;
                carry = 1;
            } else {
                carry = 0;
            }
            result = sum + result;
            i--;
            j--;
        }
        if(carry == 1) {
            result = carry + result;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(addBinary("11", "11"));
    }
}