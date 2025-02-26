package SampleExams_09.Exam6;

import java.util.Scanner;

public class CareOfPuppy_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scanner.nextLine());
        double boughtFoodGrams = boughtFood * 1000;
        String command = scanner.nextLine();
        double eatenFood = 0;

        while (!command.equals("Adopted")) {
            int eat = Integer.parseInt(command);
            eatenFood += eat;
            command = scanner.nextLine();
        }

        if (eatenFood > boughtFoodGrams) {
            System.out.printf("Food is not enough. You need %.0f grams more.", eatenFood - boughtFoodGrams);
        } else {
            System.out.printf("Food is enough! Leftovers: %.0f grams.", boughtFoodGrams - eatenFood);
        }
    }
}

