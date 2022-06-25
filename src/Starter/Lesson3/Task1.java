package Starter.Lesson3;

public class Task1 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        x += y - x++ * z;

        z = --x - y * 5;

        y /= x + 5 % z;

        z = x++ + y * 5;

        x = y - x++ * z;

        System.out.println("x: " + x + " y: " + y + " z: " + z);
    }
}
