package Starter.Lesson6;

import java.util.Scanner;

public class Rectangle extends Task3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the width of rectangle: ");
        int width = in.nextInt();

        System.out.print("Input the height of rectangle: ");
        int height = in.nextInt();

        printRectangle(width, height);
    }
}
