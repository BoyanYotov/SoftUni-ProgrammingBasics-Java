package ConditionalStatementsAdvanced_03.Extra;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        double fee = 0;

        switch (type){
            case "trail":
            fee = (juniors * 5.50) + (seniors * 7);
                break;
            case "cross-country":
            fee = (juniors * 8) + (seniors * 9.5);
                if (juniors + seniors >= 50){
                    fee *= 0.75;
                }
                break;
            case "downhill":
                fee = (juniors * 12.25) + (seniors * 13.75);
                break;
            case "road":
                fee = (juniors * 20) + (seniors * 21.50);
                break;
        }

       fee *= 0.95;

        System.out.printf("%.2f",fee);

    }
}
