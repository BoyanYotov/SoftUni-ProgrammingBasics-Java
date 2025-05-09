package SampleExams_09.Exam6;

import java.util.Scanner;

public class FitnessCard_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0;

        switch (sport) {
            case "Gym":
                if (sex.equals("m")) {
                    price = 42;
                } else if (sex.equals("f")) {
                    price = 35;
                }
                break;
            case "Boxing":
                if (sex.equals("m")) {
                    price = 41;
                } else if (sex.equals("f")) {
                    price = 37;
                }
                break;
            case "Yoga":
                if (sex.equals("m")) {
                    price = 45;
                } else if (sex.equals("f")) {
                    price = 42;
                }
                break;
            case "Zumba":
                if (sex.equals("m")) {
                    price = 34;
                } else if (sex.equals("f")) {
                    price = 31;
                }
                break;
            case "Dances":
                if (sex.equals("m")) {
                    price = 51;
                } else if (sex.equals("f")) {
                    price = 53;
                }
                break;
            case "Pilates":
                if (sex.equals("m")) {
                    price = 39;
                } else if (sex.equals("f")) {
                    price = 37;
                }
                break;
        }

        if (age <= 19) {
            price *= 0.8;
        }

        if (price > budget) {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - budget);
        } else {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }
    }
}
