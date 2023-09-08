public class Main {
    public static void main(String[] args) {
    int highScorePosition1 = calculateHighScorePosition(1500);
    displayHightScorePosition("Lucky", highScorePosition1);

        int highScorePosition2 = calculateHighScorePosition(500);
        displayHightScorePosition("Piyush", highScorePosition2);

        int highScorePosition3 = calculateHighScorePosition(100);
        displayHightScorePosition("Vanshika", highScorePosition3);

        int highScorePosition4 = calculateHighScorePosition(25);
        displayHightScorePosition("Teju", highScorePosition4);
    }
    public static void displayHightScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " maneged to get into position " + playerPosition +" on the high score list.");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000) return 1;
        if(playerScore >= 500 && playerScore < 1000) return 2;
        if(playerScore >=100 && playerScore < 500)  return 3;
        return 4;
    }
}