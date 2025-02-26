package SampleExams_09.Exam4;

import java.util.Scanner;

public class MovieDestination_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double dailyPrice = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    dailyPrice = 45000;
                } else {
                    dailyPrice = 40000;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    dailyPrice = 17000;
                } else {
                    dailyPrice = 12500;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    dailyPrice = 24000;
                } else {
                    dailyPrice = 20250;
                }
                break;
        }

        double total = days * dailyPrice;

        if (destination.equals("Dubai")) {
            total *= 0.7;
        } else if (destination.equals("Sofia")) {
            total *= 1.25;
        }

        if (budget < total) {
            System.out.printf("The director needs %.2f leva more!", total - budget);
        } else {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - total);
        }
    }
}
