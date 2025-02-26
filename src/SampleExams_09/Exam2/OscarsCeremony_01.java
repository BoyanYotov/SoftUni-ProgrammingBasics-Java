package SampleExams_09.Exam2;

import java.util.Scanner;

public class OscarsCeremony_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());
        double figurines = rent * 0.7;
        double food = figurines * 0.85;
        double sound = food / 2;

        double total = rent + figurines + food + sound;

        System.out.printf("%.2f", total);
    }
}
