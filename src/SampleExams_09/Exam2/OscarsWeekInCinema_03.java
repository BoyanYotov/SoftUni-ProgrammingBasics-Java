package SampleExams_09.Exam2;

import java.util.Scanner;

public class OscarsWeekInCinema_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int ticketsQuantity = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        if (movieName.equals("A Star Is Born")) {
            if (hallType.equals("normal")) {
                ticketPrice = 7.50;
            } else if (hallType.equals("luxury")) {
                ticketPrice = 10.50;
            } else if (hallType.equals("ultra luxury")) {
                ticketPrice = 13.50;
            }
        } else if (movieName.equals("Bohemian Rhapsody")) {
            if (hallType.equals("normal")) {
                ticketPrice = 7.35;
            } else if (hallType.equals("luxury")) {
                ticketPrice = 9.45;
            } else if (hallType.equals("ultra luxury")) {
                ticketPrice = 12.75;
            }
        } else if (movieName.equals("Green Book")) {
            if (hallType.equals("normal")) {
                ticketPrice = 8.15;
            } else if (hallType.equals("luxury")) {
                ticketPrice = 10.25;
            } else if (hallType.equals("ultra luxury")) {
                ticketPrice = 13.25;
            }
        } else if (movieName.equals("The Favourite")) {
            if (hallType.equals("normal")) {
                ticketPrice = 8.75;
            } else if (hallType.equals("luxury")) {
                ticketPrice = 11.55;
            } else if (hallType.equals("ultra luxury")) {
                ticketPrice = 13.95;
            }
        }

        double totalPrice = ticketsQuantity * ticketPrice;

        System.out.printf("%s -> %.2f lv.", movieName, totalPrice);
    }
}
