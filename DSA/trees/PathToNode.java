// package trees;

// public class PathToNode {
//     ArrayList<Integer> result = new ArrayList<Integer>();
//     public ArrayList<Integer> helper(TreeNode A, int B) {
//         if (A == null) {
//             return null;
//         } 
//         if (A.val == B) {
//             result.add(B);
//             return result;
//         } 
//         if (helper(A.left, B) != null || helper(A.right, B) != null) {
//             result.add(A.val);
//             return result;
//         }
//         return null;
//     }
//     public ArrayList<Integer> solve(TreeNode A, int B) {
//         helper(A, B);
//         Collections.reverse(result);
//         return result;
//     }
//     public static void main(String[] args) {
        
//     }   
// }
