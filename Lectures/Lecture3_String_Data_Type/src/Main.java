public class Main {
  public static void main(String[] args) {
    //The String data type is a special class in Java. It can store multiple characters inside double quotes (""). It can store characters equal to the MAX_VALUE of an int variable.
    String myString = "This is a string.";//This is standard way of declaring and initialising a string variable.
    myString = myString + ", this is more.";//The + operator can be used to concatenate 2 strings.
    String newString = "\u0024 is the dollar sign"; //We can use unicode characters inside strings as well.
    System.out.println(newString);

    int myInt = 50;
    String myString2 = "10";
    System.out.println(myString2 + myInt); //This will concatenate the integer and the string. Whenever an operation is performed with a string and an int it results in a string.

    //String is immutable. ie once a string is created you cannot change it. When we are appending a string to an existing string a new string is created.
    //The StringBuilder class is mutable, that is strings can be changed but it does not support special features of String like the concatenation operator.

    //It is inefficient to use the String class and append them using + operator because a new string is created everytime we do so. So it is good practice if we instead use StringBuilder.
    //The String is a special data type that is used as a 9th primitive type but it is not a primitive data type but a class.
  }
}