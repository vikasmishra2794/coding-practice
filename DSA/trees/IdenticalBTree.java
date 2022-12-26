package trees;
import java.util.*;
class Node {
    int val;
    Node left;
    Node right;
    Node(int d) {
        val = d;
        left = right = null;
    }
}
public class IdenticalBTree {
    public static int isSameTree(Node A, Node B) {
        if (A == null && B == null) {
            return 1;
        } else if ((A == null && B != null) || (B == null && A != null)) {
            return 0;
        }
        if (A.val == B.val) {
            return (isSameTree(A.left, B.left) == 1) && (isSameTree(A.right, B.right) == 1) ? 1 : 0;
        } else {
            return 0;
        }
    }
    public static Node buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int val = sc.nextInt();
        if (val == -1) {
            return null;
        }
        Node root = new Node(val);
        root.left = buildTree();
        root.right = buildTree();
        return root;
    }
    public static void main(String[] args) {
        Node A = buildTree();
        Node B = buildTree();
        System.out.println(isSameTree(A, B));
    }
}
