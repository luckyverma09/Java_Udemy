public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1 , double num2){
        int number1 = (int) (num1 * 1000);
        int number2 = (int) (num2 * 1000);
        return number1 == number2;
    }
}
