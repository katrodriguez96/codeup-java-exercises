import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ControlFlowExercises {
    static void letterGrade () {

    }

    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        int i = 2;
//        do {
//            System.out.println("i is " + i);
//            i = (int) Math.pow(i, 2); // (numBeingSquared, toThePowerOf)
//        }while(i <= 1000000);

//        double i;
//        for (i = 5; i <= 15; i++) {
//            System.out.println("i is " + i);
//        }
//        for (i = 2; i <= 1000000; i = Math.pow(i, 2)) {
//            System.out.println("i is " + i);
//        }

//        int i;
//        for (i = 1; i <= 100; i++)  {
//            if (i % 3 == 0 & i % 5 == 0) { // use & to check both expressions. && only checks the second if applicable
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Display how many rows? ");
//        String userInput = scanner.next();
//        int userInt = Integer.parseInt(userInput);
//        System.out.println("\nHere is your table!\n\nnumber | squared | cubed\n------ | ------- | -----");
//        int i;
//        for (i = 1; i <= userInt; i++) {
//            int squared = (int) Math.pow(i, 2);
//            int cubed = (int) Math.pow(i, 3);
//            if (squared >= 10) { // if statement to keep the table layout up to double-digit numbers. there may be a better way?
//                System.out.println(i + "      | " + squared + "      | " + cubed);
//            } else {
//                System.out.println(i + "      | " + squared + "       | " + cubed);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        String keepGrading = "y";
        do {
            System.out.print("Please enter a grade from 0 - 100: ");
            String userInput = scanner.next();
            int i = Integer.parseInt(userInput);
            if (i >= 88 && i <= 100) {
                System.out.println("You got an A!");
            } else if (i >= 80 && i <= 87) {
                System.out.println("You got a B!");
            } else if (i >= 67 && i <= 79) {
                System.out.println("You got a C!");
            } else if (i >= 60 && i <= 66) {
                System.out.println("You got a D!");
            } else if (i >= 0 && i <= 59) {
                System.out.println("You got an F!");
            }
            System.out.println("Would you like to continue? y/n");
            keepGrading = scanner.next();
        } while (Objects.equals(keepGrading, "y"));
    }
}
