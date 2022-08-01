package prime_numbers;
import java.util.*;

public class LuckyNumbers {
    public static int solve(int A) {
        int luckyNumberCount = 0;
        int[] seiveArr = new int[A + 1];
        for(int i = 1; i <= A; i++) {
            seiveArr[i] = 0;
        }
        for(int i = 2; i * i <= A; i++) {
            for(int j = i * i; j <= A; j = j + i) {
                if(seiveArr[j] == 0)
                seiveArr[j] = i;
            }
        }
        for(int i = 6; i <= A; i++) {
            int element = i;
            HashSet<Integer> hs = new HashSet<Integer>();
            while(seiveArr[element] >= 1) {
                hs.add(seiveArr[element]);
                element /= seiveArr[element];
            }
            if(seiveArr[element] == 0) {
                hs.add(element);
            }
            if(hs.size() == 2) {
                luckyNumberCount++;
            }
        }
        return luckyNumberCount;
    }
    public static void main(String[] args) {
        System.out.println(solve(12));
    }
}
