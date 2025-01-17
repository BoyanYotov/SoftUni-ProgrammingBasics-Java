package SampleExams_09.Exam2;

import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double currentAccount = voucher;
        double priceTicket = 0;
        int countTickets = 0;
        int countOthers = 0;

        while (!command.equals("End")){
            if (command.length() > 8){
                priceTicket = command.charAt(0) + command.charAt(1);
                    if (priceTicket > currentAccount){
                        break;
                    } else {
                    countTickets++;
                    }
            } else {
                priceTicket = command.charAt(0);
                if (priceTicket > currentAccount) {
                    break;
                } else {
                    countOthers++;
                }
            }

            currentAccount -= priceTicket;
            command = scanner.nextLine();

        }

        System.out.println(countTickets);
        System.out.println(countOthers);
    }
}
