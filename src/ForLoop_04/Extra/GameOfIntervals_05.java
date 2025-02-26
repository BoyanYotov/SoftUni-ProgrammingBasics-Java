package ForLoop_04.Extra;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double totalPoints = 0;
        int interval1 = 0;
        int interval2 = 0;
        int interval3 = 0;
        int interval4 = 0;
        int interval5 = 0;
        int interval6 = 0;

        for (int i = 1; i <= moves; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                points = number * 0.2;
                totalPoints += points;
                interval1++;
            } else if (number > 9 && number <= 19) {
                points = number * 0.3;
                totalPoints += points;
                interval2++;
            } else if (number > 19 && number <= 29) {
                points = number * 0.4;
                totalPoints += points;
                interval3++;
            } else if (number > 29 && number <= 39) {
                points = 50;
                totalPoints += points;
                interval4++;
            } else if (number > 39 && number <= 50) {
                points = 100;
                totalPoints += points;
                interval5++;
            } else {
                totalPoints = totalPoints / 2;
                interval6++;
            }
        }

        double percent1 = interval1 * 1.0 / moves * 100;
        double percent2 = interval2 * 1.0 / moves * 100;
        double percent3 = interval3 * 1.0 / moves * 100;
        double percent4 = interval4 * 1.0 / moves * 100;
        double percent5 = interval5 * 1.0 / moves * 100;
        double percent6 = interval6 * 1.0 / moves * 100;

        System.out.printf("%.2f%n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", percent1);
        System.out.printf("From 10 to 19: %.2f%%%n", percent2);
        System.out.printf("From 20 to 29: %.2f%%%n", percent3);
        System.out.printf("From 30 to 39: %.2f%%%n", percent4);
        System.out.printf("From 40 to 50: %.2f%%%n", percent5);
        System.out.printf("Invalid numbers: %.2f%%", percent6);

    }
}
