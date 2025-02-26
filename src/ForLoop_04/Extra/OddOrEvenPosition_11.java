package ForLoop_04.Extra;

import java.util.Scanner;

public class OddOrEvenPosition_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxEven = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;
        double sumEven = 0;
        double maxOdd = Integer.MIN_VALUE;
        double minOdd = Integer.MAX_VALUE;
        double sumOdd = 0;
        int position = 0;

        if (n == 0) {
            minEven = 0;
            maxEven = 0;
            minOdd = 0;
            maxOdd = 0;
        } else if (n < 2) {
            minEven = 0;
            maxEven = 0;
        }

        for (int i = 1; i <= n; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            position++;

            if ((position % 2 == 0) && (position > 1)) {
                if (currentNumber > maxEven) {
                    maxEven = currentNumber;
                }
                if (currentNumber < minEven) {
                    minEven = currentNumber;
                }
                sumEven += currentNumber;
            } else if ((position % 2 != 0)) {
                if (currentNumber > maxOdd) {
                    maxOdd = currentNumber;
                }
                if (currentNumber < minOdd) {
                    minOdd = currentNumber;
                }
                sumOdd += currentNumber;
            }
        }

        System.out.printf("OddSum=%.2f,%n", sumOdd);
        if (minOdd == 0) {
            System.out.printf("OddMin=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%n", minOdd);
        }
        if (maxOdd == 0) {
            System.out.printf("OddMax=No,%n");
        } else {
            System.out.printf("OddMax=%.2f,%n", maxOdd);
        }
        System.out.printf("EvenSum=%.2f,%n", sumEven);
        if (minEven == 0) {
            System.out.printf("EvenMin=No,%n");
        } else {
            System.out.printf("EvenMin=%.2f,%n", minEven);
        }
        if (maxEven == 0) {
            System.out.printf("EvenMax=No%n");
        } else {
            System.out.printf("EvenMax=%.2f%n", maxEven);
        }

    }
}
