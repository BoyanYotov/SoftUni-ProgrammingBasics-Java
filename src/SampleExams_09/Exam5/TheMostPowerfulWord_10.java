package SampleExams_09.Exam5;

import java.util.Scanner;

public class TheMostPowerfulWord_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int totalWord = 0;
        double grandTotal = 0;
        double biggest = 0;
        String powerful = "";

        while (!word.equals("End of words")) {
            totalWord = 0;
            int length = word.length();

            for (int i = 0; i < length; i++) {
                char letter = word.charAt(i);
                totalWord += letter;
            }
            switch (word.charAt(0)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                case 'y':
                case 'Y':
                    grandTotal = totalWord * word.length();
                    break;
                default:
                    grandTotal = Math.floor(totalWord / word.length());
            }

            if (grandTotal > biggest) {
                biggest = grandTotal;
                powerful = word;
            }

            word = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f", powerful, biggest);
    }
}
