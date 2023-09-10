public class Main {
    public static void main(String[] args) {
        int start = 5;
        int count = 0;
        while(start <= 20){
            if(isEvenNumber(start)) {
                System.out.print(start + " ");
                count++;
            }
            start++;

        }
        System.out.println("\nTotal even number : " + count);
    }

    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0);
    }

}