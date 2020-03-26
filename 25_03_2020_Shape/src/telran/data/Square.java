package telran.data;

public class Square extends Shape {

    private double size;

    public Square(Color color, double size) {
        super(color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return  super.toString() + "Square: " + getColor() +
                ", size" + size +
                " , area: " + getArea();
    }

    @Override
    public double getArea() {
        return size*size;
    }
}
