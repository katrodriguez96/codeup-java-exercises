package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input();
        Circle newCircle = new Circle(userInput.getInt("Enter radius of circle:"));
        System.out.println("newCircle.getArea() = " + newCircle.getArea());
        System.out.println("newCircle.getCircumference() = " + newCircle.getCircumference());
    }
}
