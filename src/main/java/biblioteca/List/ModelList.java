package biblioteca.List;

import biblioteca.model.Book;
import biblioteca.model.Movie;

import java.util.HashMap;
import java.util.Map;

import static biblioteca.util.BOOK;
import static biblioteca.util.MOVIE;


public class ModelList {
    private Map<String, Book> bookList;
    private Map<String, Movie> movieList;
    private Map<String, Book> checkoutListOfBook;
    private Map<String, Movie> checkoutListOfMovie;

    public ModelList() {
        bookList = new HashMap<>();
        checkoutListOfBook = new HashMap<>();
        movieList = new HashMap<>();
        checkoutListOfMovie = new HashMap<>();
        init();
    }


    void init() {
        bookList.put("1", new Book("Test-driven Development: By Example", "Kent Beck", 2003, 1));
        bookList.put("2", new Book("A Song of Ice and Fire", "George Raymond Richard Martin", 1996, 2));
        movieList.put("1", new Movie("Titanic", "1997", "James Cameron", "9", 1));
        movieList.put("2", new Movie("Avatar", "2009", "James Cameron", "9", 2));

    }

    public void checkout(int num, String type) {
        Map list = null;
        Map checkoutList =null;
        if (type.equals(BOOK)) {
            list = this.bookList;
            checkoutList = this.checkoutListOfBook;
        } else if (type.equals(MOVIE)) {
            list = this.movieList;
            checkoutList = this.checkoutListOfMovie;
        }
        String Number = String.valueOf(num);
        assert list != null;
        if (checkoutList != null && list.containsKey(Number)) {
            checkoutList.put(Number, list.get(Number));
            list.remove(Number);
            System.out.print(("enjoy your " + (type.equals(BOOK) ? "book" : "movie") + ", have fun" + "\n"));
        } else {
            System.out.print("we don't have this " + (type.equals(BOOK) ? "book" : "movie" + "\n"));
        }
    }

    public void returnCollection(int num, String type) {
        Map list = null;
        Map checkoutList = null;
        if (type.equals(BOOK)) {
            list = this.bookList;
            checkoutList = this.checkoutListOfBook;
        } else if (type.equals(MOVIE)) {
            list = this.movieList;
            checkoutList = this.checkoutListOfMovie;
        }
        String number = String.valueOf(num);
        if (checkoutList != null && checkoutList.containsKey(number)) {
            list.put(number, checkoutList.get(number));
            checkoutList.remove(number);
            System.out.println(("thank you return our book" + (type.equals(BOOK) ? "book" : "movie")));
        } else {
            System.out.println(("this " + (type.equals(BOOK) ? "book" : "movie") + " is not our,please return to other biblioteca"));
        }
    }

    public String getBookList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Book> entry : bookList.entrySet()) {
            stringBuilder.append(entry.getValue().getDetails());
        }
        return stringBuilder.toString();
    }

    public String getMovieList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Movie> entry : movieList.entrySet()) {
            stringBuilder.append(entry.getValue().getDetails());
        }
        return stringBuilder.toString();
    }
}
