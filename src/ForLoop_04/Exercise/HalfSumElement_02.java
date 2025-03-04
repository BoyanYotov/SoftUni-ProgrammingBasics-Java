package ForLoop_04.Exercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            total += number;

            if (number > maxValue) {
                maxValue = number;
            }
        }

        if (maxValue == (total - maxValue)) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxValue);
        } else {
            int diff = Math.abs(maxValue - (total - maxValue));
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }

    }
}
