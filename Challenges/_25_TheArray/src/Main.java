import java.util.Random;

public class Main {
    public static void main(String[] args) {

        
    }

    public static int[] getRandomArray(int len){
        Random rm = new Random();
        int[] ramArray = new int[len];
        for(int i = 0 ; i<len; i++){
            ramArray[i] = rm.nextInt(1000);
        }
        return ramArray;
    }
}