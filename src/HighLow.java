import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randomNum;
        int max = 100;
        int min = 1;
        randomNum = (int) (Math.random() * (max - min + min) + 1);
//        System.out.printf("Random number from 1 to 100: %d", randomNum);
        int userGuess;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = scanner.nextInt();
            if (userGuess > randomNum) {
                System.out.println("HIGHER");
            } else if (userGuess < randomNum) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }
        } while (userGuess != randomNum);
    }
}
