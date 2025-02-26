package SampleExams_09.Exam5;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int extraExpenses = Integer.parseInt(scanner.nextLine());

        double totalNights = nights * pricePerNight;

        if (nights > 7) {
            totalNights = nights * (pricePerNight * 0.95);
        }

        double grandTotal = totalNights + (budget * extraExpenses / 100);

        if (grandTotal <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - grandTotal);
        } else {
            System.out.printf("%.2f leva needed.", grandTotal - budget);
        }
    }
}
