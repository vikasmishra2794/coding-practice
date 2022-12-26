package searching;
import java.util.*;

public class PaintersPartition {
    public static boolean canBepainted(int A, int B, ArrayList<Integer> C, long mid) {
        int count = 1;
        long totalLength = 0;
        for(int i = 0; i < C.size(); i++) {
            totalLength += (long)C.get(i)*(long)B;
            if(totalLength > mid) {
                count++;
                totalLength = (long)C.get(i)*(long)B;
            }
        }
        return count <= A;
    }
    public static int paint(int A, int B, ArrayList<Integer> C) {
        long start = (long)C.get(0) * (long)B, end = 0;
        for(int boardLength: C) {
            start = Math.max(start, boardLength*B);
            end += (long)boardLength * (long)B;
        }
        long ans = end;
        while(start <= end) {
            long mid = (long)(start + end)/2;
            if(canBepainted(A, B, C, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int)(ans % 10000003);
    }
    public static void main(String[] args) {
        ArrayList<Integer> C = new ArrayList<Integer>(Arrays.asList(1000000, 1000000));
        int B = 1000000;
        int A = 1;
        System.out.println(paint(A, B, C));
    }
}
