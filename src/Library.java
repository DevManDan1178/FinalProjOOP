//@Author Daniel O. Liu
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;


    public Library() {
        //create length 5 arraylist of default books
        books = new ArrayList<Book>(5);
        for (int i = 0; i < 5; i++) {
            books.add(new Book());
        }
    }
    public Library(ArrayList<Book> books_) {
        books = books_;
    }
    public Library(Library L){
        books = L.books;
    }

    public ArrayList<Book> searchBook(String KeyWord) {
        Library filterLibrary = new Library(this);
        //filter for books with keyword in it
        ArrayList<Book> filterBooks = filterLibrary.getBooks();
        filterBooks.removeIf(book -> !
                (book.getTitle().toLowerCase().contains(KeyWord.toLowerCase())
                || book.getAuthor().toLowerCase().contains(KeyWord.toLowerCase()))
        );
        System.out.println(filterBooks.size());
        return filterBooks;
    }

    public boolean equals(Library L) {
        return books.equals(L.books);
    }

    public String toString() {
        String ts = "Our catalogue of books:";
        for (Book book : books) {
            ts += "\n" +  book.getTitle();
        }
        return ts;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books_) {
        books = books_;
    }

}
