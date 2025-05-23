package ForLoop_04.Exercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= tabs; i++) {
            String site = scanner.nextLine();

            if (site.equals("Facebook")) {
                salary -= 150;
            } else if (site.equals("Instagram")) {
                salary -= 100;
            } else if (site.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <= 0) {
                System.out.print("You have lost your salary.");
                break;
            }
        }

        if (salary > 0) {
            System.out.printf("%d", salary);
        }

    }
}
