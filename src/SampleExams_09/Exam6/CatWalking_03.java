package SampleExams_09.Exam6;

import java.util.Scanner;

public class CatWalking_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int walksQty = Integer.parseInt(scanner.nextLine());
        int caloriesIntake = Integer.parseInt(scanner.nextLine());

        int caloriesBurnt = (walksQty * minutesWalk) * 5;

        if (caloriesBurnt >= caloriesIntake / 2){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",caloriesBurnt);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurnt);
        }
    }
}
