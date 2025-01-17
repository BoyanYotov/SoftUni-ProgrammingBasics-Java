package WhileLoop_05.Exercise;

import java.util.Scanner;

public class ExamPreparation_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int failsAllowed = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int taskCount = 0;
        int totalGrades = 0;
        String lastProblem = "";
        int fails = 0;


        while (!command.equals("Enough")) {

            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                fails++;
            }

            if (fails >= failsAllowed) {
                System.out.printf("You need a break, %d poor grades.", fails);
                break;
            }

            totalGrades += grade;
            taskCount++;
            lastProblem = command;

            command = scanner.nextLine();
        }

        if (command.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", totalGrades * 1.0 / taskCount);
            System.out.printf("Number of problems: %d%n", taskCount);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
