import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        String keepTalking;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Say something to Bob: ");
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Would you like to continue? [y/n]");
            keepTalking = scanner.nextLine();
        } while (keepTalking.equalsIgnoreCase("y"));

    }
}