package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterEggBattle_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsOne = Integer.parseInt(scanner.nextLine());
        int eggsTwo = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("End")){

            if (command.equals("one")){
                eggsTwo--;
            } if (command.equals("two")){
                eggsOne--;
            }

            if (eggsOne <= 0 || eggsTwo <= 0){
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("End")){
            System.out.printf("Player one has %d eggs left.%n",eggsOne);
            System.out.printf("Player two has %d eggs left.",eggsTwo);
        }

        if (eggsOne == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.",eggsTwo);
        } else if (eggsTwo == 0){
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.",eggsOne);
        }

    }
}
