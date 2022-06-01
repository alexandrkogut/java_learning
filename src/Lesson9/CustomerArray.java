package Lesson9;

import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        while(size < 1) {
            System.out.print("The size of the array should be greater than 1, please try again: ");
            size = in.nextInt();
        }

        handler(size);
    }

    protected static void handler(int size) {
        int[] userArray = generateArrayWithRandomValues(size);

        printValues(userArray);

        System.out.println("Max value is " + getMaxValue(userArray));
        System.out.println("Min value is " + getMinValue(userArray));
        System.out.println("Sum value is " + getSumValue(userArray));
        System.out.println("Arithmetic average value is " + getArithmeticAverage(userArray));
    }

    protected static int[] generateArrayWithRandomValues(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
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

    protected static int getMaxValue(int[] userArray) {
        int max = 0;

        for (int value: userArray) {
            if (max < value) {
                max = value;
            }
        }

        return max;
    }

    protected static int getMinValue(int[] userArray) {
        int min = 0;

        for (int value: userArray) {
            if (min > value) {
                min = value;
            }
        }

        return min;
    }

    protected static int getSumValue(int[] userArray) {
        int sum = 0;

        for (int value: userArray) {
            sum += value;
        }

        return sum;
    }

    protected static double getArithmeticAverage(int[] userArray) {
        return (double) getSumValue(userArray) / userArray.length;
    }
}
