import java.util.Scanner; // imports must be placed at the top before the class

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi); // same results as %.4s%n
        // new scanner created
        Scanner scanner = new Scanner(System.in); // creates new scanner
        scanner.useDelimiter("\n");
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt(); // will only accept an integer
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.print("Enter three words: "); // if user enters less than 3 words endless loop? it keeps looking for the next word?
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.println("You entered: --> \"" + firstWord + "\" <--\nThen: --> \"" + secondWord + "\" <--\nFinally: --> \"" + thirdWord + "\" <--");
//        System.out.print("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.print("Enter the length of your room: ");
        String userLength = scanner.nextLine();
        System.out.print("Enter the width of your room: ");
        String userWidth = scanner.nextLine();
        System.out.print("Enter the height of your room: ");
        String userHeight = scanner.nextLine();
        double length = Double.parseDouble(userLength);
        double width = Double.parseDouble(userWidth);
        double height = Double.parseDouble(userHeight);
        System.out.println("The area of your room is: " + (length * width) + "\nThe perimeter of your room is: " + ((length * 2) + (width * 2)) + "\nThe volume of your room is: " + (length * width * height));
    }
}
