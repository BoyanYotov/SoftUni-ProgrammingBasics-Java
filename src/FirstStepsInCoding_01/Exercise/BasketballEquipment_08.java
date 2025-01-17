package FirstStepsInCoding_01.Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoesPrice = tax * 0.6;
        double equipPrice = shoesPrice * 0.8;
        double ballPrice = equipPrice/4;
        double accessPrice = ballPrice/5;

        System.out.println(shoesPrice+equipPrice+ballPrice+accessPrice+tax);

    }
}
