public class MethodsExercises {
    public static void main(String[] args) {
        add(5, 3);
        subtract(5, 3);
        multiply(5, 3);
        divide(5, 3);
        remainder(5, 3);
    }
    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    public static void multiply(int num1, int num2) {
//        System.out.println(num1 * num2);
        for (int i = num1; i <= (num1 * num2); i+=num1) {
            if (i == (num1 * num2)) {
                System.out.println(i);
                return;
            }
        }
    }
    public static void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }
    public static void remainder(int num1, int num2) {
        System.out.println(num1 % num2);
    }
}
