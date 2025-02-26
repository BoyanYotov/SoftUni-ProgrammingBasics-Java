package ConditionalStatementsAdvanced_03.Lab;

import java.util.Scanner;

public class FruitOrVegetable_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitOrVegetable = scanner.nextLine();

        switch (fruitOrVegetable) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.print("fruit");
                break;
            case "tomato", "cucumber", "pepper", "carrot":
                System.out.print("vegetable");
                break;
            default:
                System.out.print("unknown");
        }

    }
}
