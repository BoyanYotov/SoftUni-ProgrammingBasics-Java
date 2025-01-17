package NestedLoops_06.Exercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double studentCount = 0;
        double standardCount = 0;
        double kidCount = 0;
        int grandtotal = 0;
        String movie = scanner.nextLine();

        while (true) {
            if (movie.equals("Finish")) {
                break;
            }
            int freePlaces = Integer.parseInt(scanner.nextLine());
            int soldCount = 0;

            while (soldCount < freePlaces) {
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")) {
                    break;
                } else {
                    switch (ticketType) {
                        case "student":
                            studentCount++;
                            break;
                        case "standard":
                            standardCount++;
                            break;
                        case "kid":
                            kidCount++;
                            break;
                    }
                    soldCount++;
                    grandtotal++;
                }
            }
            double occupied = soldCount * 1.0 / freePlaces * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, occupied);
            soldCount = 0;
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", grandtotal);
        System.out.printf("%.2f%% student tickets.%n", studentCount / grandtotal * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCount / grandtotal * 100);
        System.out.printf("%.2f%% kids tickets.", kidCount / grandtotal * 100);
    }
}