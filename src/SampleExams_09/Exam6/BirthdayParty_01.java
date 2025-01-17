package SampleExams_09.Exam6;

import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double animator = rent / 3;

        double total = cake + rent + drinks + animator;

        System.out.println(total);
    }
}