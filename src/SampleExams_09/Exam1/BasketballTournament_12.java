package SampleExams_09.Exam1;

import java.util.Scanner;

public class BasketballTournament_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int winGoals = 0;
        int loseGoals = 0;
        int gamesWin = 0;
        int gamesLost = 0;
        int gamesTotal = 0;
        int numberGame = 0;
        String tournamentName = scanner.nextLine();

        while (!tournamentName.equals("End of tournaments")){
            numberGame = 1;
            int numberGames = Integer.parseInt(scanner.nextLine());
            gamesTotal+=numberGames;

            for (int i = 1; i <= numberGames ; i++) {
                winGoals = Integer.parseInt(scanner.nextLine());
                loseGoals = Integer.parseInt(scanner.nextLine());

                if (winGoals > loseGoals) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",numberGame,tournamentName,winGoals - loseGoals);
                    gamesWin++;
                    numberGame++;
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",numberGame,tournamentName,loseGoals - winGoals);
                    gamesLost++;
                    numberGame++;
                }
            }

            tournamentName = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win%n",gamesWin * 1.0 / gamesTotal * 100);
        System.out.printf("%.2f%% matches lost",gamesLost * 1.0 / gamesTotal * 100);

    }
}
