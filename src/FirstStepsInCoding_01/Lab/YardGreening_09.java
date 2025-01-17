package FirstStepsInCoding_01.Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

       double meters = Double.parseDouble(scanner.nextLine());
       double totalPrice = meters * 7.61;
       double discount = totalPrice * 0.18;
       double finalPrice = totalPrice - discount;

       System.out.printf("The final price is: %f lv.%n", finalPrice);
       System.out.printf("The discount is: %f lv.", discount);
    }
}
