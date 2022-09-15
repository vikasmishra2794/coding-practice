package searching;

public class SquareRoot {
    public static int sqrt(int A) {
        int start = 1, ans = 0;
        long end = A;
        while(start <= end) {
            long mid = (start + end)/2;
            if(mid * mid > A) {
                end = mid - 1;
            } else {
                ans = (int)mid;
                start = (int)(mid + 1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }
}
