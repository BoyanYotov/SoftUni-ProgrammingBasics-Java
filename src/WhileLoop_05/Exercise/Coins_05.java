package WhileLoop_05.Exercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double changeCoins = Math.floor(change * 100);
        int count = 0;

        while (changeCoins > 0) {
            if (changeCoins >= 200) {
                changeCoins -= 200;
                count++;
            } else if (changeCoins >= 100) {
                changeCoins -= 100;
                count++;
            } else if (changeCoins >= 50) {
                changeCoins -= 50;
                count++;
            } else if (changeCoins >= 20) {
                changeCoins -= 20;
                count++;
            } else if (changeCoins >= 10) {
                changeCoins -= 10;
                count++;
            } else if (changeCoins >= 5) {
                changeCoins -= 5;
                count++;
            } else if (changeCoins >= 2) {
                changeCoins -= 2;
                count++;
            } else {
                changeCoins -= 1;
                count++;
            }
        }

        System.out.print(count);

    }
}