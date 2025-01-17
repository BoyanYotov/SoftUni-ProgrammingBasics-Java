package FirstStepsInCoding_01.Extra;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double noHall = height - 1;

        double deskOnRow = Math.floor( noHall / 0.7 );
        double totalRows = Math.floor( weight / 1.20 );
        double totalPlaces = (deskOnRow * totalRows) - 3;

        System.out.print(totalPlaces);
    }
}
