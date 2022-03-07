package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public String prompt;

    // Input constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //Input methods
    public String getString() {
        this.prompt = "Type anything:";
        System.out.println(this.prompt);
        return this.scanner.nextLine();
    }
    public String getString(String userPrompt) {
        this.prompt = userPrompt;
        System.out.println(this.prompt);
        return this.scanner.nextLine();
    }
    public boolean yesNo() {
        this.prompt = "Yes or no?";
        System.out.println(this.prompt);
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public boolean yesNo(String userPrompt) {
        this.prompt = userPrompt;
        System.out.println(this.prompt);
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d:\n", min, max);
        int userInput = Integer.parseInt(this.scanner.nextLine());
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInt(min, max);
        }
    }
    public int getInt(int min, int max, String userPrompt) {
        this.prompt = userPrompt;
        System.out.println(this.prompt);
        int userInput = Integer.parseInt(this.scanner.nextLine());
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInt(min, max);
        }
    }
    public int getInt() {
        this.prompt = "Enter a number:";
        System.out.println(this.prompt);
        return Integer.parseInt(this.scanner.nextLine());
    }
    public int getInt(String userPrompt) {
        this.prompt = userPrompt;
        System.out.println(this.prompt);
        return Integer.parseInt(this.scanner.nextLine());
    }
    public double getDouble(double min, double max) {
        System.out.printf("Enter a decimal number between %f and %f:\n", min, max);
        double userInput = this.scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getDouble(min, max);
        }
    }
    public double getDouble(double min, double max, String userPrompt) {
        this.prompt = userPrompt;
        System.out.println(this.prompt);
        double userInput = this.scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getDouble(min, max, userPrompt);
        }
    }
    public double getDouble() {
        this.prompt = "Enter a decimal number:";
        System.out.println(this.prompt);
        return this.scanner.nextDouble();
    }
    public double getDouble(String userPrompt) {
        this.prompt = userPrompt;
        System.out.println(this.prompt);
        return this.scanner.nextDouble();
    }
}
