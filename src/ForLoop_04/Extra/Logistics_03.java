package ForLoop_04.Extra;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double total = 0;
        int bus = 0;
        int camion = 0;
        int train = 0;
        int kgs = 0;

        for (int i = 1; i <= n ; i++) {
            int weight = Integer.parseInt(scanner.nextLine());

            kgs+=weight;

            if (weight <= 3){
                price = weight * 200;
                total += price;
                bus += weight;
            } else if (weight <= 11){
                price = weight * 175;
                total += price;
                camion += weight;
            } else {
                price = weight * 120;
                total += price;
                train += weight;
            }
        }

        double average = total / kgs;
        double percentageBus = bus * 1.0 / kgs * 100;
        double percentageCamion = camion * 1.0 / kgs * 100;
        double percentageTrain = train * 1.0 / kgs * 100;

        System.out.printf("%.2f%n",average);
        System.out.printf("%.2f%%%n",percentageBus);
        System.out.printf("%.2f%%%n",percentageCamion);
        System.out.printf("%.2f%%",percentageTrain);

    }
}
