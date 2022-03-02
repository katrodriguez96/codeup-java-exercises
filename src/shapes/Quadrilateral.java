package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    // Quadrilateral constructor
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Abstract setters
    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}
