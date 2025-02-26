package SampleExams_09.Exams8;

import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String duration = scanner.nextLine();
        String type = scanner.nextLine();
        String mobile = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double tax = 0;

        switch (type) {
            case "Small":
                if (duration.equals("one")) {
                    tax = 9.98;
                } else if (duration.equals("two")) {
                    tax = 8.58;
                }
                break;
            case "Middle":
                if (duration.equals("one")) {
                    tax = 18.99;
                } else if (duration.equals("two")) {
                    tax = 17.09;
                }
                break;
            case "Large":
                if (duration.equals("one")) {
                    tax = 25.98;
                } else if (duration.equals("two")) {
                    tax = 23.59;
                }
                break;
            case "ExtraLarge":
                if (duration.equals("one")) {
                    tax = 35.99;
                } else if (duration.equals("two")) {
                    tax = 31.79;
                }
                break;
        }

        if (mobile.equals("yes")) {
            if (tax <= 10.00) {
                tax = tax + 5.50;
            } else if (tax <= 30.00) {
                tax = tax + 4.35;
            } else {
                tax = tax + 3.85;
            }
        }

        if (duration.equals("two")) {
            tax = tax - (tax * 0.0375);
        }

        double total = tax * months;
        System.out.printf("%.2f lv.", total);

    }
}


