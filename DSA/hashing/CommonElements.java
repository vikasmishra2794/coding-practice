package hashing;
import java.util.*;

public class CommonElements {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int data: A) {
            hm1.put(data, hm1.getOrDefault(data, 0) + 1);
        }
        for(int data: B) {
            if(hm1.containsKey(data) &&  hm1.get(data) > 0) {
                result.add(data);
                hm1.put(data, hm1.get(data) - 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(2, 3, 1, 2));
        ArrayList<Integer> result = solve(A, B);
        for(int data: result) {
            System.out.println(data);
        }
    }
}
