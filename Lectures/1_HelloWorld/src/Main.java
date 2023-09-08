public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Lucky"); //Anything in double quotes is called a string literal.
        //If we replace double quotes with single quotes we will get an error as in java single quotes are used for character literals.
        int myFirstNumber = 5; //Declaration and assignment.
        //This is a statement. A statement in java is a complete command to be executed.
        //Anything after the equals to sign is an expression. It evaluates to a single value.

        System.out.println(myFirstNumber  );
        myFirstNumber = 10;
        System.out.println(myFirstNumber);

        myFirstNumber = (10 + 5) + (8 * 2); //Using the arithmetic sum and multiplication operators.
        System.out.println(myFirstNumber);

    }
}