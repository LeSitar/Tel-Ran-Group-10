package telran.data;

public class Circle extends Shape{
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle: " + getColor() +
                ", radius: " + radius +
                ", area: " + getArea();
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }
}
