public class Main {
    public static void main(String[] args) {
    
    }
    public static void displayHightScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " maneged to get into position " + playerPosition +"on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000) return 1;
        if(playerScore >= 500 && playerScore < 1000) return 2;
        if(playerScore >=100 && playerScore < 500)  return 3;
        return 4;
    }
}