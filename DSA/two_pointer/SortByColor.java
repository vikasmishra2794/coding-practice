package two_pointer;
import java.util.*;

// import sorting.MergeSort;

public class SortByColor {
    public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 0, 1, 2));
        ArrayList<Integer> B = sortColors(A);
        for(int data: B) {
            System.out.println(data);
        }
    }
}
