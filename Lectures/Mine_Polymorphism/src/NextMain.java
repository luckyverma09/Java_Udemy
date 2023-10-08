public class NextMain {
    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("S", "TENET");
//        movie.watchMovie();

//        Adventure jaws = (Adventure) Movie.getMovie("a", "Jaws");
//        jaws.watchMovie();

//        Object comedy = Movie.getMovie("Comedy", "3 Idiots");
//        Movie comedyMovie = (Movie) comedy;
//        comedyMovie.watchMovie();

//        var airplane  = Movie.getMovie("s", "C1");
//        airplane.watchMovie();

//        var plane = new Comedy("C2");
//        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Jaws");
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();

        }else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        }else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }
}

























