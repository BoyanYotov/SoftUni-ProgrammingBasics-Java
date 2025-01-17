package SampleExams_09.Exam7;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String begin = scanner.nextLine();
        String end = scanner.nextLine();

        String firstBegin = begin.substring(0, 1);
        String secondBegin = begin.substring(1, 2);
        String thirdBegin = begin.substring(2, 3);
        String fourthBegin = begin.substring(3, 4);

        String firstEnd = end.substring(0, 1);
        String secondEnd = end.substring(1, 2);
        String thirdEnd = end.substring(2, 3);
        String fourthEnd = end.substring(3, 4);

        int firstBeginNumber = Integer.parseInt(firstBegin);
        int secondBeginNumber = Integer.parseInt(secondBegin);
        int thirdBeginNumber = Integer.parseInt(thirdBegin);
        int fourthBeginNumber = Integer.parseInt(fourthBegin);

        int firstEndNumber = Integer.parseInt(firstEnd);
        int secondEndNumber = Integer.parseInt(secondEnd);
        int thirdEndNumber = Integer.parseInt(thirdEnd);
        int fourthEndNumber = Integer.parseInt(fourthEnd);


        for (int i = firstBeginNumber; i <= firstEndNumber; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = secondBeginNumber; j <= secondEndNumber; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int k = thirdBeginNumber; k <= thirdEndNumber; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }
                    for (int l = fourthBeginNumber; l <= fourthEndNumber; l++) {
                        if (l % 2 == 0) {
                            continue;
                        }
                        System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }
        }
    }
}
