package linked_list;

import java.util.Scanner;

class Node {
    int data = 0;
    Node next = null;
    Node(int d) {
        data = d;
    }
}
public class CrudOperation {
    static Node head = null, tail = null;
    public static int getLLSize(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static void insert_node(int position, int value) {
        Node newNode = new Node(value);
        if (position == 1) {
            head = newNode;
        } else {
            while(head.next != null) {
                head = head.next;
            }
            head.next = newNode;
        }
    }
    public static void delete_node(int position) {
        // @params position, integer
        Node curent = head, prev = null;
        int count = 1;
        if (position == 1) {
            head = head.next;
        } else {
            while(count < position) {
                prev = curent;
                curent = curent.next;
                count++;
            }
            prev.next = curent.next;
        }
    }

    public static void print_ll() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        // Output each element followed by a space
    }
    public static void main(String[] args) {
        
        // int position = 0;
        // int value = 0;
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < 5; i++) {
        // char option = (char)sc.nextInt();
        // switch(option) {
        //     case 1:  
        //     position = sc.nextInt();
        //     value = sc.nextInt();
        //     insert_node(position, value);
        //     break;
        //     case 2: print_ll();
        //     break;
        //     case 3: 
        //     position = sc.nextInt();
        //     value = sc.nextInt();
        //     delete_node(position);
        //     break;
        //     default: print_ll();
        //     break;
        // }
    }
    }
}
