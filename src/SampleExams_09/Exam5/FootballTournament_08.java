package SampleExams_09.Exam5;

import java.util.Scanner;

public class FootballTournament_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int totalPoints = 0;
        int wins = 0;
        int equal = 0;
        int lose = 0;

        for (int i = 1; i <= games; i++) {
            String result = scanner.nextLine();
            if (result.equals("W")) {
                points = 3;
                wins++;
            } else if (result.equals("D")) {
                points = 1;
                equal++;
            } else if (result.equals("L")) {
                points = 0;
                lose++;
            }

            totalPoints += points;
        }

        if (games > 0) {
            System.out.printf("%s has won %d points during this season.%n", name, totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", wins);
            System.out.printf("## D: %d%n", equal);
            System.out.printf("## L: %d%n", lose);
            System.out.printf("Win rate: %.2f%%", (double) wins / games * 100);
        } else {
            System.out.printf("%s hasn't played any games during this season.", name);
        }
    }
}
