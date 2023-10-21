import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    private static int[] readElements(int n){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
