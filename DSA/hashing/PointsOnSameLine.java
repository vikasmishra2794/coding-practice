package hashing;
import java.util.*;

public class PointsOnSameLine {
    public static int gcd(int x, int y) {
        if(x==0) return y;
        return gcd(y%x,x);
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int maxi, overlapping, maximumPoints = Integer.MIN_VALUE;
        for(int i = 0; i < B.size(); i++) {
            maxi = 0;
            overlapping = 0;
            for(int j = i + 1; j < B.size(); j++) {
                if(A.get(i) == A.get(j) && B.get(i) == B.get(j)) {
                    overlapping++;
                } else {
                    int x = A.get(j) - A.get(i);
                    int y = B.get(j) - B.get(i);
                    String str = (x/gcd(x, y)) + "*" + (y/gcd(x, y));
                    hm.put(str, hm.getOrDefault(str, 0) + 1);
                    maxi = Math.max(maxi, hm.get(str));
                }
            }
            maximumPoints = Math.max(maximumPoints, maxi + overlapping + 1);
            hm.clear();
        }
        return maximumPoints;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(6, -5, 3, -6, 3, -9, -8, -7));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(5, 0, -8, 1, -1, 6, 3, -3));
        System.out.println(solve(A, B));
        // System.out.println(gcd(4, 2));
    }
}
