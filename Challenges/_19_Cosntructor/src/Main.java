public class Main {
    public static void main(String[] args) {
        Costumer cs1 = new Costumer("Lucky", 1000, "lucky.com");
        System.out.println(cs1.getName());
        System.out.println(cs1.getCreditLimit());
        System.out.println(cs1.getEmailAddress());
        System.out.println();

        Costumer cs2 = new Costumer();
        System.out.println(cs2.getName());
        System.out.println(cs2.getCreditLimit());
        System.out.println(cs2.getEmailAddress());
        System.out.println();

        Costumer cs3 = new Costumer("Anik", "anikroy@123.com");
        System.out.println(cs3.getName());
        System.out.println(cs3.getCreditLimit());
        System.out.println(cs3.getEmailAddress());
    }
}