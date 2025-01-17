package SampleExams_09.Exam5;

import java.util.Scanner;

public class PoolDay_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entranceFee = Double.parseDouble(scanner.nextLine());
        double chairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double umbrellaTotal = (Math.ceil(people * 0.5) * umbrellaPrice);
        double chaiseTotal = (Math.ceil(people * 0.75) * chairPrice);
        double total = umbrellaTotal + chaiseTotal + (people * entranceFee);

        System.out.printf("%.2f lv.",total);
    }
}
