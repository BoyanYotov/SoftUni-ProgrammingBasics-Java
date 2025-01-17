package FirstStepsInCoding_01.Extra;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void  main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        double vegetablesKgs = Double.parseDouble(scanner.nextLine());
        double fruitKgs = Double.parseDouble(scanner.nextLine());

        double totalSum = (vegetablesKgs*vegetablesPrice) + (fruitPrice*fruitKgs);
        double totalSumInEur = totalSum/1.94;

        System.out.printf("%.2f", totalSumInEur);

    }
}
