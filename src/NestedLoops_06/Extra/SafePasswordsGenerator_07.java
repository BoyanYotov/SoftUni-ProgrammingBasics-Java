package NestedLoops_06.Extra;

import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maximum = Integer.parseInt(scanner.nextLine());

        char A = (char) 35;
        char B = (char) 64;
        int counter = 0;

            for (int x = 1; x <= a ; x++) {

                for (int y = 1; y <= b; y++) {

                    if (counter >= maximum){
                        return;
                    }

                    if (A > 55){
                        A = 35;
                    }
                    if (B > 96){
                        B = 64;
                    }

                    System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);

                    A++;
                    B++;
                    counter ++;
                }
            }
    }
}
