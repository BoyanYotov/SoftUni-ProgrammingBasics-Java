package SampleExams_09.Exam4;

import java.util.Scanner;

public class Series_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (name){
                case "Thrones":
                    price = price * 0.5;
                    break;
                case "Lucifer":
                    price = price * 0.6;
                    break;
                case "Protector":
                    price = price * 0.7;
                    break;
                case "TotalDrama":
                    price = price * 0.8;
                    break;
                case "Area":
                    price = price * 0.9;
                    break;
            }

            budget -= price;

        }

        if (budget >= 0){
            System.out.printf("You bought all the series and left with %.2f lv.",Math.abs(budget));
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!",Math.abs(budget));
        }
    }
}