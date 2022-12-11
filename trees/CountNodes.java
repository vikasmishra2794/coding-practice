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
public class CountNodes {
    public static int countNode(Node A, int max) {
        int count = 0;
        if (A == null) {
            return 0;
        }
        if(A.val > max) {
            count++;
            max = A.val;
        }
        count += countNode(A.left, max);
        count += countNode(A.right, max);
        return count;
    }
    public static int solve(Node A) {
        int max = 0;
        return countNode(A, max);
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
        System.out.println(solve(A));
    }
}
