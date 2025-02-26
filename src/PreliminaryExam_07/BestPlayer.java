package PreliminaryExam_07;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxGoals = 0;
        boolean trick = false;
        String command = scanner.nextLine();
        String top = "";

        while (true) {
            if (command.equals("END")) {
                break;
            } else {
                int goals = Integer.parseInt(scanner.nextLine());

                if (goals > maxGoals) {
                    maxGoals = goals;
                    top = command;
                }

                if (goals >= 3) {
                    trick = true;
                }

                if (goals >= 10) {
                    break;
                }

                command = scanner.nextLine();
            }
        }

        System.out.printf("%s is the best player!%n", top);
        if (trick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}