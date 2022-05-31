package Lesson6;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number A: ");
        int numA = in.nextInt();

        System.out.print("Input a number B: ");
        int numB = in.nextInt();

        try {
            System.out.println("Amount is " + getAmount(numA, numB));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected static long getAmount(int numA, int numB) throws Exception {
        if (numA >= numB) {
            throw new Exception("Number A should be less then number B");
        }

        long sum = 0;

        for (int i = numA + 1; i < numB; i++) {
            sum += i;
        }

        return sum;
    }
}
