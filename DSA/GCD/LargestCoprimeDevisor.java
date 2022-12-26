package GCD;

public class LargestCoprimeDevisor {
    public static int gcd(int num1, int num2) {
        while(num1 != 0) {
            int num_1 = num2%num1;
            int num_2 = num1;
            num1 = num_1;
            num2 = num_2;
        }
        return num2;
    }
    // Naive Approach
    public static int cpFact(int A, int B) {
        int max = Integer.MIN_VALUE;
        if (A <= 3 && A == B) {
            return 1;
        } else if(A <= 3) {
            return A;
        }
        for(int x = 1;  x*x <= A; x++) {
            if((A % x == 0 && gcd(x, B) == 1)) {
                max = Math.max(max,x);
            }
            if(A % (A/x) == 0 && gcd(A/x, B) == 1) {
                max = Math.max(max,A/x);
            }
        }
        if(max == Integer.MIN_VALUE) {
            return 1;
        }
        return max;
    }
    // optimized Approach
    public static int solve(int A, int B) {
        while(gcd(A, B) != 1) {
            int g = gcd(A, B);
            A /= g;
        }
        return A;
    }
    public static void main(String[] args) {
        System.out.println(solve(24,36));
    }
}
