package ConditionalStatementsAdvanced_03.Extra;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysallisQuantity = Integer.parseInt(scanner.nextLine());
        int rosesQuantity = Integer.parseInt(scanner.nextLine());
        int tulipsQuantity = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double chrysallisPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        double totalAmount = 0;


        switch (season) {
            case "Spring", "Summer":
                if (holiday.equals("N")) {
                    chrysallisPrice = 2;
                    rosesPrice = 4.10;
                    tulipsPrice = 2.50;
                } else if (holiday.equals("Y")) {
                    chrysallisPrice = 2 * 1.15;
                    rosesPrice = 4.10 * 1.15;
                    tulipsPrice = 2.50 * 1.15;
                }
                totalAmount = (tulipsQuantity * tulipsPrice) +
                        (chrysallisQuantity * chrysallisPrice) +
                        (rosesQuantity * rosesPrice);
                break;
            case "Autumn", "Winter":
                if (holiday.equals("N")) {
                    chrysallisPrice = 3.75;
                    rosesPrice = 4.50;
                    tulipsPrice = 4.15;
                } else if (holiday.equals("Y")) {
                    chrysallisPrice = 3.75 * 1.15;
                    rosesPrice = 4.50 * 1.15;
                    tulipsPrice = 4.15 * 1.15;
                }
                totalAmount = (tulipsQuantity * tulipsPrice) +
                        (chrysallisQuantity * chrysallisPrice) +
                        (rosesQuantity * rosesPrice);
                break;
        }

        if (season.equals("Spring") && tulipsQuantity > 7) {
            totalAmount *= 0.95;
        }
        if (season.equals("Winter") && rosesQuantity >= 10) {
            totalAmount *= 0.9;
        }
        if (tulipsQuantity + chrysallisQuantity + rosesQuantity >= 20) {
            totalAmount *= 0.8;
        }
        totalAmount += 2;

        System.out.printf("%.2f", totalAmount);

    }
}
