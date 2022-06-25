package Starter.Lesson8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Input a number" + i + ": ");

            output
                    .append("Result")
                    .append(i)
                    .append(" is ")
                    .append(calculator(in.nextInt()))
                    .append("\n");
        }

        System.out.println(output);
    }

    protected static double calculator(int number) {
        return (double) number / 5;
    }
}
