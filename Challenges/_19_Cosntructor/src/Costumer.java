public class Costumer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Costumer(){
        this("Nobody", "nobody@nowhere.com");
    }
    public Costumer(String name, String emailAddress) {
       this(name, 1000, emailAddress);
    }

    public Costumer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
