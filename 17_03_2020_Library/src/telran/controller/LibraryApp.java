package telran.controller;

import telran.dao.Library;
import telran.data.Book;

public class LibraryApp {
    public static void main(String[] args) {

        Book book1 = new Book ("Winnie the Pooh", "Alex Milan", 350, 1957);
        Book book2 = new Book ("Harry Potter", "Joan Rollings", 435, 2010);
        Book book3 = new Book ("Sherlock Holms", "Artur Conan Doyle", 388, 1892);
        Book book4 = new Book ("War and Peace 1","Lev Tolstoy", 968, 1886 );
        Book book5 = new Book ("Capital", "Karl Marx", 1200, 1867);


        Library myLab = new Library(100);
        myLab.addBook(book1);
        myLab.addBook(book2);
        myLab.addBook(book3);
        myLab.addBook(book4);
        myLab.addBook(book5);

        myLab.display();
        System.out.println(myLab.getOldestYearOfBook());

       /* myLab.deleteBook(book4);
        System.out.println();
        myLab.display();
        System.out.println();
        myLab.searchBookByAuthor("Lev Tolstoy");*/

    }
}
