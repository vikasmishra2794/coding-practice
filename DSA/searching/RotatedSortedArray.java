package searching;
import java.util.*;

public class RotatedSortedArray {
    public static int getPivot(final List<Integer> A) {
        int start = 0, end = A.size() - 1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(mid < end && A.get(mid) > A.get(mid + 1)) {
             return mid + 1;
            } else if (mid > start && A.get(mid) < A.get(mid - 1)) {
                return mid;
            } else if(A.get(mid) >= A.get(start)) {
                start = mid + 1;
            } else if(A.get(mid) < A.get(start)) {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int binarySearch(final List<Integer> A, int start, int end, int B) {
        while(start <= end) {
            int mid = (start + end)/2;
            if(A.get(mid) == B) {
                return mid;
            } else if(A.get(mid) <= B) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int search(final List<Integer> A, int B) {
        int pivot = getPivot(A);
        int firstArrayResult = binarySearch(A, 0, pivot - 1, B);
        int lastArrayResult = binarySearch(A, pivot, A.size() - 1, B);
        return Math.max(firstArrayResult, lastArrayResult);
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 7, 67, 133, 178));
        int B = 1;
        System.out.println(search(A, B));
    }
}
