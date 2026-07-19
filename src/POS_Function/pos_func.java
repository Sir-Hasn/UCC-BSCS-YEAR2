package POS_Function;
import java.util.HashMap;
import java.util.Scanner;

public class pos_func {
    //for storing values; use hashmap
    //functions: stock tracking, adding/removing stocks || adding items to cart
    //flow: 1 || 2; 1 to track stock, 2 to add items to inventory || 3 to remove

    //Ask user for input
    static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("POS & Inventory System");
        System.out.println("1. Stock Tracking");
        System.out.println("2. Add Items to Inventory");
        System.out.println("3. Remove Items from Inventory");
        System.out.println("4. Exit");

        System.out.print("Input: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                //call class
                break;
            case 2:
                //call class
                break;
            case 3:
                //call class
                break;

        }
    }
}