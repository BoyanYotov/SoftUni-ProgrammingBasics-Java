package DrawingFiguresWithLoops_08;

import java.util.Scanner;

public class ChristmasTree_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int spaces = n;

        for (int i = 1; i <= (n + 1); i++) {
            for (int j = (spaces); j > 0; j--) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.printf(" | %n");
            } else {
                for (int j = 1; j <= i-1; j++) {
                    System.out.print("*");
                }
                System.out.print(" | ");
                for (int j = 1; j <= i-1 ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            spaces--;
        }
    }
}
