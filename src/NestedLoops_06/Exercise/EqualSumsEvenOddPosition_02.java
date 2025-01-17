package NestedLoops_06.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int currentDigit = 0;

        for (int currentNumber = firstNumber; currentNumber <= endNumber; currentNumber++) {
            int number = currentNumber;
            int position = 0;
            int evenSum = 0;
            int oddSum = 0;

            while (number > 0) {
                currentDigit = number % 10;

                if (position % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }

                number = number / 10;
                position++;
            }

            if (oddSum == evenSum) {
                System.out.printf("%d ", currentNumber);
            }
        }

    }
}