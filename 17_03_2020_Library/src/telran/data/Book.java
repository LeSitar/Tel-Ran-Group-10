package telran.data;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int pages;
    private int dateOfIssue;

    public Book(String title, String author, int pages, int dateOfIssue) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.dateOfIssue = dateOfIssue;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }


    public int getDateOfIssue() {
        return dateOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                dateOfIssue == book.dateOfIssue &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pages, dateOfIssue);
    }

    @Override
    public String toString() {
        return "Book: " +
                  title +
                ", author: " + author  +
                ", pages: " + pages +
                ", dateOfIssue: " + dateOfIssue;
    }
}
