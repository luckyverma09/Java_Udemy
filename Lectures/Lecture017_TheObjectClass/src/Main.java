public class Main extends java.lang.Object { //by default the classed extend the parent class.
  public static void main(String[] args) {
    Student max = new Student("Max", 21);
    // System.out.println(max); //this is same as the code below.
    System.out.println(max.toString()); //prints class name and object id or hashCode if toString method is not overriden

    PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
    System.out.println(jimmy);
  }
}

class Student { //Only one class in a java file can be public. So we will use the default access modifier class here.
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override //it is not compulsory to add this but helps prevent errors as this generates compile time error if the method does not correctly override the previous method with the same signature.
  public String toString() {
    return name + " is " + age;
//    return "Student{" +
//      "name='" + name + '\'' +
//      ", age=" + age +
//      '}';
  }
}

class PrimarySchoolStudent extends Student {
  private String parentName;

  public PrimarySchoolStudent(String name, int age, String parentName) {
    super(name, age);
    this.parentName = parentName;
  }

  @Override
  public String toString() {
    return parentName + "'s kid, " + super.toString();
  }
}