package bitmasking;
import java.util.*;

public class TwoIntegerOnce {
    public static int getFirstSetBitPosition(int num) {
        int firstSetBitPosition = 1;
        while(num > 0) {
            int last_bit = num & 1;
            if(last_bit == 1) {
                break;
            }
            num >>= 1;
            firstSetBitPosition++;
        }
        return firstSetBitPosition;
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        int result = A.get(0);
        int firstNum = 0;
        int secondNum = 0;
        for(int i = 1; i < A.size(); i++) {
            result = result ^ A.get(i);
        }
        int firstSetBitPosition = getFirstSetBitPosition(result);
        for(int i = 0; i < A.size(); i++) {
            if(((A.get(i) >> firstSetBitPosition - 1) & 1) == 1) {
                firstNum = firstNum ^ A.get(i);
            } else {
                secondNum = secondNum ^ A.get(i);
            }
        }
        resultList.add(firstNum);
        resultList.add(secondNum);
        return resultList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2));
        ArrayList<Integer> B = solve(A);
        for(int data: B) {
            System.out.println(data);
        }
    }
}
