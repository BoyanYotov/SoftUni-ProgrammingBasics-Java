package NestedLoops_06.Extra;

import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstNumber; i++) {
            if (i % 2 != 0) {
                continue;
            }

            for (int j = 2; j <= secondNumber; j++) {
                if (j == 4 || j == 6 || j == 8 || j == 9) {
                    continue;
                }

                for (int k = 1; k <= thirdNumber; k++) {
                    if (k % 2 != 0) {
                        continue;
                    }

                    System.out.printf("%d %d %d%n", i, j, k);

                }
            }
        }
    }
}
