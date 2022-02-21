import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        add(5, 3);
//        subtract(5, 3);
//        multiply(5, 3);
//        divide(5, 3);
//        remainder(5, 3);
//        getInteger(5, 10);
//        factorial();
        diceRoll();
    }
    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    public static void multiply(int num1, int num2) {
//        System.out.println(num1 * num2);
        int result = 0;
        for(int i = 1; i <= num1; i++) {
            result += num2;
        } // not sure how to do this with recursion
        System.out.println(result);
    }
    public static void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }
    public static void remainder(int num1, int num2) {
        System.out.println(num1 % num2);
    }
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInteger(min, max);
        }
    }
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        String userContinue = "y";
        do {
            System.out.print("Enter a number between 1 and 20: ");
            int userInt = scanner.nextInt();
            if (userInt < 1 || userInt > 20) {
                System.out.println("Number outside range. Try again.");
                continue;
            }
//            long factorial = 1;
//            for (int i = userInt; i > 1; i--) {
//                factorial *= i;
//            }
            long factorial = recursiveFactorial(userInt);
            System.out.printf("%d! = %d\n", userInt, factorial);
            System.out.println("Do you wish to continue? [y/n]");
            userContinue = scanner.nextLine();
        } while (userContinue.equalsIgnoreCase("y"));
    }
    public static long recursiveFactorial(int userInt) {
        if (userInt == 1) {
            return userInt;
        }
        return userInt * recursiveFactorial(userInt - 1);
    }
    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        String userContinue;
        do {
            System.out.print("Enter the number of sides for your pair of dice: ");
            int sides = scanner.nextInt();
            System.out.printf("Die 1: %d Die 2: %d\n", rollDie(sides), rollDie(sides));
            System.out.println("Roll again? [y/n]");
            userContinue = scanner.next();
        } while (userContinue.equalsIgnoreCase("y"));
    }
    public static int rollDie(int sides) {
        return (int) (Math.random() * sides + 1);
    }
}
