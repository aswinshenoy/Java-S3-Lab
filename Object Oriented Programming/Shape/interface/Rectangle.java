public class Rectangle implements Shape{
    protected double length;
    protected double breadth;

    public double area()
    {
        return length * breadth;
    }

    public double perimeter() {
        return 2 *  ( length + breadth );
    }
}