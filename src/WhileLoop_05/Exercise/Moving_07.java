package WhileLoop_05.Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width * height * length;

        String command = "";

        while (volume > 0) {
            command = scanner.nextLine();

            if (command.equals("Done")) {
                break;
            }

            int takes = Integer.parseInt(command);
            volume -= takes;
        }

        if (command.equals("Done")) {
            System.out.printf("%d Cubic meters left.", volume);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }

    }
}