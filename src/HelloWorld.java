public class HelloWorld {
    public static void main(String[] args) {
        // intro to java exercise
        System.out.print("Hello, "); // will print
        System.out.print("World!"); // on same line
        System.out.println("\nHello, World!"); // same output as above

        // syntax, types, and variables exercise
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
        String myString = "hello";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++); // prints x as 5 and THEN increments
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x); // increments and THEN prints x as 6
//        System.out.println(x);
//        String class; // variable cannot be named 'class'
//        String theNumberThree = "three";
//        Object o = theNumberThree; // as an Object, it is still a String
//        int three = (int) o; // and cannot be cast as an Integer
//        int three = (int) "three"; // same as above without casting to an Object
//        int x = 4;
//        x += 5; // same as x = x + 5;
//        System.out.println(x);
//        int x = 3;
//        int y = 4;
//        y *= x; // same as y = y * x;
//        System.out.println(y);
        int x = 10;
        int y = 2;
        x /= y; // same as x = x / y
        y -= x; // same as y = y - x
        System.out.println(x);
        System.out.println(y);
        System.out.println(Integer.MAX_VALUE); // returns 2147483647
        System.out.println(Integer.MIN_VALUE); // returns -2147483648
        System.out.println(Integer.MAX_VALUE + 1); // returns -2147483648
        System.out.println(Integer.MIN_VALUE - 1); // returns 2147483647
    }
}
