public class Main {
  public static void main(String[] args) {
    boolean isAlien = false;
    if (isAlien != true) {
      System.out.println("It is not an alien");//The entire code block gets executed if the expression evaluates to true inside the if condition otherwise no statement gets executed.
      System.out.println("Am scared of aliens");
    }

    int highScore = 100;
    int secondHighScore = 60;
    int score = 80;
    if (score < highScore && score > secondHighScore) { //Logical AND operator
      System.out.println("Score is greater than second high score and less than high score.");
    }

    if (score < highScore || score > secondHighScore) { //Logical OR operator
      System.out.println("Either or both conditions are true.");
    }
    //! Logical complement (NOT) operator
    //&& Logical AND operator
    //|| Logical OR operator

    boolean ternaryTest = highScore == 100 ? false : true; //if the condition before ? is true then the value left to : is returned otherwise value right to : is returned. This is called the ternary operator because 3 operands are involved: the condition before ? and the 2 possible return values before and after :.

    /*
    if(boolean expression) {
      if expression is true this is executed.
    } else if(boolean expression 2) {
      if expression is false and expression 2 is true, this statement is executed.
    } else {
      if all expressions in if and else ifs are false
    }
     */
    //As soon as java finds a true expression in one of the if or if else blocks it will stop evaluating the consecutive else if blocks and else block. Thus make sure to set the expressions in such a way that no conflicts occur.
  }
}