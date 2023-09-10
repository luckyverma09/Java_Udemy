public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int maxDivisor = 0;
        for (int i = 1; i <= Math.min(first, second); i++) {
            if(first % i == 0 && second % i == 0){
                maxDivisor = Math.max(maxDivisor,i);
            }
        }
        return maxDivisor;
    }
}
