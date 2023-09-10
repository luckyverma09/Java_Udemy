public record StudentRecord(String id, String name, String dateOfBirth, String classList) {
}

//This amount of code is equal to the code present in Student.java
//This eliminates the need for us to create boilerplate code for POJO again and again. We can simply pass the arguments to the record and all getters, constructor and toString will be automatically be created. Setter methods are not part of the record.