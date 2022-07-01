import java.util.*;

public class ChristmasTrees {
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int resultSum = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            int indexP = -1;
            int minP = Integer.MAX_VALUE;
            for(int j = 0; j < i; j++) {
                if(A.get(j) < A.get(i)) {
                    if(minP > B.get(j)) {
                        minP = B.get(j);
                        indexP = j;
                    }
                }
            }
            int indexR = -1;
            int minR = Integer.MAX_VALUE;
            for(int k = i + 1; k < n; k++) {
                if(A.get(k) > A.get(i)) {
                    if(minR > B.get(k)) {
                        minR = B.get(k);
                        indexR = k;
                    }
                }
            }
            if(indexP == -1 || indexR == -1) {
                continue;
            } else {
                resultSum = Math.min(resultSum, B.get(indexP) + B.get(indexR) + B.get(i));
            }
        }
        if (resultSum == Integer.MAX_VALUE) {
            return -1;
        }
        return resultSum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(
            Arrays.asList(100, 101, 100));
        ArrayList<Integer> B = new ArrayList<Integer>(
                Arrays.asList(2, 4, 5));
        System.out.println(solve(A, B));   
    }
}
