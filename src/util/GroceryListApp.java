package util;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {
    public static ArrayList<HashMap<String, Integer>> groceryList = new ArrayList<>();

    // GroceryList<CategoryList<Item, Quantity>>
    public static void groceryListApp() {
        Input sc = new Input();
        boolean loop = true;

        String userCreateList = sc.getString("Would you like to create a new grocery list? [y/n]");
        if (userCreateList.equals("y")) {
            System.out.println("Fill out the following to add an item to the list.");
            while (loop) {
                System.out.println("Select a category:");
                int userCategory = sc.getInt("1.Produce 2.Dairy 3.Meat 4.Other");
                String userItem;
                int userQuantity;
                GroceryItem newItem;
                switch (userCategory) {
                    case 1:
                        HashMap<String, Integer> produceList = new HashMap<>();
                        groceryList.add(produceList);
                        userItem = sc.getString("Enter the name of the item:");
                        userQuantity = sc.getInt("Enter the quantity of the item:");
                        newItem = new GroceryItem(userItem, userQuantity);
                        produceList.put(newItem.getName(), newItem.getQuantity());
                        break;
                    case 2:
                        HashMap<String, Integer> dairyList = new HashMap<>();
                        groceryList.add(dairyList);
                        userItem = sc.getString("Enter the name of the item:");
                        userQuantity = sc.getInt("Enter the quantity of the item:");
                        newItem = new GroceryItem(userItem, userQuantity);
                        dairyList.put(newItem.getName(), newItem.getQuantity());
                        break;
                    case 3:
                        HashMap<String, Integer> meatList = new HashMap<>();
                        groceryList.add(meatList);
                        userItem = sc.getString("Enter the name of the item:");
                        userQuantity = sc.getInt("Enter the quantity of the item:");
                        newItem = new GroceryItem(userItem, userQuantity);
                        meatList.put(newItem.getName(), newItem.getQuantity());
                        break;
                    case 4:
                        HashMap<String, Integer> otherList = new HashMap<>();
                        groceryList.add(otherList);
                        userItem = sc.getString("Enter the name of the item:");
                        userQuantity = sc.getInt("Enter the quantity of the item:");
                        newItem = new GroceryItem(userItem, userQuantity);
                        otherList.put(newItem.getName(), newItem.getQuantity());
                        break;
                    default:
                        System.out.println("Invalid input, try again.");
                }
                String addAnother = sc.getString("Would you like to add another item? [y/n]");
                if (addAnother.equals("n")) {
                    loop = false;
                }
            }
            System.out.println("groceryList = " + groceryList);
            for (HashMap<String, Integer> item: groceryList) {
                for (String key : item.keySet()) {
                    int value = item.get(key);
                    System.out.println("Item: " + key + " Quantity: " + value);
                }
            }
        } else if (userCreateList.equals("n")) {
            System.out.println("Now exiting application.");
        } else {
            System.out.println("Invalid input, try again.");
            groceryListApp();
        }
    }

    public static void main(String[] args) {
        groceryListApp();
    }

//    static HashMap<String, ArrayList<ArrayList<String>>> groceryList = new HashMap<>();
//    // <Category, List<Item<Name, Quantity>>>
//    // ArrayList<HashMap<String, Int>>
//    static ArrayList<ArrayList<String>> produceList = new ArrayList<>();
//    static ArrayList<ArrayList<String>> dairyList = new ArrayList<>();
//    static ArrayList<ArrayList<String>> meatList = new ArrayList<>();
//    static ArrayList<ArrayList<String>> otherList = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Input sc = new Input();
//        String userCreate;
//        do {
//            userCreate = sc.getString("Would you like to create a new grocery list? [y/n]");
//            if (userCreate.equalsIgnoreCase("y")) {
//                groceryList.clear();
//                groceryList.put("produce", produceList);
//                groceryList.put("dairy", dairyList);
//                groceryList.put("meat", meatList);
//                groceryList.put("other", otherList);
//                String userAdd;
//                do {
//                    userAdd = sc.getString("Would you like to add an item to the grocery list? [y/n]");
//                    if (userAdd.equalsIgnoreCase("y")) {
//                        // ordered list of grocery categories to choose from
//                        String userCategory = sc.getString("Please choose one of the following categories:\n|produce| |dairy| |meat| |other|");
//                        if (userCategory.equals("produce") || userCategory.equals("dairy") || userCategory.equals("meat") || userCategory.equals("other")) {
//                            // enter name of item
//                            String userItem = sc.getString("Enter the name of the item:");
//                            // enter quantity of item
//                            String userQuantity = String.valueOf(sc.getInt("Enter the quantity of the item:"));
//                            GroceryListApp.updateList(userCategory, addItem(userItem, userQuantity));
//                            // add another item or finalize list
//                            userAdd = sc.getString("Would you like to add another item? [y/n]");
//                        } else {
//                            System.out.println("Invalid input, try again.");
//                            break;
//                        }
//                    } else if (userAdd.equalsIgnoreCase("n")) {
//                        System.out.println("Finalizing list.");
//                        // if final, show grocery list ordered alphabetically, grouped by category, and showing quantity
//                        groceryList.forEach((key, value) -> {
//                            System.out.println(key); // produce
//                            System.out.println(value); // [[apple, 2], [banana, 5], [potatoes, 3]]
//                        });
//                        // BONUS: filter results by category
//                        // SUPER BONUS: allow user to edit list items
//                        break;
//                    } else {
//                        System.out.println("Invalid input, try again.2");
//                    }
//                } while (!userAdd.equalsIgnoreCase("n"));
//            } else if (userCreate.equalsIgnoreCase("n")) {
//                System.out.println("Now exiting application.");
//            } else {
//                System.out.println("Invalid input, try again.");
//            }
//        } while (!userCreate.equalsIgnoreCase("n"));
//    }
//
//    public static ArrayList<String> addItem(String name, String quantity) {
//        ArrayList<String> newItem = new ArrayList<>();
//        newItem.add(name); // [0, itemName]
//        newItem.add(quantity); // [1, itemQuantity]
//        return newItem;
//    }
//
//    public static void updateList(String category, ArrayList<String> newItem) {
//        ArrayList<ArrayList<String>> list = groceryList.get(category);
//        list.add(newItem);
//    }

}
