package util;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {
    static HashMap<String, ArrayList<ArrayList<String>>> groceryList = new HashMap<>();
    // <Category, List<Item<Name, Quantity>>>
    static ArrayList<ArrayList<String>> produceList = new ArrayList<>();
    static ArrayList<ArrayList<String>> dairyList = new ArrayList<>();
    static ArrayList<ArrayList<String>> meatList = new ArrayList<>();
    static ArrayList<ArrayList<String>> otherList = new ArrayList<>();

    public void main(String[] args) {
        Input sc = new Input();
        String userCreate;
        do {
            userCreate = sc.getString("Would you like to create a new grocery list? [y/n]");
            if (userCreate.equalsIgnoreCase("y")) {
                groceryList.clear();
                groceryList.put("produce", produceList);
                groceryList.put("dairy", dairyList);
                groceryList.put("meat", meatList);
                groceryList.put("other", otherList);
                String userAdd;
                do {
                    userAdd = sc.getString("Would you like to add an item to the grocery list? [y/n]");
                    if (userAdd.equalsIgnoreCase("y")) {
                        // ordered list of grocery categories to choose from
                        String userCategory = sc.getString("Please choose one of the following categories:\n|produce| |dairy| |meat| |other|");
                        if (userCategory.equals("produce") || userCategory.equals("dairy") || userCategory.equals("meat") || userCategory.equals("other")) {
                            // enter name of item
                            String userItem = sc.getString("Enter the name of the item:");
                            // enter quantity of item
                            String userQuantity = String.valueOf(sc.getInt("Enter the quantity of the item:"));
                            updateList(userCategory, addItem(userItem, userQuantity));
                            // add another item or finalize list
                            // if final, show grocery list ordered alphabetically, grouped by category, and showing quantity
                            // BONUS: filter results by category
                            // SUPER BONUS: allow user to edit list items
                        } else {
                            System.out.println("Invalid input, try again.");
                            break;
                        }
                    } else if (userAdd.equalsIgnoreCase("n")) {
                        System.out.println("Restarting application.");
                        break;
                    } else {
                        System.out.println("Invalid input, try again.");
                    }
                } while (!userAdd.equalsIgnoreCase("n"));
            } else if (userCreate.equalsIgnoreCase("n")) {
                System.out.println("Now exiting application.");
            } else {
                System.out.println("Invalid input, try again.");
            }
        } while (!userCreate.equalsIgnoreCase("n"));
    }

    public static ArrayList<String> addItem(String name, String quantity) {
        ArrayList<String> newItem = new ArrayList<>();
        newItem.add(name); // [0, itemName]
        newItem.add(quantity); // [1, itemQuantity]
        return newItem;
    }

    public void updateList(String category, ArrayList<String> newItem) {
        ArrayList<ArrayList<String>> list = groceryList.get(category);
        list.add(newItem);
    }

}
