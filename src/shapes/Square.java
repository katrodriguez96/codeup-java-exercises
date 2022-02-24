package shapes;

public class Square extends Rectangle{
    public int side;

    // Square constructor
    public Square (int side) {
        super(side, side);
        this.side = side;
    }

    // Square methods overriding Rectangle methods
    public int getArea () {
        return (int) Math.pow(side, 2);
    }
    public int getPerimeter () {
        return 4 * side;
    }
}
