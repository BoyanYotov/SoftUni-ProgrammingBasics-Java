package SampleExams_09.Exam6;

import java.util.Scanner;

public class TrekkingMania_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;
        int Musallah = 0;
        int MonBlanc = 0;
        int Kilimandjaro = 0;
        int K2 = 0;
        int Everest = 0;

        for (int i = 1; i <= groups ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople += people;

            if (people <= 5){
            Musallah += people;
            } else if (people <= 12){
                MonBlanc += people;
            } else if (people <= 25){
                Kilimandjaro += people;
            } else if (people <= 40){
                K2 += people;
            } else {
                Everest += people;
            }
        }

        System.out.printf("%.2f%%%n",Musallah * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n",MonBlanc * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n",Kilimandjaro * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n",K2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%",Everest * 1.0 / totalPeople * 100);
    }
}
