package ConditionalStatementsAdvanced_03.Extra;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String host = "";
        String destination = "";
        double price = 0;

        if (budget <= 1000) {
            host = "Camp";
            if (season.equals("Summer")){
                destination = "Alaska";
                price = budget * 0.65;
            } else if (season.equals("Winter")) {
                destination = "Morocco";
                price = budget * 0.45;
            }
        } else if (budget > 1000 & budget <= 3000){
            host = "Hut";
            if (season.equals("Summer")){
                destination = "Alaska";
                price = budget * 0.8;
            } else if (season.equals("Winter")) {
                destination = "Morocco";
                price = budget * 0.6;
            }
        } else if (budget > 3000){
            host = "Hotel";
            if (season.equals("Summer")){
                destination = "Alaska";
                price = budget * 0.9;
            } else if (season.equals("Winter")) {
                destination = "Morocco";
                price = budget * 0.9;
            }
        }

        System.out.printf("%s - %s - %.2f",destination,host,price);

    }
}
