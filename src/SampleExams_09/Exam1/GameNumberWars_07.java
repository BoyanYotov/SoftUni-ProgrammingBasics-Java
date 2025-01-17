package SampleExams_09.Exam1;

import java.util.Scanner;

public class GameNumberWars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();

        int pointsOne = 0;
        int pointsTwo = 0;
        int lastOne = 0;
        int lastTwo = 0;

        for (int i = 1; i <= 18; i++) {
            String command = scanner.nextLine();
            if (command.equals("End of game")) {
                System.out.printf("%s has %d points%n", nameOne, pointsOne);
                System.out.printf("%s has %d points", nameTwo, pointsTwo);
                break;
            }
            int cardOne = Integer.parseInt(command);
            int cardTwo = Integer.parseInt(scanner.nextLine());

            if (cardOne > cardTwo) {
                pointsOne += cardOne - cardTwo;
            } else if (cardTwo > cardOne) {
                pointsTwo += cardTwo - cardOne;
            }

            if (cardOne == cardTwo) {
                System.out.println("Number wars!");
                lastOne = Integer.parseInt(scanner.nextLine());
                lastTwo = Integer.parseInt(scanner.nextLine());

                if (lastOne > lastTwo) {
                    System.out.printf("%s is winner with %d points", nameOne, pointsOne);
                } else {
                    System.out.printf("%s is winner with %d points", nameTwo, pointsTwo);
                }
                break;
            }
        }
    }
}