public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        double a = 20.00;
        double b = 80.00;
        double c = (a + b) * 100.00d;
        double rem = c % 40;
        System.out.println(rem);

        boolean isTrue = (rem == 0.00) ? true : false;

        if (!isTrue) {
            System.out.println("Got a remainder!");
        } else {
            System.out.println("Not got a remainder");
        }


    }
}