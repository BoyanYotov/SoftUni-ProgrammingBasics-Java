package FirstStepsInCoding_01.Extra;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wallsArea = ((x * x) + (x * x) - (2 * 1.2)) +
                ((x * y) * 2 - (1.5 * 1.5 * 2));

        double paintNeededForWalls = wallsArea / 3.4;

        double roofArea = (x * y) * 2 + (x * h / 2) * 2;
        double paintNeededForRoof = roofArea / 4.3;

        System.out.printf("%.2f%n%.2f", paintNeededForWalls, paintNeededForRoof);

    }
}
