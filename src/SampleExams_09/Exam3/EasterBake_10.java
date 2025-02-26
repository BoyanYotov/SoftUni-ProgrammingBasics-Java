package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterBake_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakes = Integer.parseInt(scanner.nextLine());
        int sugarTotal = 0;
        int flowerTotal = 0;
        int maxValueSugar = 0;
        int maxValueFlower = 0;

        for (int i = 1; i <= cakes; i++) {

            int sugar = Integer.parseInt(scanner.nextLine());
            int flower = Integer.parseInt(scanner.nextLine());

            sugarTotal += sugar;
            flowerTotal += flower;

            if (sugar > maxValueSugar) {
                maxValueSugar = sugar;
            }

            if (flower > maxValueFlower) {
                maxValueFlower = flower;
            }
        }

        double packsSugar = Math.ceil(sugarTotal * 1.0 / 950);
        double packsFlower = Math.ceil(flowerTotal * 1.0 / 750);

        System.out.printf("Sugar: %.0f%n", packsSugar);
        System.out.printf("Flour: %.0f%n", packsFlower);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxValueFlower, maxValueSugar);
    }
}