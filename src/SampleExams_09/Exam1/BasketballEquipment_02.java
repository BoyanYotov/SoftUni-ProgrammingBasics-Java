package SampleExams_09.Exam1;

import java.util.Scanner;

public class BasketballEquipment_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double shoes = yearTax * 0.6;
        double clothes = shoes * 0.8;
        double ball = clothes / 4;
        double access = ball / 5;

        double total = yearTax + shoes + clothes + ball + access;
        System.out.printf("%.2f",total);
    }
}
