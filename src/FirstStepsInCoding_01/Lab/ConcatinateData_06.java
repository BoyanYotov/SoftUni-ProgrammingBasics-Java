package FirstStepsInCoding_01.Lab;

import java.util.Scanner;

public class ConcatinateData_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-year old person from %s.", firstName, lastName, age, town);
    }
}
