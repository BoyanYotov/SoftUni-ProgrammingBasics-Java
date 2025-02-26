package ConditionalStatementsAdvanced_03.Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double spending = 0;
        String hosting = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                spending = budget * 0.3;
                hosting = "Camp";
            } else if (season.equals("winter")) {
                hosting = "Hotel";
                spending = budget * 0.7;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                hosting = "Camp";
                spending = budget * 0.4;
            } else if (season.equals("winter")) {
                hosting = "Hotel";
                spending = budget * 0.8;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            hosting = "Hotel";
            spending = budget * 0.9;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, hosting, spending);

    }
}
