package FirstStepsInCoding_01.Lab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        double dogResult = dog * 2.50;
        double catResult = cat * 4.00;
        double sum = dogResult + catResult;

        System.out.printf("%f lv.", sum);
    }
}
