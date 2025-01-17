package SampleExams_09.Exam5;

import java.util.Scanner;

public class NameGame_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int points = 0;
        int totalPoins = 0;
        int maxPoints = 0;
        String winner = "";

        while (!name.equals("Stop")){
            int length = name.length();
            totalPoins = 0;

             for (int i = 0; i < length ; i++) {
                int currentNumber = Integer.parseInt(scanner.nextLine());
                char first = (char) currentNumber;
                if (first == name.charAt(i)){
                    points = 10;
                } else {
                    points = 2;
                }
                totalPoins += points;
            }

            if (totalPoins > maxPoints){
                maxPoints = totalPoins;
                winner = name;
            } else if (totalPoins == maxPoints){
                winner = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!",winner,maxPoints);
    }
}
