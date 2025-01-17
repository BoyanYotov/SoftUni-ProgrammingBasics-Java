package ConditionalStatementsAdvanced_03.Lab;

import java.util.Scanner;

public class CinemaTicketV1_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")){
            System.out.print("12");
        } else if (day.equals("Wednesday") || day.equals("Thursday")){
            System.out.print("14");
        } else if (day.equals("Saturday") || day.equals("Sunday")){
            System.out.print("16");
        }

    }
}
