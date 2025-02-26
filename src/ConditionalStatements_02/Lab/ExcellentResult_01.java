package ConditionalStatements_02.Lab;

import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mark = Integer.parseInt(scanner.nextLine());

        if (mark >= 5) {
            System.out.println("Excellent!");
        }

    }
}
