package ConditionalStatements_02.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double delay = (Math.floor(meters / 15)) * 12.5;
        double totalSwimTime = meters * secondsPerMeter + delay;

        if (totalSwimTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSwimTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalSwimTime - recordInSeconds);
        }
    }
}
