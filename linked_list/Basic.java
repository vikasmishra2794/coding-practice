package linked_list;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class Basic {
    public static void main(String[] args) {
        Node head = null, tail = null;
        int i = 1;
        while(i <= 10) {
            Node temp = new Node(i*10);
            if(i == 1) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
            i++;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }
}
