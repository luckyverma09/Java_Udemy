import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        int count = 0; // Initialize count to 0
        int sum = 0;

        Scanner sc = new Scanner(System.in); // Create the Scanner object outside the loop

        while (true) {
            String n = sc.nextLine();

            try {
                int num = Integer.parseInt(n);
                sum += num;
                count++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        sc.close(); // Close the Scanner

        if (count > 0) { // Check if any numbers were entered
            System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count)); // Calculate average as a double
        } else {
            System.out.println("SUM = 0 AVG = 0");
        }
    }
}
