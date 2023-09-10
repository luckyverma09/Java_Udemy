import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String yearOfBirth = "2002";
    int currentYear = 2023;

//    System.out.println(currentYear - Integer.parseInt(yearOfBirth)); //The Integer.parseInt method converts a string to a number. We cannot use numbers in string form to do calculations.
//
//    String ageInFloatingPoint = "21.5";
//    System.out.println(Double.parseDouble(ageInFloatingPoint)); //converts string to double.
    try {
      //The try catch block is used to deal with errors in our code. In the try block we place the code that we think might get an error. The catch block if finds the error we specified runs the code in its block instead.
      System.out.println(getInputFromConsole(currentYear));
    } catch(NullPointerException e) {
      System.out.println(getInputFromScanner(currentYear));
    }
  }

  public static String getInputFromConsole(int currentYear) {
    String name = System.console().readLine("Hi, What's your name? "); //Only works in console and not in IDEs.
    String dateOfBirth = System.console().readLine("What year were you born? ");
    int age = currentYear - Integer.parseInt(dateOfBirth);
    return "Hi " + name + ". You are " + age + " years old.";
  }

  public static String getInputFromScanner(int currentYear) {
    Scanner scanner = new Scanner(System.in);
    //Scanner scanner = new Scanner(new File("pathAndNameOfTheFile")); //If reading input from a file instead of input stream.
    System.out.print("Hi, What's your name? ");
    String name = scanner.nextLine();
    System.out.print("What year were your born? ");
    boolean validDOB = false;
    int age = 0;

    do {
      System.out.println("Enter a year between " + (currentYear - 125) + " and " + currentYear);
      try {
        age = findAge(currentYear, scanner.nextLine());
        validDOB = !(age < 0);
      } catch (NumberFormatException badUserData) {
        System.out.println("Characters are not allowed for age.");
      }
    } while(!validDOB);
    return "Hi " + name + ". You are " + age + " years old.";
  }

  public static int findAge(int currentYear, String yearOfBirth) {
    int yob = Integer.parseInt(yearOfBirth);
    if(yob < currentYear - 125 || yob > currentYear)
      return -1;
    return currentYear - yob;
  }
}