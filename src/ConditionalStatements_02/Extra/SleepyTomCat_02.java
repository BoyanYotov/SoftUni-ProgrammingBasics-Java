package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int daysWork = 365 - daysOff;
        int playTime = daysOff * 127 + daysWork * 63;

        int difference = 30000 - playTime;
        int differenceHours = Math.abs(difference / 60);
        double differenceMinutes = Math.abs(difference % 60);

        if (playTime <= 30000) {
            System.out.printf("Tom sleeps well%n%d hours and %.0f minutes " +
                    "less for play", differenceHours, differenceMinutes);
        } else {
            System.out.printf("Tom will run away%n%d hours and %.0f minutes " +
                    "more for play", differenceHours, differenceMinutes);
        }

    }
}
