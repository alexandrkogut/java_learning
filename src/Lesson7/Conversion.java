package Lesson7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an amount: ");
        double amount = in.nextDouble();

        System.out.print("Input an exchange rate: ");
        double exchangeRate = in.nextDouble();

        handler(amount, exchangeRate);
    }

    protected static void handler(double amount, double exchangeRate) {
        try {
            System.out.println("Result is " + getExchange(amount, exchangeRate));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected static double getExchange(double amount, double exchangeRate) throws Exception {
        checkAmountAndExchangeRate(amount, exchangeRate);

        return amount * exchangeRate;
    }

    protected static void checkAmountAndExchangeRate(double amount, double exchangeRate) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount should be greater than 0");
        }

        if (exchangeRate <= 0) {
            throw new Exception("Exchange rate should be greater than 0");
        }
    }
}
