import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        add(5, 3);
        subtract(5, 3);
        multiply(5, 3);
        divide(5, 3);
        remainder(5, 3);
        getInteger(5, 10);
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
    public static void getInteger(int min, int max) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter a number between %d and %d: ", min, max);
            int userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) {
                System.out.println("Your number is inside of the specified range.");
                break;
            } else {
                System.out.println("Your number is outside the range, try again");
            }
        }
    }
}
