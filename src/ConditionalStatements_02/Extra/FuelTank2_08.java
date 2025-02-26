package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class FuelTank2_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double total = 0;

        if (fuelType.equals("Gas")) {
            if (card.equals("Yes")) {
                total = (litres * 0.93) - (litres * 0.08);
            } else if (card.equals("No")) {
                total = (litres * 0.93);
            }
        } else if (fuelType.equals("Gasoline")) {
            if (card.equals("Yes")) {
                total = (litres * 2.22) - (litres * 0.18);
            } else if (card.equals("No")) {
                total = (litres * 2.22);
            }
        } else if (fuelType.equals("Diesel")) {
            if (card.equals("Yes")) {
                total = (litres * 2.33) - (litres * 0.12);
            } else if (card.equals("No")) {
                total = (litres * 2.33);
            }
        }

        if (litres >= 20 && litres <= 25) {
            total *= 0.92;
        } else if (litres > 25) {
            total *= 0.9;
        }

        System.out.printf("%.2f lv.", total);

    }
}
