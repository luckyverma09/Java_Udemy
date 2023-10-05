public class Main {
  public static void main(String[] args) {
    printInformation("Hello World");
    printInformation(""); //string is empty(length is zero)
    printInformation("\n\n\t");//only spaces, tabs, newline characters are present

    String helloWorld = "Hello World";
    System.out.printf("Index of World : %d%n", helloWorld.indexOf("World"));
    System.out.printf("Index of W : %d%n", helloWorld.indexOf('W'));
    System.out.printf("Index of l : %d%n", helloWorld.indexOf('l'));
    System.out.printf("Index of l : %d%n", helloWorld.lastIndexOf('l'));


    System.out.printf("Index of l : %d%n", helloWorld.indexOf('l', 3)); //starts searching from 3rd index. Find second index of l.
    System.out.printf("Index of l : %d%n", helloWorld.lastIndexOf('l', 8)); //starts backward searching from 8th index. Finds second last index of l

    String helloWorldLower = helloWorld.toLowerCase();
    if(helloWorld.equals(helloWorldLower)) {
      System.out.println("Values match exactly");
    } else if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
      System.out.println("Value match ignoring case");
    }

    if(helloWorld.startsWith("Hello"))
      System.out.println("String starts with Hello");
    if(helloWorld.endsWith("World"))
      System.out.println("String ends with World");
    if(helloWorld.contains("llo"))
      System.out.println("String contains llo");

    if(helloWorld.equals(helloWorldLower)) {
      System.out.println("Values match exactly");
    }
    if(helloWorld.contentEquals(helloWorldLower)) { //is used to compare StringBuilder objects as well because .equals do not support StringBuilder objects.
      System.out.println("Values match exactly");
    }

    String birthDate = "29/04/2002";
    int yearIndex = birthDate.indexOf("2002");
    System.out.println("Birth year : " + birthDate.substring(yearIndex));
    int monthIndex = birthDate.indexOf("04");
    System.out.println("Birth month : " + birthDate.substring(monthIndex, monthIndex + 2));

    String newDate = String.join("/", "29", "04", "2002");

    newDate = "25";
    newDate = newDate.concat("/");
    newDate = newDate.concat("11");
    newDate = newDate.concat("/");
    newDate = newDate.concat("1982");

    System.out.println(newDate); //This code is inefficient as a new string is created in each line this way.

    newDate = "25" + "/" + "11" + "/" + "1982";

    System.out.println(newDate);

    newDate = "18".concat("/").concat("03").concat("/").concat("1972");
    System.out.println(newDate);

    System.out.println(newDate.replace('/', '-'));
    System.out.println(newDate.replace("2", "00"));


    System.out.println(newDate.replaceFirst("/", "-")); //cannot work with characters. regex used
    System.out.println(newDate.replaceAll("/", "---")); //use replace instead of replaceAll when need to replace all occurrences.

    System.out.println("ABC\n".repeat(3));
    System.out.println("-".repeat(20));

    System.out.println("ABC\n".repeat(3).indent(8));
    System.out.println("-".repeat(20));

    System.out.println("    ABC\n".repeat(3).indent(-2)); //negative value with .indent can remove extra whitespaces if need be.
    System.out.println("-".repeat(20));
  }

  public static void printInformation(String string) {
    int length =  string.length();
    System.out.printf("Length of the string : %d%n", length);
    if(string.isEmpty()) {
      System.out.println("String is empty.");
      return;
    }
    if(string.isBlank())
      System.out.println("String is blank");

    System.out.printf("First character in the string : %c%n", string.charAt(0));
    System.out.printf("Last character in the string : %c%n", string.charAt(length - 1));
  }
}