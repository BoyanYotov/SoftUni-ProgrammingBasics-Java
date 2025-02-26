package ForLoop_04.Lab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenNumbers = evenNumbers + number;
            } else {
                oddNumbers = oddNumbers + number;
            }
        }

        if (evenNumbers == oddNumbers) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddNumbers);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(oddNumbers - evenNumbers));
        }

    }
}
