package ConditionalStatements_02.Lab;

import java.util.Scanner;

public class AreaOfFigures_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double area = 0;

        if (figureType.equals("square")) {
            double x = Double.parseDouble(scanner.nextLine());
            area = x * x;
        } else if (figureType.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (figureType.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = r * r * Math.PI;
        } else if (figureType.equals("triangle")) {
            double c = Double.parseDouble(scanner.nextLine());
            double ch = Double.parseDouble(scanner.nextLine());
            area = c * ch / 2;
        }

        System.out.printf("%.3f", area);

    }
}
