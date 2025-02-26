package SampleExams_09.Exam6;

import java.util.Scanner;

public class TournamentOfChristmas_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysTournament = Integer.parseInt(scanner.nextLine());
        int price = 0;
        double totalWin = 0;
        int winsCount = 0;
        int loseCount = 0;
        double grandTotal = 0;
        int grandWins = 0;
        int grandLose = 0;

        for (int i = 1; i <= daysTournament; i++) {

            totalWin = 0;
            winsCount = 0;
            loseCount = 0;

            while (true) {
                String sport = scanner.nextLine();
                if (sport.equals("Finish")) {
                    break;
                }
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    price = 20;
                    winsCount++;
                } else if (result.equals("lose")) {
                    price = 0;
                    loseCount++;
                }

                totalWin += price;
            }
            if (winsCount > loseCount) {
                totalWin *= 1.1;
            }

            grandWins += winsCount;
            grandLose += loseCount;
            grandTotal += totalWin;
        }

        if (grandWins > grandLose) {
            grandTotal *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", grandTotal);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", grandTotal);
        }
    }
}