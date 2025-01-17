package ConditionalStatements_02.Exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int toysTotalQuantity = puzzles + dolls + bears + minions + trucks;

        double totalSum = (puzzles*2.6) + (dolls*3) + (bears*4.1) + (minions*8.2) + (trucks*2);

        if (toysTotalQuantity >= 50) {
            totalSum = totalSum * 0.75;
        }

        totalSum = totalSum * 0.9;

        double leftover = Math.abs(totalSum - tripPrice);

        if (totalSum >= tripPrice){
            System.out.printf ("Yes! %.2f lv left.",leftover);
        } else {
            System.out.printf ("Not enough money! %.2f lv needed.",leftover);
        }

    }
}
