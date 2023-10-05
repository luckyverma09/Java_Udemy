import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Enter q to quit, A for adventure, C for comedy, S for Science Fiction");
      String type = sc.nextLine();
      if("qQ".contains(type))
        break;
      System.out.print("Enter Movie title : ");
      String title = sc.nextLine();
      Movie newMovie = Movie.getMovie(type, title);
      newMovie.watchMovie();
    }
  }
}