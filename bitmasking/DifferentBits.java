package bitmasking;
import java.util.*;

public class DifferentBits {
    public int cntBits(ArrayList<Integer> A) {
        int cntBits = 0;
        for(int i = 0; i < 31; i++) {
            int zeroCount = 0;
            int oneCount = 0;
            for(int j = 0; j < A.size(); j++) {
                if((A.get(j) & 1<<i) > 0) {
                    oneCount++;
                } else {
                    zeroCount++;
                }
            }
            cntBits = cntBits + (oneCount * zeroCount);
        }
        return ((cntBits * 2)%1000000007);
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,3,5));
        DifferentBits obj = new DifferentBits();
        System.out.println(obj.cntBits(A));
    }
}
