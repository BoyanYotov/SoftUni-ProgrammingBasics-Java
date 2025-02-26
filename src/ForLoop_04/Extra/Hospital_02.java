package ForLoop_04.Extra;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= days; i++) {

            int patients = Integer.parseInt(scanner.nextLine());

            if ((i % 3 == 0) && (untreatedPatients > treatedPatients)) {
                doctors++;
            }

            if (patients <= doctors) {
                treatedPatients += patients;
            } else {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);

    }
}
