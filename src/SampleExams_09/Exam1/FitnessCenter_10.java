package SampleExams_09.Exam1;

import java.util.Scanner;

public class FitnessCenter_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int shake = 0;
        int bars = 0;
        int sportPeople = 0;
        int proteinPeople = 0;

        for (int i = 1; i <= people; i++) {
            String activity = scanner.nextLine();

            if (activity.equals("Back")) {
                back++;
                sportPeople++;
            } else if (activity.equals("Chest")) {
                chest++;
                sportPeople++;
            } else if (activity.equals("Legs")) {
                legs++;
                sportPeople++;
            } else if (activity.equals("Abs")) {
                abs++;
                sportPeople++;
            } else if (activity.equalsIgnoreCase("Protein shake")) {
                shake++;
                proteinPeople++;
            } else if (activity.equalsIgnoreCase("Protein bar")) {
                bars++;
                proteinPeople++;
            }
        }

        double sportPeoplePercentage = sportPeople * 1.0 / people * 100;
        double proteinPeoplePercentage = proteinPeople * 1.0 / people * 100;

        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", shake);
        System.out.printf("%d - protein bar%n", bars);
        System.out.printf("%.2f%% - work out%n", sportPeoplePercentage);
        System.out.printf("%.2f%% - protein", proteinPeoplePercentage);
    }
}