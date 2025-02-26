package ConditionalStatementsAdvanced_03.Lab;

import java.util.Scanner;

public class WeekendOrWeekday_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.print("Working day");
                break;
            case "Sunday", "Saturday":
                System.out.print("Weekend");
                break;
            default:
                System.out.print("Error");
        }

    }
}
