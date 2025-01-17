package PreliminaryExam_07;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int paper = Integer.parseInt(scanner.nextLine());
        int cloth = Integer.parseInt(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double discountPercentage = discount * 1.0 / 100;

        double paperTotal = paper * 5.80;
        double clothTotal = cloth * 7.20;
        double glueTotal = glue * 1.20;

        double grandTotal = (paperTotal + clothTotal + glueTotal);
        double total = grandTotal * (1 - discountPercentage);

        System.out.printf("%.3f",total);
    }
}
