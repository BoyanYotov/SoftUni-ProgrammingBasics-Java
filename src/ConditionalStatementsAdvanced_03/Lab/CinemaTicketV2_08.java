package ConditionalStatementsAdvanced_03.Lab;

import java.util.Scanner;

public class CinemaTicketV2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.print(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.print(14);
                break;
            case "Saturday":
            case "Sunday":
                System.out.print(16);
        }

    }
}
