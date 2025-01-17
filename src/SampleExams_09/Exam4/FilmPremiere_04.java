package SampleExams_09.Exam4;

import java.util.Scanner;

public class FilmPremiere_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String pack = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        switch (movieName){
            case "John Wick":
                    if (pack.equals("Drink")){
                        ticketPrice = 12;
                    } else if (pack.equals("Popcorn")){
                        ticketPrice = 15;
                    } else if (pack.equals("Menu")){
                        ticketPrice = 19;
                    }
                break;
            case "Star Wars":
                if (pack.equals("Drink")){
                    ticketPrice = 18;
                } else if (pack.equals("Popcorn")){
                    ticketPrice = 25;
                } else if (pack.equals("Menu")){
                    ticketPrice = 30;
                }
                break;
            case "Jumanji":
                if (pack.equals("Drink")){
                    ticketPrice = 9;
                } else if (pack.equals("Popcorn")){
                    ticketPrice = 11;
                } else if (pack.equals("Menu")){
                    ticketPrice = 14;
                }
                break;
        }

        double total = tickets * ticketPrice;

        if (movieName.equalsIgnoreCase("Star Wars") && tickets >= 4) {
            total *= 0.7;
        }
        if (movieName.equalsIgnoreCase("Jumanji") && tickets==2){
            total *= 0.85;
        }

        System.out.printf("Your bill is %.2f leva.",total);

    }
}
