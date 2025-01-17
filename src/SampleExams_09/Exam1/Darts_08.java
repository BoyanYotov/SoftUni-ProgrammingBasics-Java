package SampleExams_09.Exam1;

import java.util.Scanner;

public class Darts_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int currentPoints = 301;
        int winsCount = 0;
        int loseCount = 0;

        while (true) {
            String zone = scanner.nextLine();
            if (zone.equals("Retire")) {
                System.out.printf("%s retired after %d unsuccessful shots.",name, loseCount);
                return;
            }

            int points = Integer.parseInt(scanner.nextLine());

            if (zone.equals("Single")) {
                points = points;
            } else if (zone.equals("Double")) {
                points=2 * points;
            } else if (zone.equals("Triple")) {
                points = 3 * points;
            }

            if ((currentPoints - points) > 0) {
                    winsCount++;
                    currentPoints -= points;
                } else if ((currentPoints - points) == 0){
                    winsCount++;
                    break;
                } else {
                    loseCount++;
                }
            }
        System.out.printf("%s won the leg with %d shots.", name, winsCount);
    }
}
