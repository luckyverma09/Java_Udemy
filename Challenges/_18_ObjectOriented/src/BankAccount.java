public class BankAccount {
    private int accountNumber =0;
    private double accountBalance = 0;
    private String name = "";
    private String email = "";
    private int phoneNo = 0;

    public void depositMoney (double n){
        System.out.println("Adding "+n+" amount to your account.");
        accountBalance += n;
        System.out.println("After adding, the amount is : "+accountBalance);
    }
    public void withdrawMoney(double n){
        if(accountBalance - n < 0){
            System.out.println("Not enough Balance in your Bank Account.");
        }else{
            System.out.println("You are withdrawing "+n+" amount from your account.");
            accountBalance -= n;
            System.out.printf("Remaining balance : %.2f",accountBalance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
}
