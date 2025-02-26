package SampleExams_09.Exam6;

import java.util.Scanner;

public class MountainRun_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSecs = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());

        double slowdown = Math.floor(distance / 50) * 30;
        double georgiTime = (distance * secPerMeter) + slowdown;

        if (georgiTime >= recordSecs) {
            System.out.printf("No! He was %.2f seconds slower.", georgiTime - recordSecs);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", georgiTime);
        }

    }
}
