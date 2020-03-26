package telran.data;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle: " + getColor() +
                ", width: " + width +
                ", height: " + height +
                ", area: " + getArea();
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
