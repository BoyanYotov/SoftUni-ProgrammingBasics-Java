package ForLoop_04.Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int singleToyPrice = Integer.parseInt(scanner.nextLine());
        int countToys = 0;
        int present = 0;
        int totalMoney = 0;

        for (int i = 1; i <= age ; i++) {

            if (i % 2 == 0){
            present += 10;
            totalMoney += present - 1;
            } else {
            countToys++;
            }
        }

        double sumTotal = (countToys * singleToyPrice) + totalMoney;

        if (sumTotal >= priceWashingMachine) {
            System.out.print("Yes! ");
            System.out.printf("%.2f",sumTotal-priceWashingMachine);
        } else {
            System.out.print("No! ");
            System.out.printf("%.2f",Math.abs(priceWashingMachine-sumTotal));
        }

    }
}
