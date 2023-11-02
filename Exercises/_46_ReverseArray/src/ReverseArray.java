import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));

        int length = arr.length;
        int i = 0;

        while (i < length / 2) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
            i++;
        }

        System.out.println("Reversed array = " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        reverse(originalArray);
    }
}
