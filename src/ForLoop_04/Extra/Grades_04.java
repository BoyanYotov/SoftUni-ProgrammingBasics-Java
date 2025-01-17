package ForLoop_04.Extra;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int AStudents = 0;
        int BStudents = 0;
        int CStudents = 0;
        int DStudents = 0;
        double totalMark = 0;

        for (int i = 1; i <= students ; i++) {
            double mark = Double.parseDouble(scanner.nextLine());

            if (mark >= 2.00 && mark <= 2.99){
                DStudents++;
            } else if (mark >= 3.00 && mark <= 3.99){
                CStudents++;
            } else if (mark >= 4.00 && mark <= 4.99){
                BStudents++;
            } else if (mark >= 5.00){
                AStudents++;
            }

            totalMark += mark;
        }

        double average = totalMark / students;
        double AStudentsPercentage = AStudents * 1.0 / students * 100;
        double BStudentsPercentage = BStudents * 1.0 / students * 100;
        double CStudentsPercentage = CStudents * 1.0 / students * 100;
        double DStudentsPercentage = DStudents * 1.0 / students * 100;

        System.out.printf("Top students: %.2f%%%n", AStudentsPercentage);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", BStudentsPercentage);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", CStudentsPercentage);
        System.out.printf("Fail: %.2f%%%n",DStudentsPercentage);
        System.out.printf("Average: %.2f",average);

    }
}
