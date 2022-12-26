package arrays;

import java.util.*;

public class ReverseInGroups {
    public static void arrayReverse(ArrayList<Integer> arr, int start, int end) {
        while(start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        double loopCount = (double)n/(double)k;
        int iterations = (int)Math.ceil(loopCount);
        for(int i = 1; i <= iterations; i++) {
            int itemsLeft = (i > 1) ? n - k * (i - 1): n;
            int start = k*i - k;
            int end = Math.min(k*i - 1, start + itemsLeft - 1);
            arrayReverse(arr, start, end);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(35, 56, 48, 21, 87));
        reverseInGroups(arr, 5, 77);
        for(int data: arr) {
            System.out.print(data+" ");
        }
    }
}
