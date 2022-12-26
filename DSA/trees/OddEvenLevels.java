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
public class OddEvenLevels {
    public static int traverseTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int level = 2, evenSum = 0, oddSum = root.val;
        while(!queue.isEmpty()) {
            TreeNode front = queue.poll();
            if (front == null) {
                level++;
                if(queue.size() > 1) {
                    queue.add(null);
                }
                continue;
            }
            if(front.left != null) {
                if(level % 2 == 0) {
                    evenSum += front.left.val;
                } else {
                    oddSum += front.left.val;
                }
                queue.add(front.left);
            }
            if(front.right != null) {
                if(level % 2 == 0) {
                    evenSum += front.right.val;
                } else {
                    oddSum += front.right.val;
                }
                queue.add(front.right);
            }
        }
        return oddSum - evenSum;
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
        TreeNode root = buildTree();
        System.out.println(traverseTree(root));
    }
}
