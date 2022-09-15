package searching;

import java.util.ArrayList;
import java.util.Arrays;

public class BitonicArraySearch {
    public static int binarySearchDec(ArrayList<Integer> A, int start, int end, int key) {
        while(start <= end) {
            int mid = (start + end)/2;
            if(A.get(mid) == key) {
                return mid;
            } else if (A.get(mid) < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int binarySearch(ArrayList<Integer> A, int start, int end, int key) {
        while(start <= end) {
            int mid = (start + end)/2;
            if(A.get(mid) == key) {
                return mid;
            } else if (A.get(mid) <= key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int getPivotIndex(ArrayList<Integer> A) {
        int i = 0, j = A.size() - 1;
        while(i <= j) {
            int mid = (i + j)/2;
            if(i == j && j == mid) {
                return mid;
            } else if(A.get(mid) > A.get(mid - 1) && A.get(mid) > A.get(mid + 1)) {
                return mid;
            } else if(A.get(mid) < A.get(mid - 1)) {
                j = mid - 1;
            } else if(A.get(mid) > A.get(mid - 1)) {
                i = mid + 1;
            }
        }
        return -1;
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int pivot = getPivotIndex(A);
        int firstArraySearch = binarySearch(A, 0, pivot - 1, B);
        int lastArraySearch = binarySearchDec(A, pivot, A.size() - 1, B);
        return Math.max(firstArraySearch, lastArraySearch);
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9, 10, 3, 2, 1));
        int B = 30;
        System.out.println(solve(A, B));
    }
}
