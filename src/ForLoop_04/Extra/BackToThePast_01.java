package ForLoop_04.Extra;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        for (int i = 1800; i <= year; i++) {

            if (i % 2 == 0) {
                money -= 12000;
            } else {
                int age = (i - 1800) + 18;
                money = money - 12000 - (50 * age);
            }
        }

        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            double diff = Math.abs(money);
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }

    }
}