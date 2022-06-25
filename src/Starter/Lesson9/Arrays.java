package Starter.Lesson9;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] userArray = new int[10];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < userArray.length; i++) {
            System.out.print("Enter the " + (i + 1) + " value: ");
            userArray[i] = in.nextInt();
        }

        printReverse(userArray);
    }

    protected static void printReverse(int[] userArray) {
        for (int i = userArray.length - 1; i >= 0; i--) {
            System.out.print(userArray[i] + " ");
        }
    }
}
