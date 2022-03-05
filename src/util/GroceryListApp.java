package util;

import java.util.Scanner;

public class GroceryListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userCreate;
        do {
            System.out.println("Would you like to create a grocery list? [y/n]");
            userCreate = sc.nextLine();
            if (userCreate.equalsIgnoreCase("y")) {
                String userAdd;
                do {
                    System.out.println("Would you like to add an item to the grocery list? [y/n]");
                    userAdd = sc.nextLine();
                    if (userAdd.equalsIgnoreCase("y")) {
                        // ordered list of grocery categories to choose from
                        System.out.println("Please choose one of the following categories:");
                        System.out.println("|Produce| |Dairy| |Meat| |Frozen|");
                        // enter name of item
                        // enter quantity of item
                        // add another item or finalize list
                        // if final, show grocery list ordered alphabetically, grouped by category, and showing quantity
                        // BONUS: filter results by category
                        // SUPER BONUS: allow user to edit list items
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
}
