package linked_list;
class ListNode {
    int data = 0;
    ListNode next = null;
    ListNode(int d) {
        data = d;
    }
}
public class MergeTwoSortedLL {
    public static ListNode createLinkedList(int[] A) {
        ListNode head = null, tail = null;
        // int[] A = {43};
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
    public static void main(String[] args) {
        int[] arr1 = {5, 8, 20};
        int[] arr2 = {4, 11, 15};
        ListNode A = createLinkedList(arr1);
        ListNode B = createLinkedList(arr2);
        ListNode C = mergeTwoLists(A, B);
        while(C != null) {
            System.out.println(C.data);
            C = C.next;
        }
    }
}
