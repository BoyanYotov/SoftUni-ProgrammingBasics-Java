package SampleExams_09.Exam2;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int soldTickets = 0;

        while (!movieName.equals("Finish")) {
            int intialPlaces = Integer.parseInt(scanner.nextLine());
            int freePlaces = intialPlaces;

            while (freePlaces > 0) {
                String type = scanner.nextLine();
                if (type.equals("End")) {
                    break;
                }
                switch (type) {
                    case "student":
                        studentTickets++;
                        soldTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        soldTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        soldTickets++;
                        break;
                }
                freePlaces--;
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, (intialPlaces - freePlaces) * 1.0 / intialPlaces * 100);
            movieName = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", soldTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / soldTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0 / soldTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidTickets * 1.0 / soldTickets * 100);
    }
}