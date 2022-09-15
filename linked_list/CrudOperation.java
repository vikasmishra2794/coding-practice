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
    public static int getLLSize(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static void insert_node(int position, int value) {
        // Node head = null, tail = null;
        // if (position == 1) {
        //     head = new Node(value);
        //     tail = head;
        // } else if (position + )
    }
    public static void delete_node(int position) {
        // @params position, integer
    }

    public static void print_ll() {
        // Output each element followed by a space
    }
    public static void main(String[] args) {
        int position = 0;
        int value = 0;
        Scanner sc = new Scanner(System.in);
        char option = (char)sc.nextInt();
        switch(option) {
            case 'i':  
            position = sc.nextInt();
            value = sc.nextInt();
            insert_node(position, value);
            break;
            case 'p': print_ll();
            break;
            case 'd': 
            position = sc.nextInt();
            value = sc.nextInt();
            delete_node(position);
            break;
            default: print_ll();
            break;
        }
    }
}
