package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kilometres = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double price = 0;

        if (kilometres < 20 ) {
            if (dayOrNight.equals("day")) {
                price = kilometres * 0.79 + 0.7;
            } else if (dayOrNight.equals("night")) {
                price = kilometres * 0.9 + 0.7;
            }
        } else if (kilometres < 100){
                price = kilometres * 0.09;
        } else {
                price = kilometres * 0.06;
            }

            System.out.printf("%.2f",price );

        }
    }
