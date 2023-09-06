public class Main {
  public static void main(String[] args) {
    int highScore = 1300;
    int health = 100; //expression without ;
    if ((health < 25) && (highScore > 1000)) { //health < 23 and highScore > 1000 are expressions. (health < 25) && (highScore > 1000) is also an expression.
      highScore = highScore - 1000; //highScore - 100 and highScore = highScore - 1000 are both expressions.

      //Refer to google java-style white-spacing for indentation rules and white-spacing.
    }
  }
}