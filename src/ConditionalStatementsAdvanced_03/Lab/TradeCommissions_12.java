package ConditionalStatementsAdvanced_03.Lab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double selling = Double.parseDouble(scanner.nextLine());
        boolean validInput = true;
        double commission = 0;

        if (town.equals("Sofia")){
            if (selling >= 0 && selling <= 500) {
                commission = selling * 0.05;
            } else if (selling > 500 && selling <= 1000) {
                commission = selling * 0.07;
            } else if (selling > 1000 && selling <= 10000) {
                commission = selling * 0.08;
            } else if (selling > 10000){
                commission = selling * 0.12;
            } else {
                validInput = false;
            }
        } else if (town.equals("Varna")){
            if (selling >= 0 && selling <= 500) {
                commission = selling * 0.045;
            } else if (selling > 500 && selling <= 1000) {
                commission = selling * 0.075;
            } else if (selling > 1000 && selling <= 10000) {
                commission = selling * 0.1;
            } else if (selling > 10000){
                commission = selling * 0.13;
            } else {
                validInput = false;
            }
        } else if (town.equals("Plovdiv")){
            if (selling >= 0 && selling <= 500) {
                commission = selling * 0.055;
            } else if (selling > 500 && selling <= 1000) {
                commission = selling * 0.08;
            } else if (selling > 1000 && selling <= 10000) {
                commission = selling * 0.12;
            } else if (selling > 10000) {
                commission = selling * 0.145;
            } else {
                validInput = false;
            }
        } else {
            validInput = false;
        }

        if (validInput){
            System.out.printf("%.2f",commission);
        } else {
            System.out.print("error");
        }

    }
}
