import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(sortInt(unsortedArray )));

    }

    private static int[] sortInt(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr,arr.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = flag;
            for(int i =0 ; i< sortedArray.length;i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static  int[] getRandomArray(int len){
        Random random = new Random();
        int[] ramArray = new int[len];
        for(int i = 0;i <len; i++){
            ramArray[i] = random.nextInt(1000);       //1000 is upper bound
        }
        return ramArray;
    }
}