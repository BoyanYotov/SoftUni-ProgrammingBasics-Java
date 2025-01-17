package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakesQuantity = Integer.parseInt(scanner.nextLine());
        int eggsQuantity = Integer.parseInt(scanner.nextLine());
        int candyQuantity = Integer.parseInt(scanner.nextLine());

        double total =  (cakesQuantity * 3.20) + (eggsQuantity * 4.35) +
                        (eggsQuantity * 12*0.15) + (candyQuantity * 5.40);

        System.out.printf("%.2f",total);

    }
}
