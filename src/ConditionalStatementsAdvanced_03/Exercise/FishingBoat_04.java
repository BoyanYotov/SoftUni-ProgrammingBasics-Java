package ConditionalStatementsAdvanced_03.Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        switch (season) {
            case "Spring":
            rent = 3000;
            if (people <= 6){
                rent *= 0.9;
            } else if (people <= 11) {
                rent *= 0.85;
            } else {
                rent *= 0.75;
            }
                break;
            case "Summer","Autumn":
            rent = 4200;
                if (people <= 6){
                    rent *= 0.9;
                } else if (people <= 11){
                    rent *= 0.85;
                } else {
                    rent *= 0.75;
                }
                break;
            case "Winter":
            rent = 2600;
            if (people <= 6){
                    rent *= 0.9;
                } else if (people <= 11){
                    rent *= 0.85;
                } else {
                    rent *= 0.75;
                }
                break;
        }

        if (!season.equals("Autumn") && people % 2 ==0 ){
            rent *= 0.95;
        }

        if (rent <= budget){
            System.out.printf("Yes! You have %.2f leva left.",Math.abs(budget-rent));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(budget-rent));
        }

    }
}
