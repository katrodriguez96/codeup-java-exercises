package exceptionsErrorHandlingLecture;

public class ExceptionsTest {
    public static void main(String[] args) throws Exception {

//        throw new Exception("Something went wrong!");
//        // anything below exception becomes unreachable
//        System.out.println("Good morning Sirius!");

        // try-catch block
        try {
            // Code to break application here
            throw new NullPointerException("Something broke while running the application!");
        } catch (NullPointerException exceptionObject) {
            System.out.println("This is a null pointer exception.");
            System.out.println("Here's an example of .getMessage() " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (RuntimeException exceptionObject) {
            System.out.println("This is a runtime exception.");
            System.out.println("Here's an example of .getMessage() " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (Exception exceptionObject) {
            System.out.println("This is a generic, top level exception");
            System.out.println("Here's an example of .getMessage() " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        }
    }
}
