public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 0)
            return -1;
        int largestPrime = -1;

        for (int i = 2; i <= number; i++) {
            int flag = 0;
            if (number % i == 0) {
                for (int j = 2; j <= Math.sqrt(i); j++)
                {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    largestPrime = i;
            }
        }
        return largestPrime;
    }
}