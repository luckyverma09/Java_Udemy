public class Main {
  public static void main(String[] args) {
    //A POJO is a class that generally only has instance fields. Its used to read and write data from and to database files or streams.
    //A POJO is also called a bean or a javabean(some extra rules). Its also called an entity like database entities. DTO (Database Transfer Object) is also a valid name.

//    for(int i = 1; i <= 5; i++) {
//      Student s = new Student("S92300" + i,
//        switch(i) {
//          case 1 -> "A";
//          case 2 -> "B";
//          case 3 -> "C";
//          case 4 -> "D";
//          case 5 -> "E";
//          default -> "Invalid Value";
//        }, "05/05/2002", "Java MasterClass");
//
//      //When we have the toString method defined in the class. the instances of that class can be printed in this fashion.
//      System.out.println(s);

    for(int i = 1; i <= 5; i++) {
      StudentRecord s = new StudentRecord("S92300" + i,
        switch(i) {
          case 1 -> "A";
          case 2 -> "B";
          case 3 -> "C";
          case 4 -> "D";
          case 5 -> "E";
          default -> "Invalid Value";
        }, "05/05/2002", "Java MasterClass");

      //When we have the toString method defined in the class. the instances of that class can be printed in this fashion.
      System.out.println(s);
    }
    Student pojoStudent = new Student("S923006", "F", "05/05/2002", "Java Masterclass");
    StudentRecord pojoStudentRecord = new StudentRecord("S923007", "G", "05/05/2002", "Java Masterclass");

    pojoStudent.setClassList("New Course");
    //pojoStudentRecord.setClassLIst("New Course"); //Invalid. Records do not have setters as they are made to be immutable. That is data can be read but not written.

    System.out.println(pojoStudent.getId());
    System.out.println(pojoStudentRecord.id()); //to get field values we need to simply do fieldName();

  }
}