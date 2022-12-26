package searching;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedInsertPosition {
    public static int searchInsert(ArrayList<Integer> A, int B) {
        int i = 0, j = A.size() - 1;
        while(i <= j) {
            int mid = (i + j)/2;
            if(A.get(mid) == B) {
                return mid;
            } else if(i == mid && B < A.get(mid)) {
                return mid;
            } else if(j == mid && B > mid) {
                return mid + 1;
            } else if (A.get(mid) > B) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6));
        int B = 0;
        System.out.println(searchInsert(A, B));
    }
}
