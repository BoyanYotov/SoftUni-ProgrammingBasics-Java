package ForLoop_04.Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int examinersQuantity = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;

        for (int i = 1; i <= examinersQuantity; i++) {

            String examinerName = scanner.nextLine();
            double pointsExaminer = Double.parseDouble(scanner.nextLine());

            int length = examinerName.length();
            totalPoints += (length * pointsExaminer) / 2;

            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
                break;
            }
        }

        if (totalPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - totalPoints);
        }

    }
}
