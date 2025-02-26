package ForLoop_04.Lab;

import java.util.Scanner;

public class LeftAndRightSumV1_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftNumbers = 0;
        int rightNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftNumbers = leftNumbers + number;
        }

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightNumbers = rightNumbers + number;
        }

        if (leftNumbers == rightNumbers) {
            System.out.printf("Yes, sum = %d", leftNumbers);
        } else {
            int diff = Math.abs(leftNumbers - rightNumbers);
            System.out.printf("No, diff = %d", diff);
        }

    }
}
