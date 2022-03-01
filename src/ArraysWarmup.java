// TODO: Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]
//  example: [2,4,8,5,1,2];
//  output; [6,16]
//  reason: 2+4+8+2 = 16
//  5+1 = 6 (edited)

import java.util.Arrays;

public class ArraysWarmup {

    public static void main(String[] args) {
        int[] exampleArr = {2, 4, 8, 5, 1, 2};
        System.out.println(Arrays.toString(sumOddEven(exampleArr)));
    }

    public static int[] sumOddEven(int[] intArr) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int n : intArr) {
            if (n % 2 == 0) {
                sumEven += n;
            } else {
                sumOdd += n;
            }
        }
        int[] newArr = {sumOdd, sumEven};
        return newArr;
    }
}
