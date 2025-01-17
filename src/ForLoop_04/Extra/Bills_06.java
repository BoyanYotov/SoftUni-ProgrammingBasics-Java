package ForLoop_04.Extra;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double electricityTotal = 0;
        double waterTotal = 0;
        double internetTotal = 0;
        double others = 0;
        double othersTotal = 0;

        for (int i = 1; i <= months ; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

            electricityTotal += electricity;
            waterTotal = 20 * months;
            internetTotal = 15 * months;

            others = (electricity + 20 + 15) * 1.2;
            othersTotal += others;
        }

        double average = (othersTotal + electricityTotal + waterTotal + internetTotal) / months;

        System.out.printf("Electricity: %.2f lv%n",electricityTotal);
        System.out.printf("Water: %.2f lv%n",waterTotal);
        System.out.printf("Internet: %.2f lv%n",internetTotal);
        System.out.printf("Other: %.2f lv%n",othersTotal);
        System.out.printf("Average: %.2f lv",average);

    }
}
