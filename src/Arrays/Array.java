package Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = -1;

        while(true) {
            try {
                System.out.print("Array size: ");
                n = input.nextInt();
                if (n < 0) {
                    System.out.println("Invalid Input");

                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                input.next(); // Clear the invalid inputd
            }
        }
            String[] arr = new String[n];

            System.out.println("Add element in the array: ");
            for (int i = 0; i < n; i++){
                arr[i] = input.next();}

            for (int i = 0; i < n; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);}


    }
}