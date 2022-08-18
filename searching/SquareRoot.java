package searching;

public class SquareRoot {
    public static int sqrt(int A) {
        int start = 1, end = A, ans = 0;
        while(start <= end) {
            long mid = (start + end)/2;
            long midSquare = mid * mid;
            if(midSquare > A) {
                end = mid - 1;
            } else {
                ans = start;
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(2147483647));
    }
}
