package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intitalQuantity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int soldEggs = 0;

        while(!command.equals("Close")){
            int newEggs = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")){
                if (newEggs > intitalQuantity){
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", intitalQuantity);
                    return;
                }
                intitalQuantity -= newEggs;
                soldEggs += newEggs;
            } else if (command.equals("Fill")){
                intitalQuantity += newEggs;
            }
            command = scanner.nextLine();
        }

        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.",soldEggs);

    }
}