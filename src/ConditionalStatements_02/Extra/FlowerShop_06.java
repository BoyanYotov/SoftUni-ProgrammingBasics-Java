package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int magnoliasQty = Integer.parseInt(scanner.nextLine());
        int hyacinthQty = Integer.parseInt(scanner.nextLine());
        int rosesQty = Integer.parseInt(scanner.nextLine());
        int cactusQty = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        double revenueTotal = (magnoliasQty * 3.25 + hyacinthQty * 4 + rosesQty * 3.5 + cactusQty * 8) * 0.95;

        if (revenueTotal >= present) {
            System.out.printf("She is left with %.0f leva.", Math.floor(revenueTotal - present));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(present - revenueTotal));
        }

    }
}
