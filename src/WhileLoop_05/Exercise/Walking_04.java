package WhileLoop_05.Exercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = "";
        int totalSteps = 0;

        while (totalSteps < 10000) {
            command = scanner.nextLine();

            if (command.equals("Going home")) {
                int lastSteps = Integer.parseInt(scanner.nextLine());
                totalSteps += lastSteps;
                break;
            }

            int steps = Integer.parseInt(command);
            totalSteps += steps;
        }

        if (totalSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        }

    }
}

