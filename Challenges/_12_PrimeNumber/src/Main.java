public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 500; count < 3 && i < 1000; i++) {

            if (isPrime(i)) {

                System.out.print(i + " ");
                count++;
                System.out.println(count);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 2) return num == 2;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}