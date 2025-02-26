package FirstStepsInCoding_01.Exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetable = Integer.parseInt(scanner.nextLine());

        double chickenSum = chicken * 10.35;
        double fishSum = fish * 12.40;
        double vegetableSum = vegetable * 8.15;
        double dessert = (chickenSum + fishSum + vegetableSum) * 0.2;

        System.out.println(chickenSum + fishSum + vegetableSum + dessert + 2.50);

    }
}
