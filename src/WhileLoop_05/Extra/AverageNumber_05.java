package WhileLoop_05.Extra;

import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int total = 0;

        for (int i = 1; i <= number ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            count++;
            total+=input;
        }

        System.out.printf("%.2f",total * 1.0 / count);

    }
}
