package SampleExams_09.Exam6;

import java.util.Scanner;

public class SuitcasesLoad_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double totalSpace = 0;
        int bags = 0;

        while (!command.equals("End")) {
            double space = Double.parseDouble(command);
            totalSpace += space;

            if (totalSpace >= capacity) {
                System.out.println("No more space!");
                break;
            } else {
                bags++;
            }

            command = scanner.nextLine();
        }

        if (totalSpace < capacity) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.printf("Statistic: %d suitcases loaded.", bags);
    }
}
