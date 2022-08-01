package GCD;
import java.util.*;

public class DeleteOne {
    public static int gcd(int num1, int num2) {
        while(num1 != 0) {
            int num_1 = num2%num1;
            int num_2 = num1;
            num1 = num_1;
            num2 = num_2;
        }
        return num2;
    }
    public static int solve(ArrayList<Integer> A) {
        int[] prefixSum = new int[A.size()];
        int[] suffixSum = new int[A.size()];
        prefixSum[0] = gcd(0, A.get(0));
        suffixSum[A.size() - 1] = gcd(0, A.get(A.size() - 1));
        for(int i = 1; i < A.size(); i++) {
            prefixSum[i] = gcd(prefixSum[i-1], A.get(i));
        }
        for(int i = A.size() - 2; i >= 0; i--) {
            suffixSum[i] = gcd(suffixSum[i+1], A.get(i));
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.size(); i++) {
            int g = 0;
            if(i == 0) {
                g = suffixSum[i + 1];
            } else if(i == A.size() - 1) {
                g = prefixSum[i - 1];
            } else {
                g = gcd(prefixSum[i - 1], suffixSum[i + 1]);
            }
            max = Math.max(max, g);
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, 15, 30));
        System.out.println(solve(A));
    }
}
