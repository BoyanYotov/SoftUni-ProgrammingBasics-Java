package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());


        if (guests >= 10 && guests <= 15){
            pricePerPerson *= 0.85;
        } else if (guests > 15 && guests <= 20){
            pricePerPerson *= 0.8;
        } else if (guests > 20){
            pricePerPerson *= 0.75;
        }

        double cake = budget * 0.1;
        double total = (pricePerPerson * guests) + cake;

        if (total <= budget){
            System.out.printf("It is party time! %.2f leva left.",budget - total);
        } else {
            System.out.printf("No party! %.2f leva needed.", total - budget);
        }

    }
}
