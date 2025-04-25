package NestedLoops_06.Extra;

import java.util.Scanner;

public class HappyParkingCat_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double fee = 0;
        double dayFee = 0;
        double totalAmount = 0;

        for (int i = 1; i <= days; i++) {

            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    fee = 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    fee = 1.25;
                } else {
                    fee = 1;
                }

                dayFee += fee;
            }

            System.out.printf("Day: %d - %.2f leva\n", i, dayFee);

            totalAmount += dayFee;
            dayFee = 0;
        }

        System.out.printf("Total: %.2f leva\n", totalAmount);
    }
}

