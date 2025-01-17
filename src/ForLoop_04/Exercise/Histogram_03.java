package ForLoop_04.Exercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;

        for (int i = 1; i <=  n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200){
                countP1++;
            } else if (number <= 399){
                countP2++;
            }else if (number <= 599) {
                countP3++;
            } else if (number <= 799){
                countP4++;
            } else {
                countP5++;
            }
        }

        double p1Percentage = countP1 * 1.0/n*100;
        double p2Percentage = countP2 * 1.0/n*100;
        double p3Percentage = countP3 * 1.0/n*100;
        double p4Percentage = countP4 * 1.0/n*100;
        double p5Percentage = countP5 * 1.0/n*100;

        System.out.printf("%.2f%%%n",p1Percentage);
        System.out.printf("%.2f%%%n",p2Percentage);
        System.out.printf("%.2f%%%n",p3Percentage);
        System.out.printf("%.2f%%%n",p4Percentage);
        System.out.printf("%.2f%%%n",p5Percentage);

    }
}
