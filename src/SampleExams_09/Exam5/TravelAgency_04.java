package SampleExams_09.Exam5;

import java.util.Scanner;

public class TravelAgency_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String type = scanner.nextLine();
        String VIP = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double dayPrice = 0;

        if (days <= 0) {
            System.out.print("Days must be positive number!");
            return;
        }

        switch (destination) {
            case "Bansko":
            case "Borovets":
                if (type.equals("withEquipment")) {
                    dayPrice = 100;
                    if (VIP.equals("yes")) {
                        dayPrice *= 0.9;
                    }
                } else if (type.equals("noEquipment")) {
                    dayPrice = 80;
                    if (VIP.equals("yes")) {
                        dayPrice *= 0.95;
                    }
                } else {
                    System.out.print("Invalid input!");
                    return;
                }
                break;
            case "Varna":
            case "Burgas":
                if (type.equals("withBreakfast")) {
                    dayPrice = 130;
                    if (VIP.equals("yes")) {
                        dayPrice *= 0.88;
                    }
                } else if (type.equals("noBreakfast")) {
                    dayPrice = 100;
                    if (VIP.equals("yes")) {
                        dayPrice *= 0.93;
                    }
                } else {
                    System.out.print("Invalid input!");
                    return;
                }
                break;
            default:
                System.out.print("Invalid input!");
                return;
        }

        double total = days * dayPrice;

        if (days >= 7){
            total = (days - 1) * dayPrice;
        }

        System.out.printf("The price is %.2flv! Have a nice time!",total);
    }
}
