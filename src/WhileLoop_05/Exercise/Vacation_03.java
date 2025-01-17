package WhileLoop_05.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double currentAccount = Double.parseDouble(scanner.nextLine());
        int daysCount = 0;
        int daysSpent = 0;

        while (currentAccount < vacationPrice) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCount++;

            if (command.equals("save")) {
                currentAccount += money;
                daysSpent = 0;

            } else if (command.equals("spend")) {
                currentAccount -= money;
                daysSpent++;
                if (currentAccount < 0) {
                    currentAccount = 0;
                }

                if (daysSpent == 5){
                    System.out.println("You can't save the money.");
                    System.out.printf("%d", daysCount);
                    break;
                }
            }
        }

        if (currentAccount >= vacationPrice) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }

    }
}