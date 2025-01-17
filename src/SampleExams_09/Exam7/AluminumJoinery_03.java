package SampleExams_09.Exam7;

import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qty = Integer.parseInt(scanner.nextLine());
        String size = scanner.nextLine();
        String delivery = scanner.nextLine();

        double singlePrice = 0;

        switch (size) {
            case "90X130":
                singlePrice = 110;
                if (qty < 10) {
                    System.out.print("Invalid order");
                    return;
                } else if (qty > 30 && qty <= 60) {
                    singlePrice *= 0.95;
                } else if (qty > 60) {
                    singlePrice *= 0.92;
                }
                break;
            case "100X150":
                singlePrice = 140;
                if (qty < 10) {
                    System.out.print("Invalid order");
                    return;
                } else if (qty > 40 && qty <= 80) {
                    singlePrice *= 0.94;
                } else if (qty > 80) {
                    singlePrice *= 0.9;
                }
                break;
            case "130X180":
                singlePrice = 190;
                if (qty < 10) {
                    System.out.print("Invalid order");
                    return;
                } else if (qty > 20 && qty <= 50) {
                    singlePrice *= 0.93;
                } else if (qty > 50) {
                    singlePrice *= 0.88;
                }
                break;
            case "200X300":
                singlePrice = 250;
                if (qty < 10) {
                    System.out.print("Invalid order");
                    return;
                } else if (qty > 25 && qty <= 50) {
                    singlePrice *= 0.91;
                } else if (qty > 50) {
                    singlePrice *= 0.86;
                }
                break;
        }

        double total = singlePrice * qty;

        if (delivery.equals("With delivery")) {
            total += 60;
        }

        if (qty > 99) {
            total *= 0.96;
        }

        System.out.printf("%.2f BGN", total);
    }
}

