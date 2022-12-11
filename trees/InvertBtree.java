package trees;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int d) {
        val = d;
        left = right = null;
    }
}

public class InvertBtree {
    public static TreeNode invertTree(TreeNode A) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        while(!queue.isEmpty()) {
            TreeNode front = queue.poll();
            if (front != null) {
                TreeNode temp = front.left;
                front.left = front.right;
                front.right = temp;
                queue.add(front.left);
                queue.add(front.right);
            }
        }
        return A;
    }
    public static void printTree(TreeNode A) {
        if (A == null) {
            return;
        }
        System.out.println(A.val);
        printTree(A.left);
        printTree(A.right);
    }
    public static TreeNode buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int val = sc.nextInt();
        if (val == -1) {
            return null;
        }
        TreeNode root = new TreeNode(val);
        root.left = buildTree();
        root.right = buildTree();
        return root;
    }
    public static void main(String[] args) {
        TreeNode A =  buildTree();
        invertTree(A);
        printTree(A);
    }
}
