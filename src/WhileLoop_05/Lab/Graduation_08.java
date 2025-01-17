package WhileLoop_05.Lab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int year = 1;
        double gradesSum = 0;
        int failsCount = 0;

        while (year <= 12) {

            if (failsCount > 1){
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4){
                failsCount++;
                continue;
            }
            gradesSum += grade;
            year++;
        }

        if (failsCount > 1){
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double average = gradesSum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }

    }
}