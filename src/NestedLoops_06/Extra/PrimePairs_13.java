package NestedLoops_06.Extra;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumberFirstCouple = Integer.parseInt(scanner.nextLine());
        int startNumberSecondCouple = Integer.parseInt(scanner.nextLine());
        int differenceFirstCouple = Integer.parseInt(scanner.nextLine());
        int differenceSecondCouple = Integer.parseInt(scanner.nextLine());

        for (int i = startNumberFirstCouple; i <= startNumberFirstCouple + differenceFirstCouple; i++) {

            for (int k = startNumberSecondCouple; k <= startNumberSecondCouple + differenceSecondCouple; k++) {

                boolean firstPairIsPrime = true;
                boolean secondPairIsPrime = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        firstPairIsPrime = false;
                    }
                }

                for (int j = 2; j <= k / 2; j++) {
                    if (k % j == 0) {
                        secondPairIsPrime = false;
                    }
                }

                if (firstPairIsPrime && secondPairIsPrime) {
                    int number = Integer.parseInt(String.valueOf(i) + String.valueOf(k));
                    System.out.println(number);
                }
            }
        }
    }
}


