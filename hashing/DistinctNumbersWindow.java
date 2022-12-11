package hashing;
import java.util.*;

public class DistinctNumbersWindow {
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < B; i++) {
            hm.put(A.get(i), hm.getOrDefault(A.get(i), 0) + 1);
        }
        result.add(hm.size());
        for(int i = B; i< A.size(); i++) {
            hm.put(A.get(i - B), hm.get(A.get(i - B)) - 1);
            if(hm.get(A.get(i - B)) == 0) {
                hm.remove(A.get(i - B));
            }
            hm.put(A.get(i), hm.getOrDefault(A.get(i), 0) + 1);
            result.add(hm.size());
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,1,2,2));
        int B = 1;
        ArrayList<Integer> result = dNums(A, B);
        for(int data: result) {
            System.out.println(data);
        }
    }
}
