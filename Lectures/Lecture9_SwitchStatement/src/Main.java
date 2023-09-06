public class Main {
  public static void main(String[] args) {
    int value = 4;
    switch (value) {
      //Can only be used with byte, short, int, char, String, enum
      case 1:
        System.out.println("The value is 1");
        break; //The break statement is important otherwise fall through occurs ie all cases after the case that is passed are executed. break prevents that
      case 2:
        System.out.println("The value is 2");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println(("The value is " + value));
        break;
      default:
        System.out.println("The value is neither 1, 2, 3, 4 nor 5");
        break;
    }

    //This is the enhanced switch. Fall through doesn't occur. : replaced with -> and for cases with the same statement : replaced with ,
    switch (value) {
      //Can only be used with byte, short, int, char, String, enum
      case 1 -> System.out.println("The value is 1");
      case 2 -> System.out.println("The value is 2");
      case 3, 4, 5 -> {
        System.out.println("This affects all of the 3 cases.");
        System.out.println(("The value is " + value));
      }
      default -> System.out.println("The value is neither 1, 2, 3, 4 nor 5");

    }

    System.out.println(getQuarter("APRIL"));
  }

  public static String getQuarter(String month) {
    switch (month) {
      case "JANUARY":
      case "FEBRUARY":
      case "MARCH":
        return "1st";
      case "APRIL":
      case "MAY":
      case "JUNE":
        return "2nd";
      case "JULY":
      case "AUGUST":
      case "SEPTEMBER":
        return "3rd";
      case "OCTOBER":
      case "NOVEMBER":
      case "DECEMBER":
        return "4th";
      default:
        return "Invalid Month";
    }
  }

  public static String getQuarterEnhanced(String month) {
    return switch (month) {
      case "JANUARY", "FEBRUARY", "MARCH" -> "1st"; //here the string after -> acts as the return value too.
      case "APRIL", "MAY", "JUNE" -> "2nd";
      case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
      case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
      default -> {
        String badMonth = month;
        yield badMonth + " is not a valid month."; //return keyword cannot be used inside enhanced switch. Yield keyword is used instead.
        //case value -> returnValue translates to case value -> {yield returnValue;}
      } //enhanced switch requires the use of default label otherwise error is generated.
    };
  }
}