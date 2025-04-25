package NestedLoops_06.Extra;

import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char endLetter = scanner.nextLine().charAt(0);
        int firstSectorSeats = Integer.parseInt(scanner.nextLine());
        int oddRowSeats = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 65; i <= (int) endLetter; i++) {
            char letter = (char) i;

            for (int j = 1; j <= firstSectorSeats; j++) {

                if (j % 2 != 0) {

                    for (int k = 0; k < oddRowSeats; k++) {
                        char letterRow = (char) (97 + k);
                        counter++;

                        System.out.print(letter);
                        System.out.print(j);
                        System.out.print(letterRow);
                        System.out.println();

                    }
                } else {

                    for (int k = 0; k < oddRowSeats + 2; k++) {
                        char letterRow = (char) (97 + k);
                        counter++;

                        System.out.print(letter);
                        System.out.print(j);
                        System.out.print(letterRow);
                        System.out.println();
                    }
                }
            }
            firstSectorSeats++;
        }

        System.out.println(counter);
    }
}
