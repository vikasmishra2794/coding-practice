package trees;
import java.util.ArrayList;
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
public class LevelOrder {
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
    public static ArrayList<Integer> traverseKthLevel(Node root, int k, ArrayList<Integer> result) {
        if (root == null) {
            return null;
        }
        if(k == 0) {
            result.add(root.val);
            return result;
        }
        traverseKthLevel(root.left, k - 1, result);
        traverseKthLevel(root.right, k - 1, result);
        return result;
    }
    public static int getTreeHeight(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.max(getTreeHeight(root.left), getTreeHeight(root.left)) + 1;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        Node root = buildTree();
        // System.out.println(getTreeHeight(root));
        for(int i = 0; i < getTreeHeight(root); i++) {
            result = traverseKthLevel(root, i, new ArrayList<Integer>());
            System.out.println();
            for(int data: result) {
                System.out.print(data+ " ");
            }
        }
        // for(ArrayList<Integer> arr: result1) {
        //     for(int data: arr) {
        //         System.out.println(data);
        //     }
        // }
    }
}
