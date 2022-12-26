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
public class LeftView {
    static int maxLevel = 0;
    static ArrayList<Integer> result = new ArrayList<Integer>();
    public static ArrayList<Integer> helper(Node A, int level) {
        if (A == null) {
            return null;
        }
        if (level > maxLevel) {
            result.add(A.val);
            maxLevel = level;
        }
        helper(A.left, level + 1);
        helper(A.right, level + 1);
        return result;
    }
    public static ArrayList<Integer> solve(Node A) {
        ArrayList<Integer> x =  helper(A, 1);
        for(int data: x) {
            System.out.println(data);
        }
        return x;
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
        Node root = buildTree();
        solve(root);
    }
}
