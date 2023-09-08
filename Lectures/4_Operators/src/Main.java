public class Main {
  public static void main(String[] args) {
    int result = 1 + 2;
    char testChar1 = 'A';
    char testChar2 = 'B';

    System.out.println(testChar1 + testChar2); //This returns a numeric value that is the sum of the decimal values of both characters when we use the + operand with characters they are not concatenated but instead their decimal values are added.
    System.out.println("" + testChar1 + testChar2); //This will convert the whole thing into a string and will return concatenated "AB".

    result = 1;
    result = result + 1; //can also be written as result++ or result += 1.
    result = result - 1; //can also be written as result-- or result -= 1.

    result -= 4.5; //This will not throw an error. This is equivalent to writing result =  (int) (result - 4.5). ie it is automatically typecasting it to an integer
    //result = result - 4.5; //This will throw an error. lossy conversion

    //x -= y => x = (data type of x) (x - y)

    double result2 = 10;
    result2 *= 1.5; //15
    result2 /= 2; //7.5

    //For operator precedence refer google.
    //Also look at all operators.

    //Modulo operator works with floats too. integer division takes place.
  }
}