package Starter.Lesson3;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a radius: ");
        int radius = in.nextInt();

        System.out.print("Input a height: ");
        int height = in.nextInt();

        double v = Circle.PI * Math.pow(radius,2) * height;
        System.out.println("V is " + v);

        double s = 2 * Circle.PI * radius * (height + radius);
        System.out.println("S is " + s);
    }
}
