public class Main {
  public static void main(String[] args) {
    int myMinIntValue = Integer.MIN_VALUE; //Integer is a wrapper class. MIN_VALUE returns the minimum possible INT value.
    //myMinIntValue is a variable and Integer.MIN_VALUE is an expression
    System.out.println(myMinIntValue);
    int myMaxIntValue = Integer.MAX_VALUE; //MAX_VALUE returns the max possible INT value.
    System.out.println("Maximum possible integer value : " + myMaxIntValue); //This concatenates the string with the numeric value by converting the numeric value as part of the string.
    //java has wrapper class for all of its 8 data types which provides basic information about the data types (primitives)
    //Integer Wraparounds:
    System.out.println(myMaxIntValue + 1); //Overflow
    //This will output the smallest possible integer value. It follows cyclic property.
    System.out.println(myMinIntValue - 1); //Underflow
    System.out.println("Range of the integer data type is between (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
    //This will output the largest possible integer value.
    //int testMaxInt = 2147483648; //In this case we will not get an overflow. This will throw an error. We are not allowed to store a value greater than its upper range limit for the class.
    //Java compiler does not try to evaluate expressions during compile time and hence can't detect errors.
    //We cannot write numbers like 1,000 but 1_000 is allowed
    System.out.println("Range of the byte data type is between (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
    System.out.println("Range of the short data type is between (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
    //Byte takes up 8 bits(1 byte) in memory.
    //Short takes up 16 bits (width) in memory.
    //Integer takes up 32 bits in memory.
    //Long takes up 64 bits in memory.

    //By default, java considers integer values to be of int data type (if within range)
    long myLongValue = 100L; //By putting l we are specifying that 100 is not an integer but a long. Not case sensitive. Even if we don't add L java will automatically type-cast. But if the number is larger than the range of int then we need to specify by putting L at the end.
    System.out.println(Long.SIZE); //Tells the width(in bits) of the long data type.

    System.out.println("Range of the Long data type is between (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
    //While declaring variables in java. We can declare multiple variables in same code line, but we need to make sure that: We are not declaring different data type variables and that we only specify the data type once at the beginning of the line.

    byte minByteValue = Byte.MIN_VALUE;
    //byte myNewByteValue = minByteValue / 2; This will throw an error as RHS cannot be evaluated during compile time. Due to presence of integer (dividing by '2') it assumes value won't fit, but if we typecast 2 as byte the error will go away.
    byte myNewByteValue = Byte.MIN_VALUE / 2; //This will not throw an error as value can be evaluated during compile time and checked if they fit as we are not using a variable but an expression.
    System.out.println(myNewByteValue);
    myNewByteValue = (byte)(minByteValue / 2); //This error can simply be resolved by simply typecasting the expression as a byte. That way we are storing a byte value in a byte variable forcibly.


    System.out.println("Range of the float data type is between (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
    System.out.println("Range of the double data type is between (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

    int myInt = 5;
    float myFloat = 5F; //f or F is used to signify a float value.
    double myDouble = 5D; //d or D is used to signify a double value. By default, java uses double for floating point numbers. Therefore, 5.0 is automatically considered a double value.
    System.out.println(myInt + " " + myFloat + " " + myDouble);
    //float myFloat = 5.25; This will throw an error because 5.25 by default is considered a double value and java will think lossy conversion may occur. So we need to specify F at the end.
    myFloat = 5.25F; //This resolves the error, int can be typecast to float by java automatically but double cannot be.
    myFloat = (float) 5.25; // This is also valid as we are typecasting a double to a float. But the above method is recommended.

    myInt = 5/2; //stores 2. Operation performed on 2 integers results in an integer. The fractional part is lost.
    myFloat = 5f/2f; //stores 2.5
    myDouble = 5d/2d; //stores 2.5

    myFloat = 5f/3f; //stores 1.6666666 upto 7 decimal places
    myDouble = 5d/3d; //stores 1.6666666666666667 upto 16 decimal places. 5.0/3.0 will result in the same as by default java considers floating point numbers to be double.

    System.out.println(myDouble);
    //It is recommended to use doubles in java unless there is a very good reason to use float as many libraries work with doubles only. Double operations are processed faster at chip level.

    //It is not recommended to use either float or double when very precise calculations are required because they are not accurate (reasoning being the way they are stored in memory, not java issue). Instead, BigDecimal class can be used.

    char myChar = 'D'; //The char data type allows you to only store 1 character. It is mandatory to use single quotes to enclose the character. To store multiple characters use String data type.
    //Char data type occupies 2 bytes of data in memory(16 bits) because it requires that amount of bits to store all unicode characters.
    char unicodeChar = '\u0044'; //This is also used to store the character 'D' in the char variable. For characters that are not in the keyboard we can use the unicode table to find its corresponding unicode and store it using \u__unicode__.
    char decimalChar = 68; //This also stores 'D' inside the variable as 68 is the decimal representation of the character literal 'D'. All 3 of the above are valid ways to store characters in char variables.

    boolean myTrueValue = true;
    boolean myFalseValue = false;

    boolean isAdult = true; //General naming convention for boolean (in the form of a question).
  }
}