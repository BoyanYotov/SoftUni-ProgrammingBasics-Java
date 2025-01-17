package ConditionalStatementsAdvanced_03.Exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May", "October":
                studioPrice = night * 50;
                apartmentPrice = night * 65;
                if (night > 7 && night <= 14) {
                    studioPrice = studioPrice * 0.95;
                } else if (night > 14) {
                    studioPrice = studioPrice * 0.7;
                }
                break;
            case "June", "September":
                studioPrice = night * 75.20;
                apartmentPrice = night * 68.70;
                if (night > 14) {
                    studioPrice = studioPrice * 0.8;
                }
                break;
            case "July", "August":
                studioPrice = night * 76;
                apartmentPrice = night * 77;
                break;
        }

        if (night > 14) {
            apartmentPrice *= 0.9;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);

    }
}
