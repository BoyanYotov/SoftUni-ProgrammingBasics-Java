package SampleExams_09.Exams8;

import java.util.Scanner;

public class VetParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double taxDay = 0;
        double totalTax = 0;

        for (int i = 1; i <= days; i++) {
            taxDay = 0;
            for (int j = 1; j <= hours; j++) {
                if ((i % 2 == 0) && (j % 2 != 0)) {
                    price = 2.50;
                } else if ((i % 2 != 0) && (j % 2 == 0)) {
                    price = 1.25;
                } else {
                    price = 1;
                }
                taxDay += price;
            }
            System.out.printf("Day: %d - %.2f leva%n", i, taxDay);

            totalTax += taxDay;
        }

        System.out.printf("Total: %.2f leva", totalTax);
    }
}
