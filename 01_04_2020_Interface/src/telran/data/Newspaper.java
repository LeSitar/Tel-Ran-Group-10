package telran.data;

public class Newspaper implements Printable {


    @Override
    public void print() {
        System.out.println("Newspaper");
    }

    @Override
    public void print2() {
        System.out.println("Morgen Post");
    }
}
