package linked_list;

class ListNode {
    int data;
    ListNode next;
    ListNode(int d) {
        data = d;
        next = null;
    }
}

public class ReverseLL {
    
    public static ListNode createLinkedList() {
        ListNode head = null, tail = null;
        int[] A = {1,2,3,4,5};
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

    public static ListNode reverseList(ListNode A) {
        ListNode prev = null, current = A, temp;
        while(current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode A = createLinkedList();
        ListNode B = reverseList(A);
        while(B != null) {
            System.out.println(B.data);
            B = B.next;
        }
    }
}
