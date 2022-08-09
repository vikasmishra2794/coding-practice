package bitmasking;

public class AddBinaryString {
    public static String addBinary(String A, String B) {
        String str = "";
        int sum = 0, carry = 0, i = A.length() - 1, j = B.length() - 1;
        while(i >= 0 && j >= 0) {
            sum = (int)A.charAt(i) - 48 + (int)B.charAt(j) - 48 + carry;
            if(sum > 1) {
                carry = 1;
            } else {
                carry = 0;
            }
            str = ""+(sum%2) + str;
            i--;
            j--;
        }
        while(i >= 0) {
            sum = (int)A.charAt(i) - 48 + carry;
            if(sum > 1) {
                carry = 1;
            } else {
                carry = 0;
            }
            str = ""+(sum%2) + str;
            i--;
        }
        while(j >= 0) {
            sum = (int)B.charAt(j) - 48 + carry;
            if(sum > 1) {
                carry = 1;
            } else {
                carry = 0;
            }
            str = ""+(sum%2) + str;
            j--;
        }
        if(carry == 1) {
            str = "1" + str;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(addBinary("0", "111"));
    }
}
