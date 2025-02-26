package FirstStepsInCoding_01.Exercise;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        double rate = sum * percentage / 100;
        double month = rate / 12;
        double finalSum = sum + (period * month);

        System.out.println(finalSum);
    }
}
