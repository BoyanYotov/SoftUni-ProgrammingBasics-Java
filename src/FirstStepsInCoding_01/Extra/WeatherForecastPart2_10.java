package FirstStepsInCoding_01.Extra;

import java.util.Scanner;

public class WeatherForecastPart2_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees >= 5.00 && degrees <= 11.90) {
            System.out.print("Cold");
        } else if (degrees >= 12.00 && degrees <= 14.90) {
            System.out.print("Cool");
        } else if (degrees >= 15.00 && degrees <= 20.00) {
            System.out.print("Mild");
        } else if (degrees >= 20.01 && degrees <= 25.90) {
            System.out.print("Warm");
        } else if (degrees >= 26.00 && degrees <= 35.00) {
            System.out.print("Hot");
        } else {
            System.out.print("unknown");
        }

    }
}
