package sec8ooppart2polymorphism.sec8107polymorphismpart1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie theMovie = new Movie("Star Wars");
        theMovie.watchMovie();

        Movie theMovieStatic = Movie.getMovie("Adventure", "Star Wars");
        theMovieStatic.watchMovie();

        Movie adventureMovie = new Adventure("Jumanji");
        adventureMovie.watchMovie();

        Movie adventureMovieStatic = Movie.getMovie("Adventure", "Jumanji");
        adventureMovieStatic.watchMovie();

        Movie comedyMovie = new Comedy("Click");
        comedyMovie.watchMovie();

        Movie comedyMovieStatic = Movie.getMovie("Comedy", "Click");
        comedyMovieStatic.watchMovie();

        Movie sciFiMovie = new ScienceFiction("Star Wars 3");
        sciFiMovie.watchMovie();

        Movie sciFiMovieStatic = Movie.getMovie("ScienceFiction", "Matrix");
        sciFiMovieStatic.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction or Q to quit): ");
            String type = s.nextLine();

            if ("Qq".contains(type)) break;

            System.out.println("Enter Movie Title");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
