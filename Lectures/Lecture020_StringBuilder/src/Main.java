public class Main {
  public static void main(String[] args) {
    //StringBuilder object can be made by passing a string, pass no arguments, pass integer, pass another StringBuilder
    String helloWorld = "Hello " + "World";
    helloWorld.concat(" and Goodbye"); //string is immutable and therefore changes are not made to the old string instead a new string is returned whenever concatenation is performed. Reference to the new create string is returned by the concatenation operation.
    StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World"); //we need to use a constructor to create a string builder object unlike the String class which is a special class. reference to the mutated string is returned which is same as the old reference.
    helloWorldBuilder.append(" and Goodbye"); //in StringBuilder strings are mutable and hence, a new object is not created, the old string is updated. that is the address of the object is the same as the previous one.
    printInformation(helloWorld);
    printInformation(helloWorldBuilder);

    StringBuilder newStr = new StringBuilder();
    StringBuilder newStr32 = new StringBuilder(32); //adding a numeric variable increases the starting capacity of a StringBuilder object. By default a StringBuilder object starts with 16 capacity. But it can grow as needed.
    //StringBuilder object needs to request for more area if the capacity if filled and the contents from the older memory space is copied over to the new area. This is inefficient.

    printInformation(newStr);
    printInformation(newStr32);

    newStr.append("a".repeat(17));
    newStr32.append("a".repeat(17));

    printInformation(newStr); //jvm automatically determines the new size for the stringBuilder.
    printInformation(newStr32);

    StringBuilder newBuilder = new StringBuilder("Hello " + "World");
    newBuilder.append(" and Goodbye!");
    newBuilder.deleteCharAt(16).insert(16, 'g');

    System.out.println(newBuilder); //G deleted and g added

    newBuilder.replace(16, 17, "G");
    System.out.println(newBuilder);

    newBuilder.reverse().setLength(8); //set length truncates to the specified number of characters
    System.out.println(newBuilder);
  }

  public static void printInformation(String string) {
    System.out.println("String = " + string);
    System.out.println("length = " + string.length());
  }

  public static void printInformation(StringBuilder stringBuilder) {
    System.out.println("StringBuilder = " + stringBuilder);
    System.out.println("length = " + stringBuilder.length());
    System.out.println("capacity = " + stringBuilder.capacity());
  }
}