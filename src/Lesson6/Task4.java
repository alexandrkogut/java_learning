package Lesson6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number of clients: ");
        int clientsCount = in.nextInt();

        System.out.println("Count of routes is " + calculateCountOfRoutes(clientsCount));
    }

    protected static long calculateCountOfRoutes(int clientsCount) {
        long countOfRoutes = 1;

        do {
            countOfRoutes = countOfRoutes * clientsCount--;

        } while (clientsCount > 1);

        return countOfRoutes;
    }
}
