package SampleExams_09.Exam4;

import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double single = Double.parseDouble(scanner.nextLine());

        double totalEpisode = seasons * episodes * (single * 1.2) + (seasons * 10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", series, Math.floor(totalEpisode));
    }
}
