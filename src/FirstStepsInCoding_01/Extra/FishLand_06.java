package FirstStepsInCoding_01.Extra;

import java.util.Scanner;

public class FishLand_06 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        double musselsKg = Double.parseDouble(scanner.nextLine());

        double scadPrice = spratPrice *1.8;
        double bonitoPrice = mackerelPrice *1.6;

        double totalSum = bonitoPrice * bonitoKg + scadPrice * scadKg + musselsKg*7.5;

        System.out.printf("%.2f", totalSum);

    }
}
