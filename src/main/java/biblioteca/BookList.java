package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class BookList {
    private Map<String, Book> bookList;
    private Map<String, Book> checkoutList;

    BookList() {
        bookList = new HashMap<>();
        checkoutList = new HashMap<>();
        init();
    }


    void init() {
        bookList.put("1", new Book("Test-driven Development: By Example", "Kent Beck", 2003,001));
        bookList.put("2", new Book("A Song of Ice and Fire:", "George Raymond Richard Martin", 1996,002));
    }
    void checkout(int num){
        String bookNumber = String.valueOf(num);
        if (bookList.containsKey(bookNumber)) {
            checkoutList.put(bookNumber, bookList.get(bookNumber));
            bookList.remove(bookNumber);
            System.out.println("enjoy your book, have fun");
        }else {
            System.out.println("we don't have this book");
        }
    }
    void returnBook(int num){
        String bookNumber = String.valueOf(num);
        if (checkoutList.containsKey(bookNumber)) {
            bookList.put(bookNumber, checkoutList.get(bookNumber));
            checkoutList.remove(bookNumber);
            System.out.println("thank you return our book");
        }else {
            System.out.println("this book is not our,please return to other biblioteca");
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Book> entry : bookList.entrySet()) {
            stringBuilder.append(entry.getValue().getDetails());
        }
        return stringBuilder.toString();
    }
}
