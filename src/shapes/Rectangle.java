package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
//    protected int length;
//    protected int width;
//
//    // Rectangle constructor
//    public Rectangle (int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    // Rectangle methods
//    public int getArea () {
//        return length * width;
//    }
//    public int getPerimeter () {
//        return 2 * length + 2 * width;
//    }
}
