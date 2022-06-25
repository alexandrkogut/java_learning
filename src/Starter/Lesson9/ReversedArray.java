package Starter.Lesson9;

import java.util.Random;
import java.util.Scanner;

public class ReversedArray {
    protected static final int SIZE = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] userArray = generateArrayWithRandomValues();

        System.out.println("Array values are");
        printValues(userArray);

        System.out.println("Array values after reverse are");
        printValues(myReverse(userArray));

        System.out.println("Enter an index");
        int index = in.nextInt();
        while (index < 0) {
            System.out.println("Index should be 0 or greater, please try again");
            index = in.nextInt();
        }

        System.out.println("Enter a count");
        int count = in.nextInt();
        while (count < 1) {
            System.out.println("Count should be grater than 0, please try again");
            count = in.nextInt();
        }

        System.out.println("Subarray values are");
        printValues(subArray(userArray, index, count));
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

    protected static int[] myReverse(int[] userArray) {
        int tmpValue;
        int[] reverseArray = userArray.clone();

        for (int i = 0; i < reverseArray.length / 2; i++) {
            tmpValue = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length - 1 - i];
            reverseArray[reverseArray.length - 1 - i] = tmpValue;
        }

        return reverseArray;
    }

    protected static int[] subArray(int[] userArray, int index, int count) {
        int[] subArray = new int[count];
        int j = 0;

        for (int i = index; i < userArray.length; i++) {
            subArray[j] = userArray[i];

            if (++j >= count) {
                return subArray;
            }
        }

        for (int i = j; i < count; i++) {
            subArray[i] = 1;
        }

        return subArray;
    }
}
