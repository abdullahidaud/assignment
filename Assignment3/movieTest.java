package test;

import movie.movie;
import movie.movieItem;

public class movieTest {
    public static void main(String[] args) {
        movie myMovieCollection = new movie();

        movieItem item1 = new movieItem("Inception", "Christopher Nolan");
        movieItem item2 = new movieItem("The Matrix", "Lana Wachowski");

        myMovieCollection.addmovieItem(item1);
        myMovieCollection.addmovieItem(item2);

        myMovieCollection.printmovieDetails();
    }
}
