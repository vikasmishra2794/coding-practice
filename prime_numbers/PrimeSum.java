package prime_numbers;
import java.util.*;

public class PrimeSum {
    public static ArrayList<Integer> primesum(int A) {
        boolean[] seiveArr = new boolean[A + 1];
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 2; i <= A; i++) {
            seiveArr[i] = true;
        }
        for(int i = 2; i * i <= A; i++) {
            for(int j = i * i; j <= A; j = j + i) {
                seiveArr[j] = false;
            }
        }
        for(int i = 2; i <= A; i++) {
            if (seiveArr[i] && (A - i <= A) && seiveArr[A - i]) {
                result.add(i);
                result.add(A - i);
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> result = primesum(44);
        for(int data: result) {
            System.out.println(data);
        }
    }
}
