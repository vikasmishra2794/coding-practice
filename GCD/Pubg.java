package GCD;
import java.util.*;

public class Pubg {
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
        int g = 0;
        for(int i = 0; i < A.size(); i++) {
            g = gcd(g, A.get(i));
        }
        return g;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 3, 4));
        System.out.println(solve(A));
    }
}
