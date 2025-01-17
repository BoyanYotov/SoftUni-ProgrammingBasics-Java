package SampleExams_09.Exam1;

import java.util.Scanner;

public class WorldSnookerChampionship_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();

        double ticketPrice = 0;
        double grandTotal = 0;
        double photoPrice = 40;

        switch (stage) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 55.50;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 105.20;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 118.90;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 75.88;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 125.22;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 300.40;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 110.10;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 160.66;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 400;
                }
                break;
        }

        grandTotal = ticketPrice * quantity;

        if (grandTotal > 4000) {
            grandTotal *= 0.75;
            photoPrice = 0;
        } else if (grandTotal > 2500) {
            grandTotal *= 0.9;
        }

        if (photo.equals("Y")) {
            grandTotal += photoPrice * quantity;
        }

        System.out.printf("%.2f", grandTotal);
    }
}