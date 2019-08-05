public class Rectangle extends Shape {

    int length, breadth;

    Rectangle(int l, int b, String name)
    {
        super(name);
        this.length = l;
        this.breadth = b;
    }

    @Override
    public double area()
    {
        return length * breadth;
    }
}