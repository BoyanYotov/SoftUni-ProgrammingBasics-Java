package WhileLoop_05.Lab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxValue = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number > maxValue) {
                maxValue = number;
            }

            input = scanner.nextLine();

        }

        System.out.println(maxValue);

    }
}
