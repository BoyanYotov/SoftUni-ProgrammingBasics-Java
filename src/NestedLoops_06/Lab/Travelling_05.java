package NestedLoops_06.Lab;

import java.lang.Double;
import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){

            double budget = java.lang.Double.parseDouble(scanner.nextLine());

            double availableMoney = 0;

            while (availableMoney < budget){
                double input = Double.parseDouble(scanner.nextLine());
                availableMoney+=input;
            }
            System.out.printf("Going to %s!%n",destination);

            destination = scanner.nextLine();
        }
    }
}
