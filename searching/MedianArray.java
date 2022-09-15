package searching;
import java.util.*;

public class MedianArray {
    // Youtube video https://youtu.be/NTop3VTjmxk
    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        if (b.size() < a.size()) return findMedianSortedArrays(b,  a);
        int i = 0, j = a.size();
        while(i <= j) {
            int cut1 = (i + j)>>1;
            int cut2 = (a.size() + b.size() + 1)/2 - cut1;
            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : a.get(cut1 - 1);
            int left2 = (cut2 == 1) ? Integer.MIN_VALUE: b.get(cut2 - 1);
            int right1 = (cut1 == a.size()) ? Integer.MAX_VALUE: a.get(cut1);
            int right2 = (cut2 == b.size()) ? Integer.MAX_VALUE : b.get(cut2);
            if(left1 <= right2 && left2 <= right1) {
                if((a.size() + b.size())%2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)/2.0);
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left2 > right1) {
                i = cut1 + 1;
            } else {
                j = cut1 - 1;
            }
        }
        return 0.0;
    }
    // Naive Approach
    // public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
    //     int i = 0, j = 0, k = 0;
    //     int[] result = new int[a.size() + b.size()];
    //     while(i < a.size() && j < b.size()) {
    //         if(a.get(i) <= b.get(j)) {
    //             result[k++] = a.get(i++);
    //         } else {
    //             result[k++] = b.get(j++);
    //         }
    //     }
    //     while(i < a.size()) {
    //         result[k++] = a.get(i++);
    //     }
    //     while(j < b.size()) {
    //         result[k++] = b.get(j++);
    //     }
    //     if(result.length%2 == 0) {
    //         return (result[result.length/2 - 1] + result[(result.length/2)])/2.0;
    //     }
    //     return result[result.length/2];
	// }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(4));
        System.out.println(findMedianSortedArrays(A,B));
    }
}
