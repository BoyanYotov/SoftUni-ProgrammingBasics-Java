package WhileLoop_05.Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        int count = 0;

        String currentBook = scanner.nextLine();

        while (!currentBook.equals(favouriteBook)) {

            if (currentBook.equals("No More Books")) {
                break;
            }

            count++;

            currentBook = scanner.nextLine();
        }

        if (currentBook.equals("No More Books")) {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", count);
        } else {
            System.out.printf("You checked %d books and found it.", count);
        }

    }
}