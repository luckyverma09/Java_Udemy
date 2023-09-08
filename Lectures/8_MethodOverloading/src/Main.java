public class Main {
  public static void main(String[] args) {
    //A method signature is used to determine which method is being called. It consists of the method name, uniqueness of the parameters (number and types used, order). Parameter names and return type of the method are not part of the signature.
    int newScore = playerScore("Lucky", 500);
    System.out.println("New score is : " + newScore);

    playerScore(6454);
    playerScore();
  }

  public static int playerScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points.");
    return score * 1000;
  }

  public static int playerScore(int score) {
    return playerScore("Anonymous", score); //This can be used to pass default values to parameters in java as they are not natively supported.
    //It is better to keep all calculations in one method and then use that method in other overloaded methods to avoid inconsistency in case changes are made to one method but not  in the other methods.
  }

  public static int playerScore() {
    System.out.println("No player name or score provided");
    return 0;
  }
}