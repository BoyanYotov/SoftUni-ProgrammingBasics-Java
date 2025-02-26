package NestedLoops_06.Exercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                count++;

                System.out.printf("%d ", count);

                if (count == n) {
                    return;
                }

            }

            System.out.println();

        }
    }
}

