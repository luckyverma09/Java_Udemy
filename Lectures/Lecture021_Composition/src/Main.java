public class Main {
  public static void main(String[] args) {
    ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

    PersonalComputer thePersonalComputer = new PersonalComputer("2208", "Dell", theCase, theMotherboard, theMonitor);

//    thePersonalComputer.getMonitor().drawPixelAt(10, 19, "red");  //We don't want these methods to be accessible to everyone.
//    thePersonalComputer.getMotherboard().loadProgram(("Windows OS"));
//    thePersonalComputer.getComputerCase().pressPowerButton();

    thePersonalComputer.powerUp();
  }
}