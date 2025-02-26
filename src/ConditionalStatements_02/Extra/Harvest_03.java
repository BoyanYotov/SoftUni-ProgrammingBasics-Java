package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapesPerMeter = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double wineProduced = ((area * 0.4) * grapesPerMeter) / 2.5;

        if (wineProduced < neededWine) {
            double difference = Math.floor(neededWine - wineProduced);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", difference);
        } else {
            double difference = Math.floor(wineProduced - neededWine);
            double diffPerPerson = Math.ceil(difference / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" +
                    "%.0f liters left -> %.0f liters per person.", wineProduced, difference, diffPerPerson);
        }

    }
}
