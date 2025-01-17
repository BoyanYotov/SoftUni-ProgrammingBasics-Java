package SampleExams_09.Exam4;

import java.util.Scanner;

public class Oscars_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int qty = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;

        for (int i = 1; i <= qty; i++) {
            String nameExaminer = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            double pointsExaminer = (nameExaminer.length() * points) / 2;

            totalPoints += pointsExaminer;

            if (totalPoints > 1250.5) {
                break;
            }
        }

        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - totalPoints);
        }
    }
}
