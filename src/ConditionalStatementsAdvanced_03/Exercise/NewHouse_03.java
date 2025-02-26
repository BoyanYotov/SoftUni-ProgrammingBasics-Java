package ConditionalStatementsAdvanced_03.Exercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double total = 0;

        switch (flowers) {
            case "Roses":
                total = quantity * 5;
                if (quantity > 80) {
                    total = total * 0.9;
                }
                break;
            case "Dahlias":
                total = quantity * 3.80;
                if (quantity > 90) {
                    total = total * 0.85;
                }
                break;
            case "Tulips":
                total = quantity * 2.80;
                if (quantity > 80) {
                    total = total * 0.85;
                }
                break;
            case "Narcissus":
                total = quantity * 3;
                if (quantity < 120) {
                    total = total * 1.15;
                }
                break;
            case "Gladiolus":
                total = quantity * 2.5;
                if (quantity < 80) {
                    total = total * 1.2;
                }
                break;
        }

        if (total <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and " +
                    "%.2f leva left.", quantity, flowers, budget - total);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
        }

    }
}
