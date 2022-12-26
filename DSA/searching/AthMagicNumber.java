package searching;

public class AthMagicNumber {
    public static int lcm(int num1, int num2) {
        int product = num1 * num2;
        while(num1 != 0) {
            int num_1 = num2%num1;
            int num_2 = num1;
            num1 = num_1;
            num2 = num_2;
        }
        return product/num2;
    }
    public static int solve(int A, int B, int C) {
        long lcm = (long)lcm(B, C);
        long low = Math.min(B, C), high = (long)Math.min(B, C) * A, ans = 2;
        while(low <= high) {
            long mid = (low + high)/2;
            long cntB = mid/B;
            long cntC = mid/C;
            long cntBC = mid/lcm;
            if(cntB + cntC - cntBC >= A) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int)(ans%1000000007);
    }
    public static void main(String[] args) {
        System.out.println(solve(4, 2, 3));
    }
}
