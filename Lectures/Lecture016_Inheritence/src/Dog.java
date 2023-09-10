public class Dog extends Animal { //extends keyword is used to denote that a class is inheriting properties from another class. Dog is the child class of super/parent class Animal
  //If we do not have an empty constructor in the parent class we get an error.

  private String earShape;
  private String tailShape;

  Dog() {
    super("Mutt", "Big", 50); //super keyword is used to call constructor of parent class in child class. it is similar to the this() keyword but this() is used in the same class. Like the this statement it must be declared on the first line. this() and super() cannot be called from the same constructor.
  }

  public Dog(String type, double weight) {
    this(type, weight, "Perky", "Curled");
  }

  public Dog(String type, double weight, String earShape, String tailShape) {
    super(type, weight < 15 ? "small" : weight < 35 ? "medium" : "large", weight);
    this.earShape = earShape;
    this.tailShape = tailShape;
  }

  @Override
  public String toString() {
    return "Dog{" +
      "earShape='" + earShape + '\'' +
      ", tailShape='" + tailShape + '\'' +
      "} " + super.toString(); //super.toString() calls super class's .toString() method.
  }

  //Method overriding is when a child class has a method signature same as that of the parent class but works differently. the override keyword is used to denote that a method is being used to override a parent class method.


  @Override
  public void move(String speed) {
    super.move(speed);
//    System.out.println("Dogs walk, run and wag their tails.");

    if(speed == "slow") {
      walk();
      wagTail();
    } else {
      run();
      bark();
    }
  }

  private void bark() {
    System.out.println("Dog Barking");
  }

  private void run() {
    System.out.println("Dog running");
  }

  private void walk() {
    System.out.println("Dog walking");
  }

  private void wagTail() {
    System.out.println("Tail wagging");
  }
}


