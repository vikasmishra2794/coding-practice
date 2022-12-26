package modular_math;
import java.math.BigInteger;
public class OpenDoors {
    public static int solve(int A) {
        int res = 1;
        int i = 0, j = A;
        while(i <= j) {
            int mid = (i + j)/2;
            BigInteger midSQR = new BigInteger(""+mid * mid);
            BigInteger B = new BigInteger(""+A);
            int result = midSQR.compareTo(B);
            if(result == 0) {
                res = mid;
                break;
            } else if(result == 1) {
                j = mid - 1;
            } else {
                res = mid;
                i = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(solve(96629));
    }
}
