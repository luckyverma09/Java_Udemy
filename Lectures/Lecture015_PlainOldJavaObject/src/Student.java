public class Student {
  private String id;
  private String name;
  private String dateOfBirth;
  private String classList;

  public Student(String id, String name, String dateOfBirth, String classList) {
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.classList = classList;
  }

  @Override //Annotation
  //Annotations are metadata. Used to mention information about our code. More structured than comments and can be used be compiler and other pre-processing functions.
  //@Override tells java that the function is an overriden method.
  public String toString() {
    return "Student{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", dateOfBirth='" + dateOfBirth + '\'' +
      ", classList='" + classList + '\'' +
      '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getClassList() {
    return classList;
  }

  public void setClassList(String classList) {
    this.classList = classList;
  }
}
