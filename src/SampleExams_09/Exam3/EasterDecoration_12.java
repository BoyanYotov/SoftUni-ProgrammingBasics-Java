package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterDecoration_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double purchasePricePerson = 0;
        double grandTotal = 0;
        int items = 0;

        for (int i = 1; i <= people; i++) {
            items = 0;
            purchasePricePerson = 0;

            String purchase = scanner.nextLine();

            while (!purchase.equals("Finish")) {
                switch (purchase) {
                    case "basket":
                        purchasePricePerson += 1.50;
                        items++;
                        break;
                    case "wreath":
                        purchasePricePerson += 3.80;
                        items++;
                        break;
                    case "chocolate bunny":
                        purchasePricePerson += 7;
                        items++;
                        break;
                }

                purchase = scanner.nextLine();
            }

            if (items % 2 == 0) {
                {
                    purchasePricePerson *= 0.8;
                }
            }

            grandTotal += purchasePricePerson;

            System.out.printf("You purchased %d items for %.2f leva.%n", items, purchasePricePerson);
        }

        System.out.printf("Average bill per client is: %.2f leva.", grandTotal / people);
    }
}
