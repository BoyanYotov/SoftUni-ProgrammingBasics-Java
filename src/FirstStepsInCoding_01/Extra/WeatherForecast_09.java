package FirstStepsInCoding_01.Extra;

import java.util.Scanner;

public class WeatherForecast_09 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        if (weather.equals("sunny")){
            System.out.print("It's warm outside!");
        } else {
            System.out.print("It's cold outside!");
        }

    }
}
