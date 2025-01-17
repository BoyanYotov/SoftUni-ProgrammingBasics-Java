package SampleExams_09.Exam1;

import java.util.Scanner;

public class TennisEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketsQuantity = Integer.parseInt(scanner.nextLine());
        int shoesQuantity = Integer.parseInt(scanner.nextLine());
        double shoesPrice = racketPrice/6;

        double totalSum = (shoesPrice * shoesQuantity + racketPrice * racketsQuantity) * 1.2;
        double jokovicShare = totalSum / 8;
        double sponsorsShare = totalSum * 7/8;

        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(jokovicShare));
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(sponsorsShare));
    }
}
