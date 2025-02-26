package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterGuests_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsQuantity = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cakesQuantity = Math.ceil(guestsQuantity * 1.0 / 3);
        double cakeCost = cakesQuantity * 4;
        double eggs = guestsQuantity * 2 * 0.45;

        double total = cakeCost + eggs;

        if (total <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", cakesQuantity, guestsQuantity * 2);
            System.out.printf("He has %.2f lv. left.", budget - total);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", total - budget);
        }
    }
}
