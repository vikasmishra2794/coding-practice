import java.util.*;

public class Dictionary {
    public static boolean compareString(String ob1, String ob2, HashMap<Integer, Integer> hm) {
        int i = 0, j = 0;
        while(i < ob1.length() && j < ob2.length()) {
            int key1 = ob1.charAt(i);
            int key2 = ob2.charAt(j);
            if(hm.get(key1) > hm.get(key2)) {
                return false;
            } else if(hm.get(key1) < hm.get(key2)) {
                return true;
            }
            i++;
            j++;
        }
        // if(i == ob1.length() - 1 || j == ob2.length() - 1) {
            return ob2.length() > ob1.length() ? true : false;
        // }

    }
    public static int isWordSorted(ArrayList<String> A, String B) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < B.length(); i++) {
            int key = B.charAt(i);
            hm.put(key, i);
        }

        for(int i = 0; i < A.size() - 1; i++) {
            if(!compareString(A.get(i), A.get(i+1), hm)) {
                return 0;
            }
        }
        return 1;
        // Collections.sort(A, new Comparator<String>(){
        //     public int compare(String ob1, String ob2) {
        //         int i = 0, j = 0;
        //         while(i < ob1.length() && j < ob2.length()) {
        //             if(ob1.charAt(i) > ob2.charAt(j)) {
        //                 return 1;
        //             } else if(ob1.charAt(i) < ob2.charAt(j)) {
        //                 return -1;
        //             }
        //         }
        //     }
        // });
        // return 1;
    }
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>(Arrays.asList("fine", "none", "no"));
        String B = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(isWordSorted(A, B));
    }
}
