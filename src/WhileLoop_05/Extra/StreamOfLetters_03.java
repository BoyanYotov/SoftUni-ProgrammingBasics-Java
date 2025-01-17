package WhileLoop_05.Extra;

import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbol = scanner.nextLine();
        int c = 0;
        int n = 0;
        int o = 0;

        String word = "";
        String finished = "";
        String sentence = "";

        while (true){
            if (c >= 1 && o >= 1 && n >= 1) {
                c = 0;
                n = 0;
                o = 0;
                finished = word + " ";
                sentence += finished;
                word = "";
                continue;
            }

            if (symbol.equals("End")){
                break;
            }

            char letter = symbol.charAt(0);

            if ((letter>=97 && letter<=122) || (letter>=65 && letter<=90)) {
                switch (symbol) {
                    case "n":
                        n++;
                        if (n == 1) {
                            symbol = scanner.nextLine();
                            continue;
                        }
                        break;
                    case "o":
                        o++;
                        if (o == 1) {
                            symbol = scanner.nextLine();
                            continue;
                        }
                        break;
                    case "c":
                        c++;
                        if (c == 1) {
                            symbol = scanner.nextLine();
                            continue;
                        }
                        break;
                }
                word += symbol;

            } else {
                symbol = scanner.nextLine();
                continue;
            }

            symbol = scanner.nextLine();

        }

        System.out.printf(sentence);

    }
}
