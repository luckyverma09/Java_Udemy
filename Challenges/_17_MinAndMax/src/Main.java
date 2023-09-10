import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        while(true){
            System.out.println("Enter a number, or any character to exit : ");
            String nextInput = sc.nextLine();
            try {
                double n = Double.parseDouble(nextInput);
                max = Math.max(max, n);
                min = Math.min(min, n);
            }catch (NumberFormatException nfe){
                break;
            }

        }
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }
}