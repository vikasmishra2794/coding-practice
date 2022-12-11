package trees;

import java.util.Scanner;

class Node {
    int val;
    Node left;
    Node right;
    Node(int d) {
        val = d;
        left = right = null;
    }
}
public class createTree {
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
    public static void traverseTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        traverseTree(root.left);
        traverseTree(root.right);
    }
    public static void main(String[] args) {
        Node root = buildTree();
        traverseTree(root);
    }
}
