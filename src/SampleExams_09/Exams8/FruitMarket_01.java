package SampleExams_09.Exams8;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananaQty = Double.parseDouble(scanner.nextLine());
        double orangesQty = Double.parseDouble(scanner.nextLine());
        double raspberriesQty = Double.parseDouble(scanner.nextLine());
        double strawberriesQty = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice * 0.5;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananaPrice = raspberriesPrice * 0.2;

        double total = (strawberriesPrice * strawberriesQty) +
                (bananaPrice * bananaQty) +
                (orangesPrice * orangesQty) +
                (raspberriesPrice * raspberriesQty);

        System.out.printf("%.2f", total);
    }
}
