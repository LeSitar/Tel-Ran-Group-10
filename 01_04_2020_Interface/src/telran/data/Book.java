package telran.data;

public class Book implements Printable{
    private String title;
    private String author;

    //public Book(){};

    public Book(String title) {  //Book book = new Book("Stars")
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book " + title +
                ", by " + author);
    }
}
