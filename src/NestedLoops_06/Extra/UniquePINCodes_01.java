package NestedLoops_06.Extra;

import java.util.Scanner;

public class UniquePINCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= a ; i++) {
            if (i % 2 != 0){
                continue;
            }

            for (int j = 2; j <= b ; j++) {
                if (j == 4 || j == 6 || j == 8 || j == 9){
                    continue;
                }

                for (int k = 1; k <= c ; k++) {
                    if (k % 2 != 0){
                        continue;
                    }

                    System.out.printf("%d %d %d%n",i,j,k);

                }
            }
        }

    }
}
