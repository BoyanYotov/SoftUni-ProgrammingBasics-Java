package SampleExams_09.Exam7;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bestGoals = 0;
        String bestPlayer = "";

        String name = scanner.nextLine();

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > bestGoals) {
                bestGoals = goals;
                bestPlayer = name;
            }
            if (goals >= 10) {
                break;
            }
            name = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if (bestGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", bestGoals);
        } else {
            System.out.printf("He has scored %d goals.", bestGoals);
        }
    }
}


