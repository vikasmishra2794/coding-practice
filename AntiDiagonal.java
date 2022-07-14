// import java.util.*;

// public class AntiDiagonal {
//     public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
//         ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(5);
//         for(int i = 0; i < A.size(); i++) {
//             ArrayList<Integer> a1 = new ArrayList<Integer>();
//             for(int j = 0; j < A.get(i).size(); j++) {
//                 a1.add()
//                 result.get(i).add(j, A.get(j).get(i));
//                 result.add(e)
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(3);
//         ArrayList<Integer> a1 = new ArrayList<Integer>();
//         a1.add(1);
//         a1.add(2);
//         a1.add(3);
//         aList.add(a1);
  
//         ArrayList<Integer> a2 = new ArrayList<Integer>();
//         a2.add(4);
//         a2.add(5);
//         a2.add(6);
//         aList.add(a2);
  
//         ArrayList<Integer> a3 = new ArrayList<Integer>();
//         a3.add(7);
//         a3.add(8);
//         a3.add(9);
//         aList.add(a3);
//         ArrayList<ArrayList<Integer>> result = diagonal(aList);
//         for (int i = 0; i < result.size(); i++) {
//             for (int j = 0; j < result.get(i).size(); j++) {
//                 System.out.print(result.get(i).get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }
