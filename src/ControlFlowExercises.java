import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        double i = 2;
//        do {
//            System.out.println("i is " + i);
//            i = Math.pow(i, 2); // i squared (numBeingSquared, toThePowerOf). only works with doubles, not ints?
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Display how many rows? ");
        String userInput = scanner.next();
        int userInt = Integer.parseInt(userInput);
        System.out.println("\nHere is your table!\n\nnumber | squared | cubed\n------ | ------- | -----");
        int i;
        for (i = 1; i <= userInt; i++) {
            int squared = (int) Math.pow(i, 2);
            int cubed = (int) Math.pow(i, 3);
            if (squared >= 10) { // if statement to keep the table layout up to double-digit numbers. there may be a better way?
                System.out.println(i + "      | " + squared + "      | " + cubed);
            } else {
                System.out.println(i + "      | " + squared + "       | " + cubed);
            }
        }
    }
}
