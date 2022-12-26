package prime_numbers;
import java.util.*;

public class DistinctPrimes {
    public static int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        for(int data: A) {
            max = Math.max(max, data);
        }
        int[] seiveArr = new int[max + 1];
        for(int i = 1; i <= max; i++) {
            seiveArr[i] = 0;
        }
        for(int i = 2; i * i <= max; i++) {
            for(int j = i * i; j <= max; j = j + i) {
                if(seiveArr[j] == 0)
                seiveArr[j] = i;
            }
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < A.size(); i++) {
            int element = A.get(i);
            if(element <= 1) {
                continue;
            }
            while(seiveArr[element] >= 1) {
                hs.add(seiveArr[element]);
                element /= seiveArr[element];
            }
            if(seiveArr[element] == 0) {
                hs.add(element);
            }
        }
        return hs.size();
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(96, 98, 5, 41, 80 ));
        System.out.println(solve(A));
    }
}
