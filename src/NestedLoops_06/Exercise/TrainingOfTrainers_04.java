package NestedLoops_06.Exercise;

import java.util.Scanner;

public class TrainingOfTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examiners = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double totalLesson = 0;
        double grandTotal = 0;
        int gradeCount = 0;

        while (!command.equals("Finish")){

            for (int i = 1; i <= examiners; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                totalLesson += grade;
                grandTotal+=grade;
                gradeCount++;
            }

        double averageLesson = totalLesson / examiners;
        System.out.printf("%s - %.2f.%n", command, averageLesson);

        totalLesson = 0;
        command = scanner.nextLine();
    }

        System.out.printf("Student's final assessment is %.2f.",grandTotal/gradeCount);

    }
}

