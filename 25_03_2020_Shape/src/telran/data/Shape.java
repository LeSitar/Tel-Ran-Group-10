package telran.data;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape: ";
    }

    public abstract double getArea();

    public static Shape findMaxShapeByArea(Shape[] shapes){
        Shape max = null;
        double maxArea = 0;
        for (Shape s:shapes) {
           double area = s.getArea();
           if(area>maxArea){
               maxArea = area;
               max = s;
           }
        }
        System.out.println("Max area is " + maxArea);
        return max;
    }

    public static Shape findMaxShape(Shape[] shapes){
        Shape max = shapes[0];
        double maxArea = shapes[0].getArea();
        for (int i = 0; i < shapes.length-1; i++) {
            if(shapes[i+1].getArea()>maxArea){
                maxArea = shapes[i+1].getArea();
                max = shapes[i+1];
            }
        }
        System.out.println("Max area is " + maxArea);
        return max;
    }

    public static Shape[] getByColor(Shape[] shapes, String color){
        int size = 0;
        for (Shape s:shapes) {
            if(s.getColor().name().equalsIgnoreCase(color)){
                size++;
            }
        }
        if (size<1){
            System.out.println("color not found");
            return null;
        }
        Shape[] shapesByColor = new Shape[size];
        int index = 0;
        for (int i = 0; i < shapes.length; i++) {      //here you can also use the loop for each
            if(shapes[i].getColor().name().equalsIgnoreCase(color)){
                shapesByColor[index] = shapes[i];
                index++;
            }
        }
        return shapesByColor;
    }
}
