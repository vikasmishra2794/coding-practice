package GCD;

public class DivisorGame {
    public static int gcd(int num1, int num2) {
        while(num1 != 0) {
            int num_1 = num2%num1;
            int num_2 = num1;
            num1 = num_1;
            num2 = num_2;
        }
        return num2;
    }
    public static int solve(int A, int B, int C) {
        int count = 0;
        int fixedLcm = (B * C)/ gcd(B, C);
        int lcm = fixedLcm;
        while(A >= lcm) {
            count++;
            lcm += fixedLcm;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(solve(6, 1, 4));
    }
}
