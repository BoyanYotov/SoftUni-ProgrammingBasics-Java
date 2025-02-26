package ConditionalStatementsAdvanced_03.Extra;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometres = Double.parseDouble(scanner.nextLine());
        double total = 0;

        if (kilometres <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                total = kilometres * 0.75 * 4;
            } else if (season.equals("Summer")) {
                total = kilometres * 0.9 * 4;
            } else if (season.equals("Winter")) {
                total = kilometres * 1.05 * 4;
            }
        } else if (kilometres > 5000 && kilometres <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                total = kilometres * 0.95 * 4;
            } else if (season.equals("Summer")) {
                total = kilometres * 1.1 * 4;
            } else if (season.equals("Winter")) {
                total = kilometres * 1.25 * 4;
            }
        } else if (kilometres > 10000 && kilometres <= 20000) {
            total = kilometres * 1.45 * 4;
        }

        total *= 0.9;

        System.out.printf("%.2f", total);

    }
}
