package ConditionalStatementsAdvanced_03.Lab;

import java.util.Scanner;

public class AnimalType_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch(animal){
            case "dog":
                System.out.print("mammal");
                break;
            case "snake","tortoise","crocodile":
                System.out.print("reptile");
                break;
            default: System.out.print("unknown");
                break;
        }

    }
}
