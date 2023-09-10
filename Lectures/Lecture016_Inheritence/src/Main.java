public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog, "fast"); //this code is fine even though we are passing a dog object instead of an Animal object because the dog constructor calls the animal constructor eventually.

    Dog yorkie = new Dog("Yorkie", 15.0);
    doAnimalStuff(yorkie, "fast");

    Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
    doAnimalStuff(retriever, "slow");
  }

  public static void doAnimalStuff(Animal animal, String speed) {
    animal.makeNoise();
    animal.move(speed);
    System.out.println(animal);
    System.out.println("____");
  }
}