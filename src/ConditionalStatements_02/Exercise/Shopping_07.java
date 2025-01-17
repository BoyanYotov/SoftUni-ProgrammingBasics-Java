package ConditionalStatements_02.Exercise;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsQuantity = Integer.parseInt(scanner.nextLine());
        int processorsQuantity = Integer.parseInt(scanner.nextLine());
        int ramMemoryQuantity = Integer.parseInt(scanner.nextLine());
        double videoCardPrice = 250;
        double processorPrice = (videoCardPrice *videoCardsQuantity)*0.35;
        double ramMemoryPrice = (videoCardPrice *videoCardsQuantity)*0.1;

        double totalAmount = (processorsQuantity*processorPrice) + (ramMemoryQuantity*ramMemoryPrice) + (videoCardsQuantity*videoCardPrice);

        if (videoCardsQuantity > processorsQuantity){
            totalAmount *= 0.85;
        }

        double leftover = Math.abs(totalAmount-budget);

        if (totalAmount <= budget){
            System.out.printf("You have %.2f leva left!", leftover);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", leftover);
        }

    }
}
