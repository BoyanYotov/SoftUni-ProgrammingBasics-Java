package ConditionalStatementsAdvanced_03.Lab;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender.equals("m")) {
            if (age < 16) {
                System.out.print("Master");
            } else if (age >= 16) {
                System.out.print("Mr.");
            }
        } else if (gender.equals("f")) {
            if (age < 16) {
                System.out.print("Miss");
            } else if (age >= 16) {
                System.out.print("Ms.");
            }
        }

    }
}
