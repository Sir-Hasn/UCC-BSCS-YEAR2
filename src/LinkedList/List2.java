package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class List2 {
    //harcoded linked list
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Element 1");
        list1.add("Element 2");
        list1.add("Element 3");
        System.out.println("Linked List elements: " + list1);

        //user-input
        Scanner input = new Scanner(System.in);
        LinkedList<String> list2 = new LinkedList<String>();

        System.out.print("List size: ");
        int n = input.nextInt();

        System.out.println("Add element to the list: ");
        for (int i = 0; i < n; i++) {
            String element = input.next();
            list2.add(element);
        }
        System.out.println("List elements: " + list2);
        input.close();
    }
}
