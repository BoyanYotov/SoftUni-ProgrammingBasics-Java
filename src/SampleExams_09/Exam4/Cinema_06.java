package SampleExams_09.Exam4;

import java.util.Scanner;

public class Cinema_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;
        double income = 0;
        double totalIncome =0;
        String command = scanner.nextLine();

        while (!command.equals("Movie time!")){
            int people = Integer.parseInt(command);
            totalPeople += people;
            if (totalPeople > capacity){
                break;
            } else {
                if (people % 3 != 0) {
                    income = people * 5;
                } else {
                    income = (people * 5) - 5;
                }
            }
            totalIncome += income;

            command = scanner.nextLine();
        }

            if (totalPeople > capacity) {
                System.out.println("The cinema is full.");
            } else {
                System.out.printf("There are %d seats left in the cinema.%n", capacity - totalPeople);
            }

        System.out.printf("Cinema income - %.0f lv.",totalIncome);

    }
}
