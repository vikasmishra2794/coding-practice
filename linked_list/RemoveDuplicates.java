package linked_list;

class ListNode {
    int data;
    ListNode next;
    ListNode(int d) {
        data = d;
        next = null;
    }
}

public class RemoveDuplicates {
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
        int[] A = {1,1,2, 3,3};
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
    public static ListNode deleteDuplicates(ListNode A) {
        if (getLLSize(A) == 1) {
            return A;
        }
        ListNode prev = A, curr = A.next;
        while(curr != null) {
            if(prev.data == curr.data) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        ListNode A = createLinkedList();
        ListNode B =  deleteDuplicates(A);
        while(B != null) {
            System.out.println(B.data);
            B = B.next;
        }
    }
}
