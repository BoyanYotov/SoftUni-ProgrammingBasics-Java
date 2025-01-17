package SampleExams_09.Exam4;

import java.util.Scanner;

public class FavouriteMovie_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int bestmoviePoints = 0;
        String bestMovie = "";
        int movies = 0;

        while (!movie.equals("STOP")) {
            movies++;
            int totalPoints = 0;
            int length = movie.length();

            for (int i = 0; i < length; i++) {
                char letter = movie.charAt(i);
                int points = letter;

                if (points >= 97 && points <= 122) {
                    points -= length * 2;
                } else if (letter >= 65 && letter <= 90) {
                    points -= length;
                }
                totalPoints += points;
            }

            if (totalPoints > bestmoviePoints) {
                bestmoviePoints = totalPoints;
                bestMovie = movie;
            }

            if (movies >= 7) {
                System.out.printf("The limit is reached.%n");
                break;
            }

            movie = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, bestmoviePoints);
    }
}
