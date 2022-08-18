package sorting;

import java.util.Arrays;

public class MergeSort {
    public static int merge(int A[], int start, int mid, int end) {
        int[] B = new int[A.length];
        int i = start;
        int j = mid + 1;
        int k = start;
        int count = 0;
        while(i <= mid && j <= end) {
            if(A[i] < A[j]) {
                B[k++] = A[i++];
            } else {
                B[k++] = A[j++];
                count += mid - i + 1;
            }
        }
        while (i <= mid) {
            B[k++] = A[i++];
        }
        while (j <= end) {
            B[k++] = A[j++];
        }
        for(int l = start; l <= end; l++) {
            A[l] = B[l];
        }
        return count;
        // System.out.println("count:::===="+count);
    }
    public static int sort(int[] A, int start, int end) {
        if(start >= end) {
            return 0;
        }
        int mid = (start + end)/2;
        int left = sort(A, start, mid);
        int right = sort(A, mid + 1, end);
        return left + right + merge(A, start, mid, end);
    }
    public static void main(String[] args) {
        int[] A = {3,2,1};
        System.out.println(sort(A, 0, 2));
        // System.out.println(Arrays.toString(A));
    }
}
