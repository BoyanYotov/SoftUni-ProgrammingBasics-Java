package NestedLoops_06.Extra;

import java.util.Scanner;

public class TheSongOfWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String password = "";

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {

                        if (a < b && c > d && ((a * b) + (c * d) == M)) {

                            System.out.printf("%d%d%d%d ", a, b, c, d);
                            counter++;

                            if (counter == 4) {
                                password = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d);
                            }
                        }

                    }
                }
            }
        }

                System.out.println();
                if (counter >= 4) {
                    System.out.println("Password: " + password);
                } else {
                    System.out.println("No!");
                }
    }
}