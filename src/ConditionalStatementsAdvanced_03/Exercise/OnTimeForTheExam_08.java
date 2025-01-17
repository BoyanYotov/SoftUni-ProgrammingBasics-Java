package ConditionalStatementsAdvanced_03.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());
        int examMinutesTotal = (examHour * 60) + examMinutes;
        int arrivalMinutesTotal = (arrivalHour * 60) + arrivalMinutes;

        if ((arrivalMinutesTotal - examMinutesTotal) > 0){
            System.out.println("Late");
            if ((arrivalMinutesTotal - examMinutesTotal) > 0 && (arrivalMinutesTotal - examMinutesTotal) < 60){
                System.out.printf("%.0f minutes after the start",arrivalMinutesTotal - examMinutesTotal*1.0);
            } else if (arrivalMinutesTotal - examMinutesTotal >=60){
                int differenceHour = (arrivalMinutesTotal - examMinutesTotal) / 60;
                int differenceMins = (arrivalMinutesTotal - examMinutesTotal) % 60;
                System.out.printf("%d:%02d hours after the start",differenceHour, differenceMins);
            }
        } else if ((examMinutesTotal - arrivalMinutesTotal) <= 30){
            System.out.println("On time");
            System.out.printf("%d minutes before the start",examMinutesTotal - arrivalMinutesTotal);
        } else if ((examMinutesTotal - arrivalMinutesTotal) > 30){
            System.out.println("Early");
            if ((examMinutesTotal - arrivalMinutesTotal) > 30 && (examMinutesTotal - arrivalMinutesTotal) < 60){
                System.out.printf("%d minutes before the start",examMinutesTotal - arrivalMinutesTotal);
            } else if ((examMinutesTotal - arrivalMinutesTotal) >= 60){
                int differenceHour = (examMinutesTotal - arrivalMinutesTotal) / 60;
                int differenceMins = (examMinutesTotal - arrivalMinutesTotal) % 60;
                System.out.printf("%d:%02d hours before the start",differenceHour, differenceMins);
            }
        }

    }
}
