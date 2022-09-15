package linked_list;
class ListNode {
    int data;
    ListNode next;
    ListNode(int d) {
        data = d;
        next = null;
    }
}
public class DeleteMiddle {
    public static int getLLSize(ListNode A) {
        int count = 0;
        while(A != null) {
            count++;
            A = A.next;
        }
        return count;
    }
    public static ListNode createLinkedList() {
        ListNode head = null, tail = null;
        int[] A = {43};
        int i = 0;
        while(i < A.length) {
            ListNode temp = new ListNode(A[i]);
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
    public static ListNode solve(ListNode A) {
        int size = getLLSize(A);
        int middle = ((size % 2 == 0)) ? size/2 + 1 : (int)Math.ceil(size/2.0);
        ListNode prev = A;
        ListNode current = A;
        int count = 1;
        if (size == 1) {
            return null;
        }
        while(count < middle) {
            prev = current;
            current = current.next;
            count++;
        }
        prev.next = current.next;
        return A;
    }
    public static void main(String[] args) {
        ListNode A = createLinkedList();
        ListNode head = solve(A);
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
