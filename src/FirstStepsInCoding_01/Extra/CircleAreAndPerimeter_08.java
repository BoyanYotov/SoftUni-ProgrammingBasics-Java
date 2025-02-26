package FirstStepsInCoding_01.Extra;

import java.util.Scanner;

public class CircleAreAndPerimeter_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;

        System.out.printf("%.2f%n%.2f", area, perimeter);

    }
}
