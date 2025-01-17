package SampleExams_09.Exam4;

import java.util.Scanner;

public class MovieStars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyActor = 0;
        double budget = Double.parseDouble(scanner.nextLine());

        while (budget >= 0) {
            String actor = scanner.nextLine();
            if (actor.equals("ACTION")) {
                break;
            }

            int actorName = actor.length();
            if (actorName <= 15) {
                moneyActor = Double.parseDouble(scanner.nextLine());
            } else {
                moneyActor = budget * 0.2;
            }

            budget -= moneyActor;

        }
        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}