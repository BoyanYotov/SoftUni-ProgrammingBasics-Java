package NestedLoops_06.Extra;

import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = begin; i <= end ; i++) {
            for (int j = begin; j <= end ; j++) {
                for (int k = begin; k <= end ; k++) {
                    for (int l = begin; l <= end ; l++) {

                        if (i % 2 == 0 && l % 2 == 0){
                            continue;
                        } else if (i % 2 != 0 && l % 2 != 0) {
                            continue;
                        }

                        if (l >= i){
                            continue;
                        }

                        if (( j + k ) % 2 != 0){
                            continue;
                        }

                        System.out.printf("%d%d%d%d ",i,j,k,l);

                    }
                }
            }
        }

    }
}
