package SampleExams_09.Exam7;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int othercolours = 0;

        for (int i = 1; i <= n; i++) {
            String colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    points = 5;
                    redBalls++;
                    break;
                case "orange":
                    points = 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    points = 15;
                    yellowBalls++;
                    break;
                case "white":
                    points = 20;
                    whiteBalls++;
                    break;
                case "black":
                    totalPoints = Math.floor(totalPoints /= 2.0);
                    blackBalls++;
                    points = 0;
                    break;
                default:
                    othercolours++;
                    points = 0;
            }
            totalPoints += points;
        }
        System.out.printf("Total points: %.0f%n", totalPoints);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", othercolours);
        System.out.printf("Divides from black balls: %d", blackBalls);
    }
}
