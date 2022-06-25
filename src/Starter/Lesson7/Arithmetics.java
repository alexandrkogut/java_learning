package Starter.Lesson7;

import java.util.Scanner;

public class Arithmetics {
    protected static final char ADD = '+';
    protected static final char SUB = '-';
    protected static final char MUL = '*';
    protected static final char DIV = '/';

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number1: ");
        int arg1 = in.nextInt();

        System.out.print("Input a number2: ");
        int arg2 = in.nextInt();

        System.out.print("Input an operand: ");
        char operand = in.next().charAt(0);

        try {
            handler(arg1, arg2, operand);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected static void handler(int arg1, int arg2, char operand) throws Exception {
        double result = getResult(arg1, arg2, operand);

        System.out.println(createOutput(arg1, arg2, operand, result));
    }

    protected static double getResult(int arg1, int arg2, char operand) throws Exception {
        return switch (operand) {
            case ADD -> add(arg1, arg2);
            case SUB -> sub(arg1, arg2);
            case MUL -> mul(arg1, arg2);
            case DIV -> div(arg1, arg2);
            default -> throw new Exception("Operand isn't correct");
        };
    }

    protected static int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    protected static int sub(int arg1, int arg2) {
        return arg1 - arg2;
    }

    protected static int mul(int arg1, int arg2) {
        return arg1 * arg2;
    }

    protected static double div(int arg1, int arg2) throws Exception {
        if (arg2 == 0) {
            throw new Exception("Division by zero is not allowed");
        }

        return (double) arg1 / arg2;
    }

    protected static String createOutput(int arg1, int arg2, char operand, double result) {
        return arg1 + " " + operand + " " + arg2 + " = " + result;
    }
}
