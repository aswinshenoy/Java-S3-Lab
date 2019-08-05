public class Circle implements Shape{
    protected double radius;

    public double area()
    {
        return pi*radius*radius;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }
}