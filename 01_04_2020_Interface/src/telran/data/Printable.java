package telran.data;

public interface Printable {
    void print();

    default void print2(){
        System.out.println("Undefined");
    }

    static void print1(){
        System.out.println("reading is good");
    }

}
