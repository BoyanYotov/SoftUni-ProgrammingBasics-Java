package DrawingFiguresWithLoops_08;

import java.util.Scanner;

public class RectangleOfNxNStars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
