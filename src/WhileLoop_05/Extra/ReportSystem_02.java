package WhileLoop_05.Extra;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;
        int count = 0;
        int countCC = 0;
        int sumCC = 0;
        int countCS = 0;
        int sumCS = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int money = Integer.parseInt(command);
            count++;

            if (count % 2 != 0) {
                if (money > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    totalSum += money;
                    sumCS += money;
                    countCS++;
                }
            } else {
                if (money < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    totalSum += money;
                    sumCC += money;
                    countCC++;
                }
            }

            if (totalSum >= goal) {
                break;
            }

            command = scanner.nextLine();

        }

        if (command.equals("End")) {
            System.out.print("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n", sumCS * 1.0 / countCS);
            System.out.printf("Average CC: %.2f", sumCC * 1.0 / countCC);
        }

    }
}
