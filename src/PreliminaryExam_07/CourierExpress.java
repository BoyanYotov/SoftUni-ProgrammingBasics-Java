package PreliminaryExam_07;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());
        double pricePerKilo = 0;
        double total = 0;
        double extra = 0;
        double totalExtra = 0;

        if (weight < 1) {
            pricePerKilo = 0.03;
        } else if (weight < 10) {
            pricePerKilo = 0.05;
        } else if (weight < 40) {
            pricePerKilo = 0.10;
        } else if (weight < 90) {
            pricePerKilo = 0.15;
        } else if (weight < 150) {
            pricePerKilo = 0.20;
        }

        total = pricePerKilo * distance;

        if (serviceType.equals("express")) {
            if (weight < 1) {
                extra = pricePerKilo * 0.8;
            } else if (weight < 10) {
                extra = pricePerKilo * 0.4;
            } else if (weight < 40) {
                extra = pricePerKilo * 0.05;
            } else if (weight < 90) {
                extra = pricePerKilo * 0.02;
            } else if (weight < 150) {
                extra = pricePerKilo * 0.01;
            }

            totalExtra = weight * extra * distance;
            total = total + totalExtra;
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, total);
    }
}