package ForLoop_04.Extra;

import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int value = 0;
        int lastValue = 0;
        int counter = 0;
        int difference = 0;
        int maxDifference = 0;

        for (int i = 1; i <= n; i++) {
            int numberA = Integer.parseInt(scanner.nextLine());
            int numberB = Integer.parseInt(scanner.nextLine());

            lastValue = value;
            value = numberA + numberB;

            if (value == lastValue) {
                counter++;
            }

            if ((value != lastValue) && i >= 2) {
                difference = Math.abs(value - lastValue);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        }

        if (counter == n - 1) {
            System.out.printf("Yes, value=%d", value);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifference);
        }

    }
}
