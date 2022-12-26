package hashing;

import java.util.*;

public class ArrayReorder {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int data: A) {
            hm.put(data, hm.getOrDefault(data, 0) + 1);
        }
        for(int data: B) {
            if(hm.containsKey(data)) {
                int times = hm.get(data);
                while(times > 0) {
                    result.add(data);
                    times--;
                }
                hm.remove(data);
            }
        }
        for(int data: A) {
            if(hm.containsKey(data)) {
                temp.add(data);
            }
        }
        Collections.sort(temp);
        result.addAll(temp);
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(100, 5, 11, 17));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(1,100));
        ArrayList<Integer> result = solve(A, B);
        for(int data: result) {
            System.out.println(data);
        }
    }
}
