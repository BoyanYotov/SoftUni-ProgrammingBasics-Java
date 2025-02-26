package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterTrip_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0;

        if (destination.equals("France")) {
            switch (dates) {
                case "21-23":
                    pricePerNight = 30;
                    break;
                case "24-27":
                    pricePerNight = 35;
                    break;
                case "28-31":
                    pricePerNight = 40;
                    break;
            }
        } else if (destination.equals("Italy")) {
            switch (dates) {
                case "21-23":
                    pricePerNight = 28;
                    break;
                case "24-27":
                    pricePerNight = 32;
                    break;
                case "28-31":
                    pricePerNight = 39;
                    break;
            }
        } else if (destination.equals("Germany")) {
            switch (dates) {
                case "21-23":
                    pricePerNight = 32;
                    break;
                case "24-27":
                    pricePerNight = 37;
                    break;
                case "28-31":
                    pricePerNight = 43;
                    break;
            }
        }

        double total = pricePerNight * nights;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, total);
    }
}
