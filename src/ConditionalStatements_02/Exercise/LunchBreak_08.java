package ConditionalStatements_02.Exercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double episode = Integer.parseInt(scanner.nextLine());
        double breakTime = Integer.parseInt(scanner.nextLine());

        double timeLeft = breakTime - (breakTime * 1 / 8) - (breakTime * 1 / 4);

        if (timeLeft >= episode) {
            System.out.printf("You have enough time to watch %s " +
                    "and left with %.0f minutes free time.", name, Math.ceil(timeLeft - episode));
        } else {
            System.out.printf("You don't have enough time to watch " +
                    "%s, you need %.0f more minutes.", name, Math.ceil(episode - timeLeft));
        }

    }
}
