package ConditionalStatementsAdvanced_03.Extra;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double leftover = 0;
        double tickets = 0;

        if (people >= 1 && people <= 4) {
            leftover = budget * 0.25;
            if (category.equals("VIP")) {
                tickets = people * 499.99;
            } else if (category.equals("Normal")) {
                tickets = people * 249.99;
            }
        } else if (people >= 5 && people <= 9) {
            leftover = budget * 0.4;
            if (category.equals("VIP")) {
                tickets = people * 499.99;
            } else if (category.equals("Normal")) {
                tickets = people * 249.99;
            }
        } else if (people >= 10 && people <= 24) {
            leftover = budget * 0.5;
            if (category.equals("VIP")) {
                tickets = people * 499.99;
            } else if (category.equals("Normal")) {
                tickets = people * 249.99;
            }
        } else if (people >= 25 && people <= 49) {
            leftover = budget * 0.6;
            if (category.equals("VIP")) {
                tickets = people * 499.99;
            } else if (category.equals("Normal")) {
                tickets = people * 249.99;
            }
        } else if (people >= 50) {
            leftover = budget * 0.75;
            if (category.equals("VIP")) {
                tickets = people * 499.99;
            } else if (category.equals("Normal")) {
                tickets = people * 249.99;
            }
        }

        if (leftover - tickets >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", leftover - tickets);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", tickets - leftover);
        }

    }
}
