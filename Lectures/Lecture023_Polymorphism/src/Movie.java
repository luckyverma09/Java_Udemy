public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName(); //getClass returns the information about the class in which the method is being executed. simpleName() returns the name of the said class.
        System.out.println(title + " is a " + instanceType + " film");   //this.getClass().getSimpleName() is the runtime type of the object.
    }

    public static Movie getMovie(String type, String title) {
        //methods that return instance objects are called instance objects.
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Scary Music", "Jumpscare", "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an adventure film.");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Something funny happens", "Something Even Funnier happens", "LOL");
    }


    public void watchComedy() {
        System.out.println("Watching an comedy film.");
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Bad Aliens do Bad Stuff", "Space Guys Chase Aliens", "Planet Blows Up");
    }

    public void watchScienceFiction() {
        System.out.println("Watching a science fiction film.");
    }
}
