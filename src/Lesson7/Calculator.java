package Lesson7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number1: ");
        int arg1 = in.nextInt();

        System.out.print("Input a number2: ");
        int arg2 = in.nextInt();

        System.out.print("Input a number3: ");
        int arg3 = in.nextInt();

        System.out.println("Arithmetic average is " + calculate(arg1, arg2, arg3));
    }

    protected static double calculate(int arg1, int arg2, int arg3) {
        return (double) (arg1 + arg2 + arg3) / 3;
    }
}
