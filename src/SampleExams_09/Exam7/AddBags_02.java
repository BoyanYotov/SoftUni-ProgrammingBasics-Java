package SampleExams_09.Exam7;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceKgOver20 = Double.parseDouble(scanner.nextLine());
        double luggageKgs = Double.parseDouble(scanner.nextLine());
        int daysUntilTrip = Integer.parseInt(scanner.nextLine());
        int luggagePieces = Integer.parseInt(scanner.nextLine());

        double extraFee = 0;

        if (luggageKgs < 10){
            extraFee = priceKgOver20 * 0.2;
        } else if (luggageKgs <= 20){
            extraFee = priceKgOver20 * 0.5;
        } else {
            extraFee = priceKgOver20;
        }

        double daysFee = 0;

        if (daysUntilTrip > 30){
            extraFee *= 1.1;
        } else if (daysUntilTrip >= 7) {
            extraFee *= 1.15;
        } else {
            extraFee *= 1.4;
        }

        double totalPrice = extraFee * luggagePieces;

        System.out.printf("The total price of bags is: %.2f lv. ",totalPrice);
    }
}
