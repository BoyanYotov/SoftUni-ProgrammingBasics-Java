package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class FuelTank1_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int litres = Integer.parseInt(scanner.nextLine());

        if (fuelType.equals("Diesel")) {
            if (litres >= 25) {
                System.out.print("You have enough diesel.");
            } else {
                System.out.print("Fill your tank with diesel!");
            }
        } else if (fuelType.equals("Gasoline")) {
            if (litres >= 25) {
                System.out.print("You have enough gasoline.");
            } else {
                System.out.print("Fill your tank with gasoline!");
            }
        } else if (fuelType.equals("Gas")) {
            if (litres >= 25) {
                System.out.print("You have enough gas.");
            } else {
                System.out.print("Fill your tank with gas!");
            }
        } else {
            System.out.print("Invalid fuel!");
        }

    }
}
