package ForLoop_04.Extra;

import java.util.Scanner;

public class FootballLeague_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityStadium = Integer.parseInt(scanner.nextLine());
        int fansQuantity = Integer.parseInt(scanner.nextLine());
        int sectorAFans = 0;
        int sectorBFans = 0;
        int sectorCFans = 0;
        int sectorDFans = 0;

        for (int i = 1; i <= fansQuantity; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")){
                sectorAFans++;
            } else if (sector.equals("B")) {
                sectorBFans++;
            } else if (sector.equals("V")) {
                sectorCFans++;
            } else if (sector.equals("G")) {
                sectorDFans++;
            }
        }

        double percentageA = sectorAFans * 1.0 / fansQuantity * 100;
        double percentageB = sectorBFans * 1.0 / fansQuantity * 100;
        double percentageC = sectorCFans * 1.0 / fansQuantity * 100;
        double percentageD = sectorDFans * 1.0 / fansQuantity * 100;

        System.out.printf("%.2f%%%n",percentageA);
        System.out.printf("%.2f%%%n",percentageB);
        System.out.printf("%.2f%%%n",percentageC);
        System.out.printf("%.2f%%%n",percentageD);
        System.out.printf("%.2f%%", fansQuantity * 1.0 / capacityStadium * 100);

    }
}
