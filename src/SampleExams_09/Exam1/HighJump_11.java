package SampleExams_09.Exam1;

import java.util.Scanner;

public class HighJump_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        int initial = goal - 30;
        int jumpsCount = 0;
        int failsCount = 0;

        while (true) {
            jumpsCount++;
            int jumpHeight = Integer.parseInt(scanner.nextLine());

            if (jumpHeight > initial) {
                initial += 5;
                failsCount = 0;
            } else {
                failsCount++;
            }

            if (initial > goal) {
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", goal, jumpsCount);
                return;
            }

            if (failsCount >= 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", initial, jumpsCount);
                return;
            }
        }
    }
}