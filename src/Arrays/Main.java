package Arrays;
//Simple program that shows/illustrates arrays (with java)
//Primitive array, cant input string
//Directly storing values in memory, cant store objects

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the number of elements in the array: ");
            int n = input.nextInt();
            int[] arr = new int[n];

            System.out.println("What element would you add to the array? ");
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Enter an integer.");
        }
    }
}