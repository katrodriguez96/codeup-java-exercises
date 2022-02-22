import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        int range = max - min + min;
        // generate random integer from 1 - 100
        int randomNum = (int) (Math.random() * range + min);
//        System.out.printf("Random number from 1 to 100: %d", randomNum);
        int userGuess;
        int count = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = scanner.nextInt();
            count++;
            if (userGuess > randomNum) {
                System.out.println("HIGHER");
            } else if (userGuess < randomNum) {
                System.out.println("LOWER");
            } else {
                if (count == 1) {
                    System.out.println("WOW FIRST TRY!");
                } else {
                    System.out.printf("GOOD GUESS! And it only took %d tries :)", count);
                }
            }
        } while (userGuess != randomNum);
    }
}
