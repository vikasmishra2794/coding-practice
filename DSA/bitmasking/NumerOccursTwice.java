package bitmasking;

import java.util.*;

public class NumerOccursTwice {
    public static int singleNumber(final List<Integer> A) {
        int result = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            result ^= A.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 1));
        System.out.println(singleNumber(A));
    }
}
