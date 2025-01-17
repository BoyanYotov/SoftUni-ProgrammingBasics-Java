package ConditionalStatements_02.Exercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget*0.1;
        double clothesTotalPrice = people* costumePrice;

        if (people > 150){
            clothesTotalPrice *= 0.9;
        }

        double leftover = Math.abs(budget - decorPrice - clothesTotalPrice);

        if ((decorPrice + clothesTotalPrice) > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",leftover);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.",leftover);
        }

    }
}
