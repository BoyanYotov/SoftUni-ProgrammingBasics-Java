package FirstStepsInCoding_01.Exercise;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pensTotal = pens * 5.80;
        double markersTotal = markers * 7.20;
        double litresTotal = litres * 1.20;
        double sum = (pensTotal + markersTotal + litresTotal) * (1 - discount / 100);

        System.out.println(sum);

    }
}
