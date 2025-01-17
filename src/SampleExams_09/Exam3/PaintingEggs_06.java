package SampleExams_09.Exam3;

import java.util.Scanner;

public class PaintingEggs_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String colour = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (size.equals("Large")){
            switch (colour){
                case "Red":
                    price = 16;
                    break;
                case "Green":
                    price = 12;
                    break;
                case "Yellow":
                    price = 9;
                    break;
            }
        } else if (size.equals("Medium")){
            switch (colour){
                case "Red":
                    price = 13;
                    break;
                case "Green":
                    price = 9;
                    break;
                case "Yellow":
                    price = 7;
                    break;
            }
        } else if (size.equals("Small")){
            switch (colour){
                case "Red":
                    price = 9;
                    break;
                case "Green":
                    price = 8;
                    break;
                case "Yellow":
                    price = 5;
                    break;
            }
        }

        double total = quantity * price * 0.65;
        System.out.printf("%.2f leva.",total);
    }
}