package linked_list;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class MiddleElement {
    public static int printLinkedList(Node head, int position) {
        int count = 0;
        while(head != null) {
            count++;
            if(count == position) {
                return head.data;
            }
            head = head.next;
        }
        return -1;
    }
    public static int getLLSize(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static Node createLinkedList() {
        Node head = null, tail = null;
        int[] A = {1,2,3,4};
        int i = 0;
        while(i < A.length) {
            Node temp = new Node(A[i]);
            if(i == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
            i++;
        }
        return head;
    }
    public static int solve(Node A) {
        Node slow = A, fast = A;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return (getLLSize(A)%2 == 0) ? slow.data : slow.next.data;
    }
    public static void main(String[] args) {
        Node A = createLinkedList();
        System.out.println(solve(A));
    }
}
