public class Main {
    public static void main(String[] args) {
        Employee lucky = new Employee("Lucky verma", "09/11/2003","01/01/2020");
        System.out.println(lucky);
        System.out.println("Age = " + lucky.getAge());
        System.out.println("Pay = " + lucky.collectPay());

        SalariedEmployee anik = new SalariedEmployee("Anik Roy","29/04/2002","01/01/2021", 50000.0);
        System.out.println(anik);
        System.out.println("Anik's Pay = $" + anik.collectPay());
        anik.retire();
        System.out.println( "Anik's Pension check = $" + anik.collectPay());

        HourlyEmployee Piyush = new HourlyEmployee("Piyush","30/12/2003","01/01/2021",15);
        System.out.println(Piyush);
        System.out.println("Piyush's Paycheck = $" + Piyush.collectPay());
        System.out.println("Piyush's Holiday Pay = $" + Piyush.getDoublePay());

    }
}