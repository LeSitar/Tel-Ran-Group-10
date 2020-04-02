package telran.controller;

import telran.data.*;

public class PrintableApp {

    public static void main(String[] args) {
        Book book1 = new Book("The little prince", "Saint-Exupery");
        Printable book = new Book("War and Peace", "Tolstoy");
        Printable journal = new Journal("World");
        Printable newspaper = new Newspaper();
        WaterPipe pipe = new WaterPipe();

        /*Printable.print1();

        Printable[] objects = {book, book1, journal ,newspaper, pipe};
        for (Printable o:objects) {
          o.print2();
        }

        pipe.printState(1);
        read(pipe);*/

        Printable book3 = createPrintable("Ulysses", true);
        book3.print();
        ((Book)book3).setAuthor("Joyce");
        book3.print();
        Printable journal2 = createPrintable("National geographic", false);
        journal2.print();
        System.out.println(journal2.getClass());

    }

    static void read(Printable p){
        p.print();
    }

    static Printable createPrintable(String name, boolean option){
        if(option){
            return new Book (name);
        }else{
            return new Journal(name);
        }
    }

}
