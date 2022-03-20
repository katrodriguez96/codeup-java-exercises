package bonus_arrayExercises;

import java.util.ArrayList;
import java.util.Scanner;
// create command line grocery list maker
public class GroceryListApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
//        before prompting the user to enter each item, ask how many items will be entered
        System.out.println("How many items are you adding to the grocery list?");
        int listLength = sc.nextInt();
//        for each item, the user should be prompted to enter the name, quantity, and category of each grocery item
        for (int i = 0; i == listLength; i++) {
            System.out.println("Enter item name:");
            String itemName = sc.nextLine();
            System.out.println("Enter item quantity:");
            int itemQuantity = sc.nextInt();
            System.out.println("Enter item category:");
            String itemCategory = sc.nextLine();
//            Create a `GroceryItem` class from which to instantiate `GroceryItem` objects to store in an array
            GroceryItem newItem = new GroceryItem(itemName, itemQuantity, itemCategory);
            groceryList.add(newItem);
        }
//        once the user has entered all items, print out all items grouped by category and alphabetized in each group

    }
}
