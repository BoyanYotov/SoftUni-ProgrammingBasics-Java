package SampleExams_09.Exam5;

import java.util.Scanner;

public class Renovation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int notForPaint = Integer.parseInt(scanner.nextLine());
        double areaForPaint = Math.ceil((height * width * 4) * (1 - notForPaint * 1.0 / 100));

        String command = scanner.nextLine();

        while (!command.equals("Tired!")) {
            int litres = Integer.parseInt(command);
            areaForPaint -= litres;

            if (areaForPaint == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
                return;
            } else if (areaForPaint < 0) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(areaForPaint));
                return;
            }

            command = scanner.nextLine();
        }

        System.out.printf("%.0f quadratic m left.", areaForPaint);
    }
}
