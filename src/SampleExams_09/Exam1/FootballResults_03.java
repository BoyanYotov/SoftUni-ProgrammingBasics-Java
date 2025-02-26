package SampleExams_09.Exam1;

import java.util.Scanner;

public class FootballResults_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int winsCount = 0;
        int failsCount = 0;
        int drawnCount = 0;

        for (int i = 1; i <= 3; i++) {
            String result = scanner.nextLine();
            char a = result.charAt(0);
            char b = result.charAt(2);

            if (a > b) {
                winsCount++;
            } else if (a < b) {
                failsCount++;
            } else {
                drawnCount++;
            }
        }

        System.out.printf("Team won %d games.%n", winsCount);
        System.out.printf("Team lost %d games.%n", failsCount);
        System.out.printf("Drawn games: %d", drawnCount);
    }
}
