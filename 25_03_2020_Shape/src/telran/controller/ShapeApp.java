package telran.controller;

import telran.data.*;

public class ShapeApp {
    public static void main(String[] args) {
        Square sq1 = new Square(Color.BLACK, 21);
        Square sq2 = new Square(Color.RED, 14);
        Square sq3 = new Square(Color.BLUE, 11);

        Circle c1 = new Circle(Color.BLUE, 7);
        Circle c2 = new Circle(Color.BLACK, 9);
        Circle c3 = new Circle(Color.GREEN, 15);

        Rectangle r1 = new Rectangle(Color.YELLOW, 5, 9);
        Rectangle r2 = new Rectangle(Color.BLACK, 7,3);
        Rectangle r3 = new Rectangle(Color.RED, 3,4);

        Shape[] shapes = {sq1,sq2,sq3,c1,c2,c3,r1,r2,r3};
        //displayArray(shapes);

        //System.out.println(Shape.findMaxShape(shapes));
        displayArray(Shape.getByColor(shapes,"green"));


    }

    static void displayArray (Object[] objects){
        for (Object o:objects) {
            System.out.println(o);
        }
    }
}
