import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Minimum element is : " + findMin(readIntegers()));
    }

    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the list of numbers separated by commas: ");
        String str = sc.nextLine();
        String[] numString = str.split(",");

        int[] num = new int[numString.length];

        for (int i = 0; i < numString.length; i++) {
            num[i] = Integer.parseInt(numString[i]);
        }
        return num;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}