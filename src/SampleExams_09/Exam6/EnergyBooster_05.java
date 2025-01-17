package SampleExams_09.Exam6;

import java.util.Scanner;

public class EnergyBooster_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int qty = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (fruit){
            case "Watermelon":
                if (size.equals("small")){
                    price = 2 * 56;
                } else if (size.equals("big")){
                    price = 5 * 28.70;
                }
                break;
            case "Mango":
                if (size.equals("small")){
                    price = 2 * 36.66;
                } else if (size.equals("big")){
                    price = 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (size.equals("small")){
                    price = 2 * 42.10;
                } else if (size.equals("big")){
                    price = 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (size.equals("small")){
                    price = 2 * 20;
                } else if (size.equals("big")){
                    price = 5 * 15.20;
                }
                break;
        }

        double total = price * qty;
        if (total >= 400 && total <= 1000){
            total *= 0.85;
        } else if (total > 1000){
            total /= 2;
        }

        System.out.printf("%.2f lv.",total);
    }
}
