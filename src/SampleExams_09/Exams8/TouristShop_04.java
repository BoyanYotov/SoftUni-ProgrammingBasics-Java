package SampleExams_09.Exams8;

import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int boughtProducts = 1;
        double moneyLeft = budget;

        while (!command.equals("Stop")){
            double price = Double.parseDouble(scanner.nextLine());
            if (boughtProducts %3 == 0 && boughtProducts != 0){
                price /= 2;
            }

            if (price > moneyLeft){
                System.out.printf("You don't have enough money!%n");
                System.out.printf("You need %.2f leva!",price - moneyLeft);
                return;
            } else {
                moneyLeft -= price;
                boughtProducts++;
            }

            command = scanner.nextLine();
        }

        System.out.printf("You bought %d products for %.2f leva.",boughtProducts-1,budget-moneyLeft);
    }
}