import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers : ");

        int sum = 0;
        int count = 1;

        while (count <= 5) {
            System.out.print("Enter number #"+count+" : ");
            String n = sc.nextLine();
            try{
            int num = Integer.parseInt(n);
                sum += num;
                count++;

            }catch (NumberFormatException e){
                System.out.println("Characters are not allowed !");
            }

        }
        System.out.println("Total sum : " + sum);
    }
}