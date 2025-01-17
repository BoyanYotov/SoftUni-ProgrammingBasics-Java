package SampleExams_09.Exam1;

import java.util.Scanner;

public class TennisRanklist_09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        double initialPoints = Double.parseDouble(scanner.nextLine());
        double totalPoints = initialPoints;

        int winsCount = 0;

        for (int i = 1; i <= quantity; i++) {
            String rank = scanner.nextLine();

            switch (rank){
                case "W":
                totalPoints += 2000;
                    winsCount++;
                    break;
                case "F":
                totalPoints += 1200;
                    break;
                case "SF":
                totalPoints += 720;
                    break;
            }
        }

        double average = Math.floor ((totalPoints-initialPoints) / quantity);
        System.out.printf("Final points: %.0f%n",totalPoints);
        System.out.printf("Average points: %.0f%n",average);
        System.out.printf("%.2f%%", winsCount * 1.0/ quantity * 100);
    }
}
