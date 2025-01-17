package ConditionalStatementsAdvanced_03.Lab;

import java.util.Scanner;

public class SmallShopV1_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (city.equals("Sofia")){
            if (product.equals("coffee")){
            price = quantity * 0.50;
            } else if (product.equals("water")){
            price = quantity * 0.8;
            } else if (product.equals("beer")){
            price = quantity * 1.2;
            } else if (product.equals("peanuts")){
            price = quantity * 1.6;
            } else if (product.equals("sweets")){
                price = quantity * 1.45;
            }
        } else if (city.equals("Plovdiv")){
            if (product.equals("coffee")){
                price = quantity * 0.40;
            } else if (product.equals("water")){
                price = quantity * 0.70;
            } else if (product.equals("beer")){
                price = quantity * 1.15;
            } else if (product.equals("peanuts")){
                price = quantity * 1.50;
            } else if (product.equals("sweets")){
                price = quantity * 1.30;
            }
        } else if (city.equals("Varna")){
            if (product.equals("coffee")){
                price = quantity * 0.45;
            } else if (product.equals("water")){
                price = quantity * 0.70;
            } else if (product.equals("beer")){
                price = quantity * 1.10;
            } else if (product.equals("peanuts")){
                price = quantity * 1.55;
            } else if (product.equals("sweets")){
                price = quantity * 1.35;
            }
        }

        System.out.print(price);

    }
}
