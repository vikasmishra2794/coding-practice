package bitmasking;
import java.util.*;

public class SingleNumber {
    public static int singleNumber(final List<Integer> A) {
        int[] bitArr = new int[32];
        for(int i = 0; i < A.size(); i++) {
            int num = A.get(i);
            for(int j = 0; j < 32; j++) {
                int last_bit =  num & 1;
                bitArr[j] += last_bit;
                bitArr[j] %= 3;
                num >>= 1;
            }
        }
        int pow = 1;
        int result = 0;
        for(int i = 0; i < 32; i++) {
            result += bitArr[i] * pow;
            pow = pow * 2;
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0,0,0,1));
        System.out.println(singleNumber(A));
    }
}
