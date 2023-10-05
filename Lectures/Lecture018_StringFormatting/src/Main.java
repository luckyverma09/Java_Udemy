public class Main {
  public static void main(String[] args) {
    String text = "Print a bulleted list:\n" +
      "\t\u2022 First Point\n" +
      "\t\t\u2022 Sub Point";
    System.out.println(text);

    String textBlock = """
    Print a bulleted list:
        \u2022 First Point
              \u2022 Sub Point
              """;

    System.out.println(textBlock);

    int age = 35;
    System.out.printf("Your age is %d.\n", age); //%d is format specifier that acts as a placeholder for variables.

    int yearOfBirth = 2023 - age;
    System.out.printf("Your birth year is %d%n", yearOfBirth); //Both %n and \n are used to print new line characters but %n sets the cursor to the new line in all platforms \n may not always do that, so it's preferable to use %n whenever possible.

    System.out.printf("Your aga is %.2f.", (float) age); //%.xf where x denotes the precision of the floating point number ie how many places to print after the point. If we didn't type cast to float then we would have gotten an error as int is not compatible with float format specifier.

    for(int i = 1; i <= 100000; i*= 10) {
      System.out.printf("Printing : %6d%n", i); //%xd where x denotes the space that will be occupied by the number. Number is right aligned.
    }

    //Below are 2 ways to format strings.

    String formattedString = String.format("This is a formatted string. Your age is %d", age);
    System.out.println(formattedString);

    formattedString = "This is a formatted string. Your age is %d".formatted(age);
    System.out.println(formattedString);
  }
}