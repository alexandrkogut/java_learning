package Starter.Lesson8;

import java.util.Scanner;

public class Bank {
    protected static int cashBalance = -700;

    public static void main(String[] args) {
        int inputAmount;
        Scanner in = new Scanner(System.in);

        while (cashBalance != 0) {
            System.out.print("Input an amount: ");
            inputAmount = in.nextInt();

            processing(inputAmount);
        }
    }

    protected static void processing(int amount) {
        cashBalance += amount;

        printStatus();
    }

    protected static void printStatus() {
        if (cashBalance == 0) {
            System.out.println("The debt paid");
        }
        if (cashBalance > 0) {
            System.out.println("The amount of the overpayment is " + cashBalance);
        }
        if (cashBalance < 0) {
            System.out.println("The amount owed is " + Math.abs(cashBalance));
        }
    }
}
