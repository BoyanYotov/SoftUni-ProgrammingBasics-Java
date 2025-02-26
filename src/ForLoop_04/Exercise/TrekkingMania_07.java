package ForLoop_04.Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsQuantity = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int montBlanc = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;

        for (int i = 1; i <= groupsQuantity; i++) {

            int groupMembersQuantity = Integer.parseInt(scanner.nextLine());

            if (groupMembersQuantity <= 5) {
                musala += groupMembersQuantity;
            } else if (groupMembersQuantity <= 12) {
                montBlanc += groupMembersQuantity;
            } else if (groupMembersQuantity <= 25) {
                kilimandjaro += groupMembersQuantity;
            } else if (groupMembersQuantity <= 40) {
                k2 += groupMembersQuantity;
            } else {
                everest += groupMembersQuantity;
            }

            totalPeople += groupMembersQuantity;
        }

        double percentMusala = musala * 1.0 / totalPeople * 100;
        double percentMontblanc = montBlanc * 1.0 / totalPeople * 100;
        double percentKilimandjaro = kilimandjaro * 1.0 / totalPeople * 100;
        double percentK2 = k2 * 1.0 / totalPeople * 100;
        double percentEverest = everest * 1.0 / totalPeople * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMontblanc);
        System.out.printf("%.2f%%%n", percentKilimandjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);

    }
}
