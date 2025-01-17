package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterBakery_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flowerPrice = Double.parseDouble(scanner.nextLine());
        double flowerKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double sugarPrice = flowerPrice * 0.75;
        double priceEggs = flowerPrice * 1.1;
        double mayaPrice = sugarPrice * 0.2;

        double total =  (flowerKg * flowerPrice) + (sugarPrice * sugarKg) +
                        (eggs * priceEggs) + (mayaPrice * yeast);

        System.out.printf("%.2f",total);
    }
}
