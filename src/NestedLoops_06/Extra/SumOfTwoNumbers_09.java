package NestedLoops_06.Extra;

import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isFound = false;
        int firstDigit = 0;
        int lastDigit = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                counter++;

                if (i + j == magicNumber) {
                    firstDigit = i;
                    lastDigit = j;
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        if (isFound) {
            System.out.printf("Combination N:%d ", counter);
            System.out.printf("(%d + %d = %d)", firstDigit, lastDigit, firstDigit + lastDigit);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
