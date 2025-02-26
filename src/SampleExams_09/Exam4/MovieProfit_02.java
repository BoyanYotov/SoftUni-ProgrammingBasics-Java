package SampleExams_09.Exam4;

import java.util.Scanner;

public class MovieProfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double cinema = Double.parseDouble(scanner.nextLine());

        double profit = (days * tickets * price) * (1 - (cinema / 100));

        System.out.printf("The profit from the movie %s is %.2f lv.", name, profit);
    }
}
