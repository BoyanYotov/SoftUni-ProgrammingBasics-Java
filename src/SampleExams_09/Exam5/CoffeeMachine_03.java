package SampleExams_09.Exam5;

import java.util.Scanner;

public class CoffeeMachine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int qty = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = 0.9;
                } else if (sugar.equals("Normal")) {
                    price = 1;
                } else if (sugar.equals("Extra")) {
                    price = 1.2;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = 1;
                } else if (sugar.equals("Normal")) {
                    price = 1.2;
                } else if (sugar.equals("Extra")) {
                    price = 1.6;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = 0.5;
                } else if (sugar.equals("Normal")) {
                    price = 0.6;
                } else if (sugar.equals("Extra")) {
                    price = 0.7;
                }
                break;
        }

        double total = price * qty;

        if (sugar.equals("Without")) {
            total *= 0.65;
        }
        if (drink.equals("Espresso") && qty >= 5) {
            total *= 0.75;
        }
        if (total > 15) {
            total *= 0.8;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", qty, drink, total);
    }
}
