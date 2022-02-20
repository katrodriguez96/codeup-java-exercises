import java.util.Scanner;

public class ControlFlowExercises {
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

//        int i;
//        for (i = 5; i <= 15; i++) {
//            System.out.println("i is " + i);
//        }
//        for (i = 2; i <= 1000000; i = (int) Math.pow(i, 2)) {
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Display how many rows? ");
        int userInt = scanner.nextInt();
        System.out.println("\nHere is your table!\n\nnumber | squared | cubed\n------ | ------- | -----");
        for (int i = 1; i <= userInt; i++) {
            int squared = (int) Math.pow(i, 2);
            int cubed = (int) Math.pow(i, 3);
            if (squared >= 10 & squared <= 99) {
                System.out.println(i + "      | " + squared + "      | " + cubed);
            } else if (squared >= 100) {
                System.out.println(i + "      | " + squared + "     | " + cubed);
            } else {
                System.out.println(i + "      | " + squared + "       | " + cubed);
            }
        } // dont understand how to prompt the user to continue one more iteration outside of the for loop

//        Scanner scanner = new Scanner(System.in);
//        String keepGrading;
//        do {
//            System.out.print("Please enter a grade from 0 - 100: ");
//            int i = scanner.nextInt();
//            if (i >= 88 && i <= 100) {
//                System.out.println("You got an A!");
//            } else if (i >= 80 && i <= 87) {
//                System.out.println("You got a B!");
//            } else if (i >= 67 && i <= 79) {
//                System.out.println("You got a C!");
//            } else if (i >= 60 && i <= 66) {
//                System.out.println("You got a D!");
//            } else if (i >= 0 && i <= 59) {
//                System.out.println("You got an F!");
//            }
//            System.out.println("Would you like to continue? y/n");
//            keepGrading = scanner.next();
//        } while (keepGrading.equalsIgnoreCase("y"));
    }
}
