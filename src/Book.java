//@Author Daniel O. Liu
public class Book {
    private String Title;
    private String Author;
    private double Price;
    private String Publisher;
    private String ISBN;

    public Book() {
        Title = "untitled";
        Author = "nobody";
        Price = .0;
        Publisher = "none";
        ISBN = "";
        toTitleCase();
    }
    public Book(String title) {
        Title = title;
        Author = "nobody";
        Price = .0;
        Publisher = "none";
        ISBN = "";
        toTitleCase();
    }
    public Book(String title, String author, float price, String publisher, String ISBN_) {
        Title = title;
        Author = author;
        Price = price;
        Publisher = publisher;
        ISBN = ISBN_;
        toTitleCase();
    }
    public Book(Book b){
        Title = b.getTitle();
        Author = b.getAuthor();
        Price = b.getPrice();
        Publisher = b.getPublisher();
        ISBN = b.getISBN();
    }
    public int checkIsbnStatus(){
        if (ISBN.length() == 13) return 0; //ISBN10
        if (ISBN.indexOf("978") == 0 && ISBN.length() == 17) return 1; //ISBN13
        return -1;
    }
    private String getTitleCase(String str){
        String finalStr = "";
        while (true) {
            char starterChar = Character.toUpperCase(str.charAt(0)) ;
            finalStr += starterChar;
            int nextSpaceIndex = str.indexOf(" ");
            if (nextSpaceIndex == -1){
                finalStr += str.substring(1);
                break;
            }
            finalStr += str.substring(1,nextSpaceIndex + 1);
            str = str.substring(nextSpaceIndex+1);
        }
        return finalStr;
    }

    public String toString(){
       return String.format("Title     : %s\nAuthor    : %s\nPrice     : %.2f\nPublisher : %s\nISBN      :%S", Title, Author, Price, Publisher, ISBN);
    }

    public boolean equals(Book b){
        return b.getTitle() == Title && b.getAuthor() == Author && b.getPrice() == Price && b.getISBN() == ISBN;
    }

    public Book clone(){
        return new Book(this);
    }
    public void toTitleCase(){
        Author = getTitleCase(Author);
        Title = getTitleCase(Title);
    }

    //getters
    public String getISBN(){
        return ISBN;
    }
    public String getAuthor(){
        return Author;
    }
    public double getPrice(){
        return Price;
    }
    public String getPublisher(){
        return Publisher;
    }
    public String getTitle(){
        return Title;
    }
    //setters
    public void setAll(String title, String author, double price, String publisher, String ISBN_){
        Title = title;
        Author = author;
        Price = price;
        Publisher = publisher;
        ISBN = ISBN_;
    }
    public void setISBN(String ISBN_){
        ISBN = ISBN_;
    }
    public void setAuthor(String author){
        Author = author;
    }
    public void setPrice(double price){
        Price = price;
    }
    public void setPublisher(String publisher){
        Publisher = publisher;
    }
    public void setTitle(String title){
        Title = title;
    }
}
