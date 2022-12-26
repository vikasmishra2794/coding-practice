package linked_list;

class ListNode {
    int data;
    ListNode next;
    ListNode(int d) {
        data = d;
        next = null;
    }
}

public class RemoveNthNode {
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
        int[] A = {1};
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
    public static ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode t = A;
        int position = getLLSize(A) - B + 1;
        if (B > getLLSize(A) || position == 1) {
            A = A.next;
        } else {
            for(int i = 1; i < position; i++) {
                if (i == position - 1) {
                    t.next = t.next.next;
                    return A;
                }
                t = t.next;
            }
        }
        return A;
    }
    public static ListNode reverseList(ListNode A) {
        ListNode prev = null, curr = null, temp = null;
        if (getLLSize(A) == 1) {
            return A;
        }
        prev = null;
        curr = A;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode A = createLinkedList();
        ListNode B = removeNthFromEnd(A, 2);
        while(B != null) {
            System.out.println(B.data);
            B = B.next;
        }
    }
}
