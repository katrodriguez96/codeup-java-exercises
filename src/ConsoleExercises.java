import java.util.Scanner; // imports must be placed at the top before the class

public class ConsoleExercises {
    public static void main(String[] args) {
        // console and scanner exercises
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi); // .2 to show 2 digits after decimal point
        // new scanner created
        Scanner scanner = new Scanner(System.in); // creates new scanner
        scanner.useDelimiter("\n");
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt(); // will only accept an integer
//        System.out.println("You entered: \"" + userInput + "\"");
//        System.out.print("Enter three words: "); // if user enters less than 3 words it keeps looking for the next word. more than that doesnt show bc it only displays the first three tokens
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.println("You entered: \"" + firstWord + "\"\nThen: \"" + secondWord + "\"\nFinally: \"" + thirdWord + "\"");
//        System.out.print("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: \"" + userInput + "\"");

        // classroom calculator
        System.out.print("Enter the length of your room: ");
        float length = scanner.nextFloat();
        System.out.print("Enter the width of your room: ");
        float width = scanner.nextFloat();
        System.out.print("Enter the height of your room: ");
        float height = scanner.nextFloat();
        System.out.printf("The area is %f\n", length * width);
        System.out.printf("The perimeter is %f\n", 2 * length + 2 * width);
        System.out.printf("The volume is %f\n", length * width * height);
        // idk what adding scanner.useDelimiter("\n") did to make this any different.
        // idk a way to accept int inputs and also accept decimal inputs besides an if statement but thats not we're supposed to do
    }
}
