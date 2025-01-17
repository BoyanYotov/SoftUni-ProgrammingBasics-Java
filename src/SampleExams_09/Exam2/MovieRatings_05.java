package SampleExams_09.Exam2;

import java.util.Scanner;

public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        double maxRating = 0;
        double minRating = 0;
        double totalRating = 0;
        String movie = "";
        double rating = 0;
        String bestMovie = "";
        String worstMovie = "";


        for (int i = 1; i <= quantity; i++) {
            movie = scanner.nextLine();
            rating = Double.parseDouble(scanner.nextLine());

            if (rating > maxRating) {
                maxRating = rating;
                bestMovie = movie;
            }

            if (i == 1) {
                minRating = rating;
                worstMovie = movie;
            } else if (i>1 && rating<minRating){
                minRating = rating;
                worstMovie = movie;
            }

            totalRating += rating;
        }

        System.out.printf("%s is with highest rating: %.1f%n", bestMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", worstMovie, minRating);
        System.out.printf("Average rating: %.1f", totalRating / quantity);
    }
}
