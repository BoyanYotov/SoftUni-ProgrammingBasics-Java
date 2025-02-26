package ConditionalStatementsAdvanced_03.Extra;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsQuantity = Integer.parseInt(scanner.nextLine());
        int nightsQuantity = Integer.parseInt(scanner.nextLine());
        double totalAmount = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("boys")) {
                    totalAmount = nightsQuantity * studentsQuantity * 9.60;
                    sport = "Judo";
                } else if (groupType.equals("girls")) {
                    totalAmount = nightsQuantity * studentsQuantity * 9.60;
                    sport = "Gymnastics";
                } else if (groupType.equals("mixed")) {
                    totalAmount = nightsQuantity * studentsQuantity * 10;
                    sport = "Ski";
                }
                break;
            case "Spring":
                if (groupType.equals("boys")) {
                    totalAmount = nightsQuantity * studentsQuantity * 7.20;
                    sport = "Tennis";
                } else if (groupType.equals("girls")) {
                    totalAmount = nightsQuantity * studentsQuantity * 7.20;
                    sport = "Athletics";
                } else if (groupType.equals("mixed")) {
                    totalAmount = nightsQuantity * studentsQuantity * 9.50;
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (groupType.equals("boys")) {
                    totalAmount = nightsQuantity * studentsQuantity * 15;
                    sport = "Football";
                } else if (groupType.equals("girls")) {
                    totalAmount = nightsQuantity * studentsQuantity * 15;
                    sport = "Volleyball";
                } else if (groupType.equals("mixed")) {
                    totalAmount = nightsQuantity * studentsQuantity * 20;
                    sport = "Swimming";
                }
                break;
        }

        if (studentsQuantity >= 50) {
            totalAmount = totalAmount * 0.5;
        }
        if (studentsQuantity >= 20 && studentsQuantity < 50) {
            totalAmount = totalAmount * 0.85;
        }
        if (studentsQuantity >= 10 && studentsQuantity < 20) {
            totalAmount = totalAmount * 0.95;
        }

        System.out.printf("%s %.2f lv.", sport, totalAmount);

    }
}

