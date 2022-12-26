package linked_list;

import java.util.HashSet;

class ListNode {
    int data = 0;
    ListNode next = null;
    ListNode(int d) {
        data = d;
    }
}

public class ListCycle {
    public ListNode detectCycle(ListNode a) {
        HashSet<Integer> hs = new HashSet<Integer>();
        ListNode result = null;
        while(a != null) {
            if(!hs.contains(a.data)) {
                hs.add(a.data);
                a = a.next;
            } else {
                result = a ;
                break;
            }
        }
        return result;
	}
    public static void main(String[] args) {
        
    }
}
