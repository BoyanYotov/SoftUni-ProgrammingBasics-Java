package FirstStepsInCoding_01.Exercise;

import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pagesPerBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursPerBook = pagesPerBook / pagesPerHour;
        int hoursPerDays = hoursPerBook / days;

        System.out.println(hoursPerDays);

    }
}
