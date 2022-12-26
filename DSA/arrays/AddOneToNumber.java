package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddOneToNumber {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int addNum = A.get(A.size() - 1) + 1;
        int sum = addNum % 10;
        int carry = addNum / 10;
        result.add(sum);
        for(int i = A.size() - 2; i >= 0; i--) {
            addNum = A.get(i) + carry;
            sum = addNum % 10;
            carry = addNum / 10;
            result.add(sum);
        }               
        if(carry > 0) {
            result.add(carry);
        }
        int i = result.size() - 1;
        while(i >= 0 && result.get(i) == 0) {
            result.remove(i);
            i--;
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer> (Arrays.asList(0, 0, 1, 2, 3));
        ArrayList<Integer> B = new ArrayList<Integer> ();
        B = plusOne(A);
        for(int data: B) {
            System.out.print(data+" ");    
        }
    }
}
