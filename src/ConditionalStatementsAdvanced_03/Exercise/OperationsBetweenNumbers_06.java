package ConditionalStatementsAdvanced_03.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();
        double result = 0;

        switch (symbol) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", n1, symbol, n2, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", n1, symbol, n2, result);
                }
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", n1, symbol, n2, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", n1, symbol, n2, result);
                }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", n1, symbol, n2, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", n1, symbol, n2, result);
                }
                break;
            case "/":
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.printf("%.0f %s %.0f = %.2f", n1, symbol, n2, result);
                } else {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                }
                break;
            case "%":
                if (n2 != 0) {
                    result = n1 % n2;
                    System.out.printf("%.0f %s %.0f = %.0f", n1, symbol, n2, result);
                } else {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                }
                break;
        }

    }
}
