package NestedLoops_06.Extra;

import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int count = 0;


        for (int i = 1; i <= tables ; i++) {

            for (int j = 1; j <=men ; j++) {
                for (int k = 1; k <=women ; k++) {

                    System.out.printf("(%d <-> %d) ",j,k);
                    count++;

                    if (count == tables){
                        return;
                    }

                    if (j == men && k == women) {
                        return;
                    }
                }
            }
        }

    }
}
