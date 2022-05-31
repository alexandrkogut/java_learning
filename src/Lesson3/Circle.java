package Lesson3;

import java.util.Scanner;

public class Circle {
    public static double PI = 3.141592653d;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a radius: ");
        int r = in.nextInt();

        double result = PI * Math.pow(r,2);
        System.out.println("Result is " + result);
    }
}
