package ConditionalStatementsAdvanced_03.Exercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();
        double total = 0;

        switch (roomType) {
            case "room for one person":
                total = (days - 1) * 18;
                break;
            case "apartment":
                if (days < 10) {
                    total = ((days - 1) * 25) * 0.7;
                } else if (days <= 15) {
                    total = ((days - 1) * 25) * 0.65;
                } else {
                    total = ((days - 1) * 25) * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    total = ((days - 1) * 35) * 0.9;
                } else if (days <= 15) {
                    total = ((days - 1) * 35) * 0.85;
                } else {
                    total = ((days - 1) * 35) * 0.8;
                }
                break;
        }

        if (review.equals("positive")) {
            total = total * 1.25;
        } else if (review.equals("negative")) {
            total = total * 0.9;
        }

        System.out.printf("%.2f", total);

    }
}
