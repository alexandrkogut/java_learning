package Lesson7;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = in.nextInt();

        if (isNegative(number)) {
            System.out.println("The number is negative");
        }

        if (isPositive(number)) {
            System.out.println("The number is positive");
        }

        System.out.println("The number " + ( isSimple(number) ? "is" : "is not" ) + " simple");
        System.out.println("The number " + ( isSpecial(number) ? "is" : "is not" ) + " special");
    }

    protected static boolean isNegative(int number) {
        return number < 0;
    }

    protected static boolean isPositive(int number) {
        return number > 0;
    }

    protected static boolean isSimple(int number) {
        if (number < 1) {
            return false;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    protected static boolean isSpecial(int number) {
        int[] specialNumbers = new int[]{2, 5, 3, 6, 9};

        for (int specialNumber : specialNumbers) {
            if (number % specialNumber != 0) {
                return false;
            }
        }

        return true;
    }
}
