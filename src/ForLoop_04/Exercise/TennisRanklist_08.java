package ForLoop_04.Exercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playsQuantity = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int totalPoints = startPoints;
        int winsCount = 0;

        for (int i = 1; i <= playsQuantity; i++) {
            String position = scanner.nextLine();

            if (position.equals("W")){
            totalPoints += 2000;
            winsCount++;
            } else if (position.equals("F")){
            totalPoints += 1200;
            } else if (position.equals("SF")){
            totalPoints += 720;
            }
        }

        double average = Math.floor((totalPoints-startPoints) * 1.0 / playsQuantity);
        double winPercentage = winsCount * 1.0/ playsQuantity *100;

        System.out.printf("Final points: %d%n",totalPoints);
        System.out.printf("Average points: %.0f%n",average);
        System.out.printf("%.2f%%",winPercentage);

    }
}
