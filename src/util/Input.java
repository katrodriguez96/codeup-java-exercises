package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // Scanner constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //Scanner methods
    public String getString() {
        System.out.println("Type anything:");
        return this.scanner.nextLine();
    }
    public boolean yesNo() {
        System.out.println("Yes or no?");
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d:\n", min, max);
        int userInput = this.scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInt(min, max);
        }
    }
    public int getInt() {
        System.out.println("Enter a number:");
        return this.scanner.nextInt();
    }
    public double getDouble (double min, double max) {
        System.out.printf("Enter a decimal number between %f and %f:\n", min, max);
        double userInput = this.scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getDouble(min, max);
        }
    }
    public double getDouble() {
        System.out.println("Enter a decimal number:");
        return this.scanner.nextDouble();
    }
}
