public class Main {
  public static void main(String[] args) {
    //A constructor is used to create an instance of a class where we can pass parameters directly to it to set values to the instance fields. This is better than calling setters individually for each and every field.
    //The constructor name is the same as the name of the class and defined similar to a method but without any return type. Access modifier should be carefully selected.

    //implicit means that something is not visible in code but is created in bytecode when executable is generated in 0s and 1s.
    //a constructor is created implicitly.

    //A default constructor has no args. If another constructor is defined by the user then the default constructor is not created.

    //A class may have multiple constructors differentiated by the number of parameters passed.

    BankAccount bankAccount = new BankAccount(); //Empty Constructor
//    bankAccount.setAccountNumber(123456789);
//    bankAccount.setBalance(50000);
//    bankAccount.setCustomerName("Anik Roy");
//    bankAccount.setEmail("anikroy173@gmail.com");
//    bankAccount.setPhoneNumber(7017336624L);
    BankAccount bankAccount2 = new BankAccount(987654321, 500000, "Rich Guy", "rich@mail.com", 9876543210L);
    BankAccount bankAccount3 = new BankAccount("New Guy", "new@guy.com", 9879879871L);

    bankAccount.depositFunds(65000);
    bankAccount2.depositFunds(0);
    bankAccount3.depositFunds(0);
  }
}