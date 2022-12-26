package linked_list;


class ListNode {
     public int data;
     public ListNode next;
     ListNode(int x) { data = x; next = null; }
 }
  
public class PalindromeList {
    public static ListNode middleList(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, temp;
        while(current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static int lPalin(ListNode A) {
        if (A == null || A.next == null) {
            return 1;
        }
        ListNode middleNode = middleList(A).next;
        middleNode = reverseList(middleNode);
        while(middleNode != null) {
            if(A.data != middleNode.data) {
                return 0;
            }
            A = A.next;
            middleNode = middleNode.next;
        }
        return 1;
    }
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
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        ListNode A = createLinkedList(arr);
        System.out.println(lPalin(A));
    }
}
