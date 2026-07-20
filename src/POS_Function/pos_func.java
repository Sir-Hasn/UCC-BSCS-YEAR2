package POS_Function;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
//for storing values; use hashmap
//functions: adding, removing stocks
//flow: 1 to add items, 2 to remove
public class pos_func {
    //Ask user for input
    static void main (String[] args){

        inventoryProg in = new inventoryProg();
        clearConsole clear = new clearConsole();
        Scanner input = new Scanner(System.in);

        while(true) {
            clear.clear();

            System.out.println("POS & Inventory System Main Menu");
            System.out.println("1. Add Items to Inventory");
            System.out.println("2. Remove Items from Inventory");
            System.out.println("3. Exit");
            System.out.print("Input: ");
            int n;
            try {
                n = input.nextInt();
                if (n < 1 || n > 3) {
                    System.out.println("Enter a valid input. [1-3]");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid Input");
                input.next();
                continue;
            }

            switch (n) {
                case 1 -> {
                    clear.clear();
                    in.addItem(input);
                }
                case 2 -> {
                    clear.clear();
                    in.removeItem(input);
                }
                case 3 -> {
                    clear.clear();
                    System.exit(0);
                }
                default -> System.out.println("Invalid Input.");
            }
        }
    }
}

class inventoryProg {
    private Map<Integer, String> productStock = new HashMap<>();
    clearConsole clear = new clearConsole();
    private int idCounter = 1;

    public void addItem(Scanner input) {
        System.out.println("[Add Item to Inventory]");
        System.out.print("Enter product name: ");
        input.nextLine();
        String itemName = input.nextLine().trim();

        boolean isDupli = productStock.values().stream().anyMatch(item -> item.equalsIgnoreCase(itemName));
        if (isDupli) {
            System.out.println("Error: " + itemName + " already exists.");
            System.out.println("Enter key to continue.");
            clear.clear2(input);
            return;
        }

        //auto increment
        int itemId = idCounter++;
        productStock.put(itemId, itemName);
        System.out.println("Successfully added: " + "[" + itemName + "]");
        System.out.println("Item ID: " + "[" + itemId + "]");
        System.out.println("Enter key to continue.");
        clear.clear2(input);
    }

    public void removeItem(Scanner input){
        while(true) {
            System.out.println("Remove an Item from Inventory");
            System.out.print("1.Remove item \n");
            System.out.print("2.Return to main menu \n");
            System.out.print("Input: ");
            int n;
            try {
                n = input.nextInt();
                if (n < 1 || n > 2) {
                    System.out.println("Enter a valid input. [1-2]");
                    System.out.println("Enter key to continue.");
                    clear.clear2(input);
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid Input");
                input.nextLine();
                System.out.println("Enter key to continue.");
                clear.clear2(input);
                continue;
            }
            if (n == 2) {
                return;
            } else {
                clear.clear();
                System.out.println("Remove an Item from Inventory");
                System.out.print("Item ID to remove: ");
                while (!input.hasNextInt()) {
                    System.out.println("Error: Characters are not allowed.");
                    input.next();
                    System.out.print("Enter a valid item ID: ");
                }
                String itemName = productStock.remove(input.nextInt());
                if (itemName == null) {
                    input.nextLine();
                    System.out.println("Product does not exist.");
                    System.out.println("Enter key to continue.");
                    clear.clear2(input);
                } else {
                    input.nextLine();
                    System.out.print("Item " + "[" + itemName + "]" + " successfully removed.\n");
                    System.out.println("Enter key to continue.");
                    clear.clear2(input);
                }
            }
        }
    }
}

class clearConsole {
    public void clear () {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void clear2 (Scanner input) {
        input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}