package WhileLoop_05.Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int pieces = a * b;

        while (pieces > 0) {
            String command = scanner.nextLine();
            if (command.equals("STOP")) {
                break;
            }

            int takes = Integer.parseInt(command);
            pieces -= takes;
        }

        if (pieces > 0) {
            System.out.printf("%d pieces are left.", pieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        }

    }
}