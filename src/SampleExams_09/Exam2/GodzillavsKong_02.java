package SampleExams_09.Exam2;

import java.util.Scanner;

public class GodzillavsKong_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int peopleQuantity = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double decorPrice = budget * 0.1;

        double totalClothes = peopleQuantity * pricePerPerson;


        if (peopleQuantity > 150) {
            totalClothes *= 0.9;
        }

        double totalExpenses = totalClothes + decorPrice;

        if (totalExpenses > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalExpenses - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalExpenses);
        }

    }
}
