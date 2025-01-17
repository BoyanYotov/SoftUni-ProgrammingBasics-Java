package ForLoop_04.Extra;

public class ClockV1_09 {
    public static void main(String[] args) {

        for (int hours = 0; hours <= 23 ; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {

                System.out.printf("%d : %d%n",hours,minutes);
            }
        }

    }
}
