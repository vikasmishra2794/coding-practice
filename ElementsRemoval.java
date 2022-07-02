import java.util.*;

public class ElementsRemoval {
    public static int solve(ArrayList<Integer> A) {
        int result = 0;
        Collections.sort(A, Collections.reverseOrder());
        for(int i = 0; i < A.size(); i++) {
            result += A.get(i) * (i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5,1,3,6));
        System.out.println(solve(A));
    }
}