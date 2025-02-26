package SampleExams_09.Exam7;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int ticketsAdults = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());

        double priceKids = (priceAdult * 0.3) + serviceFee;
        double priceAdults = priceAdult + serviceFee;
        double totalProfit = ((priceAdults * ticketsAdults) + (priceKids * ticketsKids)) * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, totalProfit);
    }
}
