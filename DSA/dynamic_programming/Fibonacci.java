package dynamic_programming;
import java.util.*;

public class Fibonacci {
    public static int fibonacci(int n, int[] ans) {
        if (n == 0 || n== 1) {
            return n;
        } else if (ans[n] == 1) {
            return ans[n];
        } else {
            ans[n] = fibonacci(n-1, ans) + fibonacci(n-2, ans);
            return ans[n];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[] = new int[n+1];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = 0;
        }
        System.out.println(fibonacci(n, ans));
    }
}
