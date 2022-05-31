package Lesson4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = in.nextInt();

        printInterval(number);
    }

    protected static void printInterval(int number) {
        if (number >= 0 && number <= 14) {
            System.out.println("Number is in interval between 0 and 14");

            return;
        }

        if (number >= 15 && number <= 35) {
            System.out.println("Number is in interval between 15 and 35");

            return;
        }

        if (number == 50) {
            System.out.println("Number is in interval between 36 and 50");
            System.out.println("Number is in interval between 50 and 100");

            return;
        }

        if (number >= 36 && number < 50) {
            System.out.println("Number is in interval between 36 and 50");

            return;
        }

        if (number > 50 && number <= 100) {
            System.out.println("Number is in interval between 50 and 100");

            return;
        }

        System.out.println("Number is in unknown interval");
    }
}
