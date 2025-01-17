package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodDog = Double.parseDouble(scanner.nextLine());
        double foodCat = Double.parseDouble(scanner.nextLine());
        double foodTurtle = Double.parseDouble(scanner.nextLine());

        double consumptionTotal = days*foodCat + days*foodDog + days*foodTurtle/1000;

        if (foodLeft > consumptionTotal){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodLeft - consumptionTotal));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(consumptionTotal -foodLeft));
        }

    }
}
