package searching;

import java.util.*;

public class PeakElement {
    public static int solve(ArrayList<Integer> A) {
        int i = 0, j = A.size() - 1;
        while(i <= j) {
            int mid = (i + j)/2;
            if (mid == A.size() - 1) {
                return A.get(mid);
            } else if (mid == 0 && A.get(mid) >= A.get(mid + 1)) {
                return A.get(mid);
            } else if (mid == 0 && A.get(mid) <= A.get(mid + 1)) {
                i = mid + 1;
            } else if(A.get(mid) >= A.get(mid - 1) && A.get(mid) >= A.get(mid + 1)) {
                return A.get(mid);
            } else if (A.get(mid) >= A.get(mid - 1) && A.get(mid) <= A.get(mid + 1)) {
                i = mid + 1;
            } else if(A.get(mid) <= A.get(mid - 1) && A.get(mid) >= A.get(mid + 1)) {
                j = mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2,3));
        System.out.println(solve(A));
    }
}
