package SampleExams_09.Exam1;

import java.util.Scanner;

public class Gymnastics_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String tool = scanner.nextLine();
        double difficulty = 0;
        double perform = 0;

        if (country.equals("Russia")) {
            if (tool.equals("ribbon")) {
                difficulty = 9.100;
                perform = 9.400;
            } else if (tool.equals("hoop")) {
                difficulty = 9.300;
                perform = 9.800;
            } else if (tool.equals("rope")) {
                difficulty = 9.600;
                perform = 9.000;
            }
        } else if (country.equals("Bulgaria")) {
            if (tool.equals("ribbon")) {
                difficulty = 9.600;
                perform = 9.400;
            } else if (tool.equals("hoop")) {
                difficulty = 9.550;
                perform = 9.750;
            } else if (tool.equals("rope")) {
                difficulty = 9.500;
                perform = 9.400;
            }
        } else if (country.equals("Italy")) {
            if (tool.equals("ribbon")) {
                difficulty = 9.200;
                perform = 9.500;
            } else if (tool.equals("hoop")) {
                difficulty = 9.450;
                perform = 9.350;
            } else if (tool.equals("rope")) {
                difficulty = 9.700;
                perform = 9.150;
            }
        }

        double total = (difficulty + perform);
        double diff = 20.000 - total;
        double diffPercentage = (diff / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, total, tool);
        System.out.printf("%.2f%%", diffPercentage);

    }
}

