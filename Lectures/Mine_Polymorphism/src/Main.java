import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("Science Fiction", "star wars");
//        theMovie.watchMovie();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science fiction, or Q to quit ) : ");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                System.out.println("!!!Thank You for Watching!!!");
                break;
            }
            System.out.println("Enter movie title : ");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }

    }
}