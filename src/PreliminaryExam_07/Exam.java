package PreliminaryExam_07;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int aStudents = 0;
        int bStudents = 0;
        int cStudents = 0;
        int dStudents = 0;
        double totalGrades = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrades += grade;
            if (grade >= 5.00) {
                aStudents++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                bStudents++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                cStudents++;
            } else if (grade >= 2.00 & grade <= 2.99) {
                dStudents++;
            }
        }

        double average = totalGrades / students;
        double aStudentsPercent = aStudents * 1.0 / students * 100;
        double bStudentsPercent = bStudents * 1.0 / students * 100;
        double cStudentsPercent = cStudents * 1.0 / students * 100;
        double dStudentsPercent = dStudents * 1.0 / students * 100;

        System.out.printf("Top students: %.2f%%%n", aStudentsPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", bStudentsPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", cStudentsPercent);
        System.out.printf("Fail: %.2f%%%n", dStudentsPercent);
        System.out.printf("Average: %.2f", average);
    }
}
