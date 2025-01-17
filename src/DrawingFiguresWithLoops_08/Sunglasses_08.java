package DrawingFiguresWithLoops_08;

import java.util.Scanner;

public class Sunglasses_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            if ((i == 1) || (i == n)){
                for (int j = 1; j <= n * 2 ; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <=n ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n * 2 ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            if (((n % 2 == 0) && (i == n / 2)) || ((n % 2 != 0) && (i == n / 2 + 1))){
                for (int j = 1; j <= n * 2 ; j++) {
                    if ((j == 1) || (j == n * 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print("/");
                    }
                }

                for (int k = 1; k <=n ; k++) {
                    System.out.print("|");
                }

                for (int q = 1; q <=n*2 ; q++) {
                    if ((q == 1) || (q == n * 2)){
                        System.out.print("*");
                    } else {
                        System.out.print("/");
                    }
                }
                System.out.println();

            } else if ((i >= 2) && (i < n)){

                for (int j = 1; j <= n * 2 ; j++) {
                    if ((j == 1) || (j == n * 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print("/");
                    }
                }

                for (int k = 1; k <=n ; k++) {
                    System.out.print(" ");
                }

                for (int q = 1; q <= n * 2 ; q++) {
                    if ((q == 1) || (q == n * 2)){
                        System.out.print("*");
                    } else {
                        System.out.print("/");
                    }
                }
                System.out.println();
            }
        }
    }
}
