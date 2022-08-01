package GCD;
import java.util.*;

public class GCDPair {
    public static int getMax(ArrayList<Integer> A) {
        int maxIndex = 0;
        int max = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            if(max < A.get(i)) {
                max = Math.max(A.get(i), max);
                maxIndex = i;
            }
        }
        return max;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int data: A) {
            hm.put(data, hm.getOrDefault(data, 0) + 1);
        }
        for(int i = 0; i < A.size(); i++) {
            int max = getMax(A);
            if(i == 0) {
                result.add(max);
                hm.put(max, hm.get(max) - 1);
            } else {
                for(int j = 0; j < result.size(); j++) {
                    hm.put(max, hm.get(max) - 2);
                }
                result.add(max);
                
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
