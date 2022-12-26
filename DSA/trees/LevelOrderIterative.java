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

public class LevelOrderIterative {    
    public static void traverseTree(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node front = queue.poll();
            System.out.println(front.val);
            if(front.left != null) {
                queue.add(front.left);
            }
            if(front.right != null) {
                queue.add(front.right);
            }
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
        Node root = buildTree();
        traverseTree(root);
    }
}
