package Starter.Lesson3;

import Starter.Lesson7.Arithmetics;

public class Task6 extends Arithmetics {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        char[] specialNumbers = new char[]{Arithmetics.ADD, Arithmetics.SUB, Arithmetics.MUL, Arithmetics.DIV};

        for (char specialNumber : specialNumbers) {
            try {
                handler(x, y, specialNumber);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
