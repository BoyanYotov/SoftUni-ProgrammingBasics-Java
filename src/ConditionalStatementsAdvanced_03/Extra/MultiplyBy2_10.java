package ConditionalStatementsAdvanced_03.Extra;

import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i > 0 ; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number < 0){
                System.out.println("Negative number!");
                break;
            } else {
                System.out.printf("Result: %.2f%n",number * 2);
            }
        }

    }
}
