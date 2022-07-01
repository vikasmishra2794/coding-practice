import java.util.*;

public class MaximumPositivity {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int maxLength = 0, length = 0, minStart = -1, start = -1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) >= 0) {
                if(length == 0) {
                    start = i;
                }
                length++;
            } else {
                length = 0;
            }
            if(maxLength < length) {
                maxLength = length;
                minStart = start;
            }
        }
        for(int i = minStart; i < minStart + maxLength; i++) {
            result.add(A.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int data: inputArray) {
            A.add(data);
        }
        result = solve(A);
        for(int data: result) {
            System.out.println(data);
        }
    }
}