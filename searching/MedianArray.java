package searching;
import java.util.*;

public class MedianArray {
    // Naive Approach
    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[a.size() + b.size()];
        while(i < a.size() && j < b.size()) {
            if(a.get(i) <= b.get(j)) {
                result[k++] = a.get(i++);
            } else {
                result[k++] = b.get(j++);
            }
        }
        while(i < a.size()) {
            result[k++] = a.get(i++);
        }
        while(j < b.size()) {
            result[k++] = b.get(j++);
        }
        if(result.length%2 == 0) {
            return (result[result.length/2 - 1] + result[(result.length/2)])/2.0;
        }
        return result[result.length/2];
	}
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(4));
        System.out.println(findMedianSortedArrays(A,B));
    }
}
