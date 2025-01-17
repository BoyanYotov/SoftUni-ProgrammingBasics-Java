package PreliminaryExam_07;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double total = (pocketMoney * 5) + (5 * profitPerDay) - expenses;

        if (total > presentPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",total);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.",presentPrice-total);
        }
    }
}
