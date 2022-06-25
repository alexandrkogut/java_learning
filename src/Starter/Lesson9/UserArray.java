package Starter.Lesson9;

import java.util.Random;
import java.util.Scanner;

public class UserArray {
    protected static final int SIZE = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] userArray = generateArrayWithRandomValues();

        System.out.println("Array values are");
        printValues(userArray);

        System.out.println("Enter a value");
        int value = in.nextInt();

        System.out.println("Array values after prepend are");
        printValues(prependValue(userArray, value));
    }

    protected static int[] generateArrayWithRandomValues() {
        int[] array = new int[ReversedArray.SIZE];

        for (int i = 0; i < ReversedArray.SIZE; i++) {
            array[i] = new Random().nextInt(100);
        }

        return array;
    }

    protected static void printValues(int[] userArray) {
        for (int value: userArray) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    protected static int[] prependValue(int[] userArray, int value) {
        int[] newUserArray = new int[userArray.length + 1];

        newUserArray[0] = value;

        System.arraycopy(userArray, 0, newUserArray, 1, userArray.length);

        return newUserArray;
    }
}
