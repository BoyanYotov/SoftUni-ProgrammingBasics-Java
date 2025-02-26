package WhileLoop_05.Extra;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int milliliters = bottles * 750;
        int count = 0;

        int spent = 0;
        int countPots = 0;
        int countPlates = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            int dishes = Integer.parseInt(command);
            count++;

            if (count % 3 == 0) {
                spent = dishes * 15;
                countPots += dishes;
                milliliters -= spent;
            } else {
                spent = dishes * 5;
                countPlates += dishes;
                milliliters -= spent;
            }

            if (milliliters < 0) {
                break;
            }

            command = scanner.nextLine();
        }

        if (milliliters < 0) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(milliliters));
        } else {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", countPlates, countPots);
            System.out.printf("Leftover detergent %d ml.", milliliters);
        }

    }
}
