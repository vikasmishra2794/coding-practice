package linked_list;
class ListNode {
    int data = 0;
    ListNode next = null;
    ListNode(int d) {
        data = d;
    }
}
public class SortLL {
    public static ListNode createLinkedList(int[] A) {
        ListNode head = null, tail = null;
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
    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head = null;
        if(A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }
        if(A.data <= B.data) {
            head = A;
            A = A.next;
            head.next = mergeTwoLists(A, B);
        } else {
            head = B;
            B = B.next;
            head.next = mergeTwoLists(A, B);
        }
        return head;
    }
    public static ListNode getMidNode(ListNode head) {
        ListNode slow = head, fast = head.next;
        // if(fast.next.next == null) {
        //     return slow;
        // }
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode sortList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode midNode = getMidNode(A);
        ListNode midNext = midNode.next;
        midNode.next = null;
        ListNode X = sortList(A);
        ListNode Y = sortList(midNext);
        return mergeTwoLists(X, Y);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 8};
        ListNode A = createLinkedList(arr);
        ListNode result = sortList(A);
        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
