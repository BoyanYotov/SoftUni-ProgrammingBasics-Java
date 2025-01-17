package FirstStepsInCoding_01.Lab;

import java.util.Scanner;

public class ProjectCreation_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int result = projects * 3;

        System.out.println("The architect " + name + " will need " + result + " hours to complete " + projects + " project/s.");

    }
}
