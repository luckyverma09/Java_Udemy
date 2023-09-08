public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOVer = true;
        int score = 10000;
        int levelComplerted = 8;
        int bonus = 200;
        int finalScore = score;
        if(gameOVer){
            finalScore += (levelComplerted * bonus);
            System.out.println("Total score : " + finalScore);
        }
    }
}
