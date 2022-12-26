package dynamic_programming;

public class MinSqrCount {
    public static int solve(int n) {
        if (n < 4) {
            return n;
        } else {
            int num = n/2;
            while(num * num > n) {
                num--;
            }
            return 1 + solve(n - num * num);
        }
    }
    public static void main(String[] args) {
        System.out.println(solve(12));
    }
}
