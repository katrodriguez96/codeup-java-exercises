import java.util.Scanner;

public class MethodsLecture {
    public static void main(String[] args) {
//        greetUser("");
//        add(1, 2);
    }
    // TODO: 1. write a method that accepts user name from input and returns "hello, userInput"
    public static void greetUser(String userInput) {
        Scanner userName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        userInput = userName.nextLine();
        System.out.println("Hello " + userInput);
    }
    // TODO: 2. write a method that accepts 2 numbers from user input and returns the result of those two numbers added together
    public static int add(Integer numOne, Integer numTwo) {
        Scanner integers = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        numOne = integers.nextInt();
        numTwo = integers.nextInt();
        return (numOne + numTwo);
    }


}
