//@Author Daniel O. Liu
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //test books
        Book b = new Book("\"Sigma box fights ruined my life\" - how elon Musk brought back OG fortnite");
        Book b2 = new Book("how jeff Bezos survived the fortnite storm");
        Book b3 = new Book("why the world feared EDP's perfected recipe for homemade cupcakes");
        Library lib = new Library(new ArrayList<Book>(Arrays.asList(b, b2, b3)));
        Library searchTest = new Library(lib.searchBook("the"));
        System.out.println(searchTest.toString());
    }
}
