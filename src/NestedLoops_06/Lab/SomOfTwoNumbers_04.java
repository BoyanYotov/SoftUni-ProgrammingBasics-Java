package NestedLoops_06.Lab;

import java.util.Scanner;

public class SomOfTwoNumbers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false;

        for (int i = startNumber; i <= endNumber ; i++) {
            for (int j = startNumber; j <= endNumber ; j++) {
                        count++;

                if (i+j == magicNumber){
                    System.out.printf("Combination N:%d ",count);
                    System.out.printf("(%d + %d = %d)",i,j,i+j);
                    isFound = true;
                    break;
                }

            }
                if (isFound){
                    break;
                }
        }

        if (!isFound){
            System.out.printf("%d combinations - neither equals %d",count,magicNumber);
        }
    }
}
