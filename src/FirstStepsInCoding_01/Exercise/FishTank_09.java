package FirstStepsInCoding_01.Exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int area = length * width * height;
        double litres = area * 0.001;
        double volume = litres * (1 - (percent / 100));

        System.out.println(volume);


    }
}
