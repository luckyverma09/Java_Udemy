public class Main {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; count < 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        System.out.println("\nSUM = "+sum);
    }
}