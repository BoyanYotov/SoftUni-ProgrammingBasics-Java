package WhileLoop_05.Lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        double totalSum = 0;

        while (!text.equals("NoMoreMoney")){

            double money = Double.parseDouble(text);
            if (money < 0){
                System.out.println("Invalid operation!");
                break;
            }

            totalSum += money;

            System.out.printf("Increase: %.2f%n",money);
            text = scanner.nextLine();
        }

        System.out.printf("Total: %.2f",totalSum);

    }
}
