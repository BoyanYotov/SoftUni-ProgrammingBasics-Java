package SampleExams_09.Exam4;

import java.util.Scanner;

public class MovieDay_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shootingTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());

        double total = scenes * time + (shootingTime * 0.15);

        if (total <= shootingTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", shootingTime - total);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(shootingTime - total));
        }
    }
}

