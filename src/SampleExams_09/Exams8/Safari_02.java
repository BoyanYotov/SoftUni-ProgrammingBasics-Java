package SampleExams_09.Exams8;

import java.util.Scanner;

public class Safari_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double liters = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double litersTotal = liters * 2.10;
        int guide = 100;
        double grandTotal = 0;

        if (day.equals("Saturday")){
            grandTotal = (litersTotal + guide) * 0.9;
        } else if (day.equals("Sunday")) {
            grandTotal = (litersTotal + guide) * 0.8;
        }

        if (budget >= grandTotal){
            System.out.printf("Safari time! Money left: %.2f lv. ",budget - grandTotal);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",Math.abs(grandTotal-budget));
        }
    }
}
