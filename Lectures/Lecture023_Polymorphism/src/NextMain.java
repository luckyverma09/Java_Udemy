public class NextMain {

  public static void main(String[] args) {
    Movie movie = Movie.getMovie("A", "Jaws");
    movie.watchMovie();

    Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws"); //intellij will throw an error if we don't type cast Movie.getMovie to Adventure as the method may return an object of a different class than adventure. To let compiler know that the object is really going to of class Adventure we pass it as typecast.
    jaws.watchMovie();

    Object comedy = Movie.getMovie("C", "Airplane");
    Comedy comedyMovie = (Comedy) comedy; //Object is like a parent object of all classes. It can be typecasted to Comedy. The method we are going to execute lies in the comedy class and thus typecasting to Movie class will not work.
    comedyMovie.watchComedy();

    var airPlane = Movie.getMovie("c", "Airplane"); //var is a keyword that can determine the compile time data type of the variable. It can be used to avoid compile time errors.
    airPlane.watchMovie();

    var airPlane2 = new Comedy("Airplane"); //this time var cast airplane2 to Comedy.
    airPlane2.watchComedy();

    // var is an example of local variable inference type(LVTI)
    //It can't be used in field declarations in a class.
    //It can't be used in method signatures, either as a parameter type or a return type.
    // It can't be used without an assignment
    //It can't be assigned a null literal.


    //Compile time type is the type of an object that is declared by us or decided by LVTI. In bytecode LVTI determined type is the same as if we had declared the type of the object.
    //Sometimes what is on the right side of the assignment operator can only be evaluated during run time and its type determined then. It is called run time type.

    //We can assign an instance (object) to a variable of the same type, its parent's type or its parent's parent type.

    //Because of polymorphism compile time types are different than runtime types. Eg the single compile time type Movie supports 4 runtime types.

    //Testing the runtime type of an object below.
    Object unknownObject = Movie.getMovie("C", "Airplane");
    if(unknownObject.getClass().getSimpleName().equals("Comedy")) { //We are checking if unknownObject is an instance of class Movie. but this is not the best way to do so.
      Comedy c = (Comedy) unknownObject;
      c.watchComedy();
    } else if(unknownObject instanceof Adventure) { //This is the better way to check if an object belongs to a specified class. instanceof is an operator that returns true if object belongs to a class and false if it does not.
      ((Adventure) unknownObject).watchAdventure();
    } else if(unknownObject instanceof ScienceFiction syfy) { //This is the best way to do the above work. we are creating a binding object of class ScienceFiction. unknownObject's data will be extracted and stored in this variable.
      syfy.watchScienceFiction();
    }

  }
}
