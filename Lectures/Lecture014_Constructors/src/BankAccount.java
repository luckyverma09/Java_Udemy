public class BankAccount {
  private long accountNumber;
  private int balance;
  private String customerName;
  private String email;
  private long phoneNumber;

  public BankAccount() {
    this(111222333, 10000, "Default Name", "default@mail.com", 9999999999L); //this() must be the first statement in the constructor body.
    System.out.println("Empty Constructor called.");
  }

  public BankAccount(long accountNumber, int balance, String customerName, String email, long phoneNumber) {
    System.out.println("Account constructor with parameters called");
    setPhoneNumber(phoneNumber); //In cases of inheritance setter methods may not always work as intended so its best practice to assign values to fields directly in the constructors instead of using setters.
    setEmail(email);
    setBalance(balance);
    setAccountNumber(accountNumber);
    setCustomerName(customerName);
  }

  //Constructor chaining is when one overloaded constructor is called from another constructor. This process is can be done only after the this() statement.


  public BankAccount(String customerName, String email, long phoneNumber) {
    this(989989989, 10000, customerName, email, phoneNumber);
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void depositFunds(int amount) {
    this.balance += amount;
    System.out.println("Balance left in account " + this.balance);
  }

  public void withdrawFunds(int amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      System.out.println("Balance left in account " + this.balance);
    } else {
      System.out.println("Not enough balance in account");
      System.out.println("Balance left in account " + this.balance);
    }
  }
}
