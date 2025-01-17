package NestedLoops_06.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int sumPrime = 0;
        int sumNotPrime = 0;

        while (!command.equals("stop")){
            boolean isPrime = true;
            int number = Integer.parseInt(command);
            if (number<0){
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i <= number-1 ; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime){
                    sumPrime+=number;
                } else  {
                    sumNotPrime+=number;
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n",sumNotPrime);
    }
}