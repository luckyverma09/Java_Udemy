public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigit(1000));
    }

    public static int sumDigit(int number) {
        if (number < 0) return -1;
        if (number <= 9) return number;
        int sum = 0;

        while (number != 0) {
            int rem = number % 10;
            sum += rem;
            number /= 10;
        }
        return sum;
    }
}