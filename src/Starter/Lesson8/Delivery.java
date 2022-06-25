package Starter.Lesson8;

import Starter.Lesson6.Task4;

import java.util.Scanner;

public class Delivery extends Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number of clients: ");
        int clientsCount = in.nextInt();

        System.out.println("Count of routes is " + calculateCountOfRoutes(clientsCount));
    }
    protected static long calculateCountOfRoutes(int clientsCount) {
        return clientsCount < 1
                ? 1
                : clientsCount * calculateCountOfRoutes(clientsCount - 1);
    }
}
