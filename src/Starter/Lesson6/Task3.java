package Starter.Lesson6;

public class Task3 {
    protected static final char FILLED = '*';
    protected static final char EMPTY = ' ';
    protected static final char NEW_LINE = '\n';

    public static void main(String[] args) throws Exception {
        printRectangle(5, 4);
        System.out.print(NEW_LINE);

        printRightTriangle(5, 4);
        System.out.print(NEW_LINE);

        printEquilateralTriangle(3);
        System.out.print(NEW_LINE);

        printRhombus(3);
    }

    protected static void printRectangle(int x, int y) throws Exception {
        if (x < 2 || y < 2) {
            throw new Exception("X and Y should be greater than 1");
        }

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("" + FILLED + EMPTY);
            }

            System.out.print(NEW_LINE);
        }
    }

    protected static void printRightTriangle(int x, int y) throws Exception {
        if (x < 2) {
            throw new Exception("X should be greater than 2");
        }

        for (int i = y; i >= 1; i--) {
            for (int j = 1; j <= x-i; j++) {
                System.out.print("" + FILLED + EMPTY);
            }

            System.out.print(NEW_LINE);
        }
    }

    protected static void printEquilateralTriangle(int x) throws Exception {
        if (x < 2) {
            throw new Exception("X should be greater than 2");
        }

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x-i; j++) {
                System.out.print("" + EMPTY + EMPTY);
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("" + FILLED + EMPTY);
            }

            System.out.print(NEW_LINE);
        }
    }

    protected static void printRhombus(int x) throws Exception {
        printEquilateralTriangle(x);

        for (int i = x-1; i >= 1; i--) {
            for (int j = 1; j <= x-i; j++) {
                System.out.print("" + EMPTY + EMPTY);
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("" + FILLED + EMPTY);
            }

            System.out.print(NEW_LINE);
        }
    }
}
