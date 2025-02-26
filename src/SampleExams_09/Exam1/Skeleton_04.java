package SampleExams_09.Exam1;

import java.util.Scanner;

public class Skeleton_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controllaMinutes = Integer.parseInt(scanner.nextLine());
        int controllaSeconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsFor100M = Integer.parseInt(scanner.nextLine());

        int controllaTotal = controllaMinutes * 60 + controllaSeconds;
        double slowSeconds = (length / 120) * 2.5;
        double martinTime = (length / 100) * secondsFor100M - slowSeconds;

        if (martinTime <= controllaTotal) {
            System.out.printf("Marin Bangiev won an Olympic quota!%n");
            System.out.printf("His time is %.3f.", martinTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(controllaTotal - martinTime));
        }
    }
}
