package shapes;
import util.Input;

public class CircleApp {
    private static int circleCount = 0;

    public static void circleCounter() {
        circleCount++;
    }

    public static void main(String[] args) {
        Input userInput = new Input();
        boolean userContinue;
        do {
            Circle newCircle = new Circle(userInput.getInt("Enter radius of circle:"));
            circleCounter();
            System.out.println("Circle area = " + newCircle.getArea());
            System.out.println("Circle circumference = " + newCircle.getCircumference());
            userContinue = userInput.yesNo("Would you like to create another circle?");
            if (!userContinue) {
                System.out.printf("Number of circles created: %d", circleCount);
            }
        } while (userContinue);
    }
}
