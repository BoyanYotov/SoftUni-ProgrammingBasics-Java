package SampleExams_09.Exam6;

import java.util.Scanner;

public class FoodForPets_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        double catTotal = 0;
        double dogTotal = 0;
        double buscuitsTotal = 0;

        for (int i = 1; i <= days ; i++) {
            double dogDailyEating = Double.parseDouble(scanner.nextLine());
            double catDailyEating = Double.parseDouble(scanner.nextLine());

            catTotal += catDailyEating;
            dogTotal += dogDailyEating;

            if (i %3 == 0){
                double biscuits = (catDailyEating + dogDailyEating) * 0.1;
                buscuitsTotal += biscuits;
            }

        }
        double totalEaten = catTotal + dogTotal;
        System.out.printf("Total eaten biscuits: %.0fgr.%n",buscuitsTotal);
        System.out.printf("%.2f%% of the food has been eaten.%n",totalEaten / totalFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n",dogTotal / totalEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.",catTotal / totalEaten * 100);
    }
}
