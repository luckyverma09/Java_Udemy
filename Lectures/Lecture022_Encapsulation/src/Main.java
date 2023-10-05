public class Main {
  public static void main(String[] args) {
    //If we make changes to fields in another class we need to make the change everywhere. So encapsulation also ensures that we only use fields in certain areas and as such we only need to make changes to those areas.
//    Player player = new Player();
//    player.name = "Anik";
//    player.health = 20;
//    player.weapon = "Sword";
//
//    player.loseHealth(10);
//    System.out.println("Remaining health = " + player.healthRemaining());
//    player.health = 200; //this is not supposed to happen and it breaks our code hence it is necessary that we hide fields.
//    player.loseHealth(11);
//    System.out.println("Remaining health = " + player.healthRemaining());

    EnhancedPlayer anik = new EnhancedPlayer("Anik");
    System.out.println("Initial health is : " + anik.healthRemaining()); //We are in more control. Only methods designed to make changes to the fields can do so. Therefore, unchecked changes cannot occur.
  }
}