package SampleExams_09.Exam5;

import java.util.Scanner;

public class Club_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double goal = Double.parseDouble(scanner.nextLine());
        double gained = 0;

        while (true){
            String command = scanner.nextLine();

            if (command.equals("Party!")){
                if (gained >= goal){
                    System.out.print("Target acquired.");
                    break;
                } else {
                    System.out.printf("We need %.2f leva more.%n",goal-gained);
                    break;
                }
            }

            int qty = Integer.parseInt(scanner.nextLine());
            double price = command.length()*qty;
            if (price % 2 != 0){
                price *= 0.75;
            }
            gained += price;
            if (gained >= goal){
                System.out.printf("Target acquired.%n");
                break;
            }
        }

        System.out.printf("Club income - %.2f leva.",gained);
    }
}
