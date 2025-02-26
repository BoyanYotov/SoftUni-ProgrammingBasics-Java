package NestedLoops_06.Extra;

import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        char first = a.charAt(0);
        char second = b.charAt(0);
        char third = c.charAt(0);
        int count = 0;

        for (int i = first; i <= second; i++) {
            if (i == third) {
                continue;
            }

            for (int j = first; j <= second; j++) {
                if (j == third) {
                    continue;
                }

                for (int k = first; k <= second; k++) {
                    if (k == third) {
                        continue;
                    }

                    count++;
                    System.out.printf("%c%c%c ", i, j, k);
                }
            }
        }

        System.out.printf("%d", count);

    }
}
