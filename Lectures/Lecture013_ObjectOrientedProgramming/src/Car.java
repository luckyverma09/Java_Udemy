public class Car {
  private String make = "Tesla"; //non static fields ( can only be accessed by non instance methods)
  private String model = "Model X"; //Assigning values to fields make those values fixed for all instances of this class.
  private String color = "Gray";
  private int doors = 2;
  private boolean convertible = true;

  public String getMake() { //A getter is used to get instance fields (private). They allow for control, access and protect this fields.
    //method cannot be static.
    return make;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public int getDoors() {
    return doors;
  }

  public boolean isConvertible() {
    return convertible;
  }

  public void setMake(String make) { //Setter gives us more control on how values are set for fields
    if(make == null)
      make = "Unknown";
    String lowercaseMake = make.toLowerCase();
    switch(lowercaseMake) {
      case "holden", "porsche", "tesla" -> this.make = make;  //to differenciate between class fields and local variables this keyword can be used. this refers to the field variable.
      default -> {
        this.make = "Unsupported";
      }
    }
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public void setConvertible(boolean convertible) {
    this.convertible = convertible;
  }

  public void describeCar() {
    System.out.println(doors + " door " + color + " " + make + " " + model + " " + (convertible ? "convertible" : ""));
    //null is a special keyword in java that means the variable has a type but does not reference any object. Fields with primitive data types are never null. String is not a primitive data type.

    //Fields with primitive data types are automatically assigned a default value in java. Local variables if not assigned a value will throw an error on their usage.
  }
}


