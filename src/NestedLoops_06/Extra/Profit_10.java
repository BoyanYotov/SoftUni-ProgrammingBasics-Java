package NestedLoops_06.Extra;

import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLev = Integer.parseInt(scanner.nextLine());
        int twoLevs = Integer.parseInt(scanner.nextLine());
        int fiveLevs = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneLev; i++) {

            for (int j = 0; j <= twoLevs; j++) {

                for (int k = 0; k <= fiveLevs; k++) {

                    if (i + j * 2 + k * 5 == amount) {

                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, amount);
                    }

                }
            }
        }

    }
}