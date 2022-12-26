package linked_list;

import java.util.HashSet;

class ListNode {
    int data = 0;
    ListNode next = null;
    ListNode(int d) {
        data = d;
    }
}
public class RemoveLoop {
    public ListNode solve(ListNode A) {
        ListNode prev = null, current = A;
        HashSet<Integer> hs = new HashSet<Integer>();
        while(current != null) {
            if(!hs.contains(current.data)) {
                hs.add(current.data);
            } else {
                prev.next = null;
                break;
            }
            prev = current;
            current = current.next;
        }
        return A;
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
        
    }
}
