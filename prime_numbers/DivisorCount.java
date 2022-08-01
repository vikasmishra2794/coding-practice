package prime_numbers;
import java.util.*;

public class DivisorCount {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
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
        for(int i = 0; i < A.size(); i++) {
            int element = A.get(i);
            int divisorCount = 1;
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            if(element == 1) {
                result.add(1);
                continue;
            }
            while(seiveArr[element] >= 1) {
                hm.put(seiveArr[element], hm.getOrDefault(seiveArr[element], 0) + 1);
                element /= seiveArr[element];
            }
            if(seiveArr[element] == 0) {
                hm.put(element, hm.getOrDefault(element, 0) + 1);
            }
            for (int data : hm.values()) {
                divisorCount *= (data + 1);
            }
            result.add(divisorCount);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> result = solve(A);
        for(int data: result) {
            System.out.println(data);
        }
    }
}
