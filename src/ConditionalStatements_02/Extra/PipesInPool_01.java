package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1Debit = Integer.parseInt(scanner.nextLine());
        int pipe2Debit = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double filled = (hours*pipe1Debit) + (hours*pipe2Debit);
        double filledPercentage = filled/volume*100;
        double pipe1Contribution = (pipe1Debit*hours)/filled*100;
        double pipe2Contribution = (pipe2Debit*hours)/filled*100;
        double difference = Math.abs(volume-filled);

        if (filled<=volume){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%",filledPercentage,pipe1Contribution,pipe2Contribution);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hours,difference);
        }

    }
}
