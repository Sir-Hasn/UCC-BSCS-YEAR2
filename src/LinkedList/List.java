package LinkedList;
import java.io.*;


public class List {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList {
        Node head;
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        void print() {
            Node current = head;
            StringBuilder sb = new StringBuilder();
            while (current != null) {
                sb.append(current.data + " ");
                current = current.next;
            }
            sb.append("null");
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);

        list.print();
    }
}