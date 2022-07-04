import java.util.*;

public class ShaggyDistance {
    public static int minimumDistance(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.size(); i++) {
            if(!hm.containsKey(A.get(i))) {
                hm.put(A.get(i), i);
            } else {
                int shaggyDistance = i - hm.get(A.get(i)) > 0 ? i - hm.get(A.get(i)): hm.get(A.get(i)) - i;
                min = Math.min(min, shaggyDistance);
            }
        }
        if(min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 1));
        System.out.println(minimumDistance(A));
    }
}