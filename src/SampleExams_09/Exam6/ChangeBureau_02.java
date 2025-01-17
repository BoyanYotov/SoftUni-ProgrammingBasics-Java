package SampleExams_09.Exam6;

import java.util.Scanner;

public class ChangeBureau_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitCoinsQty = Integer.parseInt(scanner.nextLine());
        double chineseQty = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double total = ((bitCoinsQty * 1168) + ((chineseQty * 0.15) * 1.76)) / 1.95;
        double totalNet = total - (total * commission / 100);

        System.out.printf("%.2f",totalNet);
    }
}
