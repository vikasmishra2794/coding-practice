import java.util.*;

public class LargestNumber {
    public static String largestNumber(final List<Integer> A) {
    // Approach - 1
    //    ArrayList<String> arr = new ArrayList<String>();
    //    StringBuffer result = new StringBuffer();
    //    int k = 0;
    //    for(int i = 0; i < A.size(); i++) {
    //        if(A.get(i) != 0) k = 1;
    //        arr.add(""+A.get(i));
    //    }
    //    if (k == 0) return "0";
    //    Collections.sort(arr, new Comparator<String>() {
    //        public int compare(String ob1, String ob2) {
    //             if((ob1+ob2).compareTo(ob2+ob1) > 0) {
    //                 return -1;
    //             }  else {
    //                 return 1;
    //             }
    //        }
    //    });
    //    for(int i = 0; i < arr.size(); i++) {
    //        result.append(arr.get(i));
    //    }
    // Approach - 2
       StringBuffer result = new StringBuffer();
       String st[] = new String[A.size()];
       int k = 0;
       for(int i = 0; i < A.size(); i++) {
           if(A.get(i) != 0) k = 1;
           st[i] = ""+A.get(i);
       }
       if(k == 0) return "0";
       Arrays.sort(st, new Comparator<String>() {
           public int compare(String ob1, String ob2) {
               if((ob1+ob2).compareTo(ob2+ob1) > 0) {
                   return -1;
               } else {
                   return 1;
               }
           }
       });
       for(int i = 0; i < st.length; i++) {
           result.append(st[i]);
       }
       return result.toString();
    }
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 3, 9, 0));
        System.out.println(largestNumber(A));
    }
    
}
