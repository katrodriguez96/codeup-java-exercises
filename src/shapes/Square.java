package shapes;

public class Square extends Quadrilateral{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(length, 2);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.length = width;
    }
//    public int side;
//
//    // Square constructor
//    public Square (int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    // Square methods overriding Rectangle methods
//    public int getArea () {
//        return (int) Math.pow(side, 2);
//    }
//    public int getPerimeter () {
//        return 4 * side;
//    }
}
