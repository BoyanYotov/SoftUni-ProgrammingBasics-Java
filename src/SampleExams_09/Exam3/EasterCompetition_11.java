package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterCompetition_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakesQuantity = Integer.parseInt(scanner.nextLine());
        int totalPointsCake = 0;
        int bestPoints = 0;
        String bestCake = "";
        int points = 0;
        int bestSoFar = 0;

        for (int i = 1; i <= cakesQuantity; i++) {
            totalPointsCake = 0;
            String name = scanner.nextLine();

            while (true) {
                String command = scanner.nextLine();
                if (command.equals("Stop")) {
                    break;
                } else {
                    points = Integer.parseInt(command);
                }
                totalPointsCake += points;
            }

            if (totalPointsCake > bestPoints) {
                bestPoints = totalPointsCake;
                bestCake = name;
            }

            System.out.printf("%s has %d points.%n", name, totalPointsCake);

            if (totalPointsCake > bestSoFar) {
                bestSoFar = totalPointsCake;
                System.out.printf("%s is the new number 1!%n", name);
            }
        }

        System.out.printf("%s won competition with %d points!", bestCake, bestPoints);
    }
}
