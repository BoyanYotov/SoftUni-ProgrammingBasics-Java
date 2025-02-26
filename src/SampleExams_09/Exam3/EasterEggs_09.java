package SampleExams_09.Exam3;

import java.util.Scanner;

public class EasterEggs_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;

        for (int i = 1; i <= eggs; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                red++;
            } else if (color.equals("orange")) {
                orange++;
            } else if (color.equals("blue")) {
                blue++;
            } else if (color.equals("green")) {
                green++;
            }
        }

        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);

        if (red > orange && red > blue && red > green) {
            System.out.printf("Max eggs: %d -> red", red);
        } else if (orange > red && orange > blue && orange > green) {
            System.out.printf("Max eggs: %d -> orange", orange);
        } else if (blue > red && blue > orange && blue > green) {
            System.out.printf("Max eggs: %d -> blue", blue);
        } else if (green > red && green > orange && green > blue) {
            System.out.printf("Max eggs: %d -> green", green);
        }
    }
}
