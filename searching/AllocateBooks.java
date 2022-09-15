// package searching;
// import java.util.*;

// public class AllocateBooks {
//     private static boolean checkPages(int maxpages, ArrayList<Integer> A, int students) {
//         int sumPages = 0, count = 0;
    
//         for (int i = 0; i < A.size(); i++) {
//           sumPages += A.get(i);
//           if (sumPages > maxpages) {
//             count++;
//             sumPages = A.get(i);
//           }
//         }
//         if (sumPages != 0) count++;
    
//         if (count <= students) {
//           return true;
//         } else {
//           return false;
//         }
//       }
//       public static int booksCanBeRead(ArrayList<Integer> A, int B, int mid) {
//         int count = 0, totalPage = 0;
//         for(int i = 0; i < A.size(); i++) {
//             if((totalPage + A.get(i)) <= mid) {
//                 totalPage += A.get(i);
//             } else {
//                 count++;
//                 totalPage = A.get(i);
//             }
//         }
//         if(totalPage > 0) {
//             count = count + 1;
//         }
//         return count;
//     }
//     public static int books(ArrayList<Integer> A, int B) {
//         if (B > A.size()) return -1;
//         int low = A.get(0), high = 0;
//         for(int page: A) {
//             low = Math.max(page, low);
//             high += page;
//         }
//         int ans = high;
//         while(low <= high) {
//             int mid = (low + high)/2;
//             if(booksCanBeRead(A, B, mid) <= B) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(12, 34, 67, 90));
//         int B = 2;
//         System.out.println(books(A, B));
//     }
// }
