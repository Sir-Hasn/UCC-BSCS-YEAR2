package Arrays;
//Non-primitive array, u can insert string
//stores String objects, stores a reference instead of directly storing values in memory

import java.util.Scanner;
public class Nonprim{
     static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        String[] arr = new String[n];

        System.out.println("Add element to the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}

