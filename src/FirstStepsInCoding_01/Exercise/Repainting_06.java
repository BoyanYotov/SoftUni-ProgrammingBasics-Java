package FirstStepsInCoding_01.Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int solvent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonSum = (nylon + 2) * 1.50;
        double paintSum = (paint * 1.1) * 14.50;
        double solverSum = solvent * 5.00;

        double materialsTotal = (nylonSum + paintSum + solverSum + 0.4);
        double hoursTotal = materialsTotal * 0.3;

        System.out.println(materialsTotal + hoursTotal * hours);
    }
}
