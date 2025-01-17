package ConditionalStatements_02.Extra;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        double revenueTotal = (magnolias*3.25+ hyacinth *4+roses*3.5+cactus*8)*0.95;

        if (revenueTotal >= present){
            System.out.printf("She is left with %.0f leva.",Math.floor(revenueTotal-present));
        } else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(present- revenueTotal));
        }

    }
}
