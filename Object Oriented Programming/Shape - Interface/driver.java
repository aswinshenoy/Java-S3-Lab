public class driver {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 15;
        System.out.println("Circle ");
        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: " + c.perimeter());

        Rectangle r = new Rectangle();
        r.length = 15;
        r.breadth = 10;
        System.out.println("\nRectangle ");
        System.out.println("Length: " + r.length);
        System.out.println("Breadth: " + r.breadth);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}