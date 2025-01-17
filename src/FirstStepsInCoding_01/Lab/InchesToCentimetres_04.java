package FirstStepsInCoding_01.Lab;

import java.util.Scanner;

public class InchesToCentimetres_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());
        double centimeter = inch * 2.54;

        System.out.println(centimeter);
    }
}
