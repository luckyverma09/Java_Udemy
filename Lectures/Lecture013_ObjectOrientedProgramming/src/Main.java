public class Main {
  public static void main(String[] args) {
    //All real world objects have state and behavior.
    //State are like properties of the object, like number of legs for an ant, its age, etc.
    //Behaviors are like what the object is doing, like sleeping, drinking, etc.

    //Fields store the states of the object. (attributes/fields)
    //Objects expose their behavior through methods.

    //A static method cannot depend on any particular instance's fields. Therefore instance members cannot be referenced.
    //Non static fields can only be accessed by non static methods.

    //Uninitialised variables throw compile time errors. Variables pointing to null throw runtime errors.

    //objects and instances are interchangeable words.
    //classes are blueprints for objects.
    //address of an object in memory is called reference. Classes do not have references. Only objects have them.
    //if an object is created in memory but no variables are pointing to it or it is not being used in the code. then java's garbage collector will remove it.
    //Static variables in a class have the same value for all instances of that class. If one object makes changes to that variable all other objects suffer the same change. It is best practice to use static variables using class name instead of object name. Eg Car().var; instead of car.var;


    //Static methods are declared with the static keyword. They cannot access instance variables and methods directly. They are used when instance state is not required. Static methods do not require instances to be created to work. They can be used by ClassName.instanceMethod():
    Car car = new Car();

//    car.make = "Porsche"; //Private fields cannot be accessed like this.
    car.setMake("Maserati"); //if we didn't set the field to private and accessed field directly user could have selected an unsupported data type.
    System.out.println(car.getMake());
//    car.model = "Carrera";
    car.setModel("Carrera");
    System.out.println(car.getModel());
//    car.color = "Red";
    car.setColor("Red");
    System.out.println(car.getColor());
//    System.out.println("Make " + car.make); //cannot do that either
    car.describeCar();

    Car targa = new Car(); //instantiating the object
    targa.setMake("Porsche");
    targa.setModel("Targa");
    targa.setColor("red");
    targa.setDoors(2);
    targa.setConvertible(false);

    targa.describeCar();
  }
}