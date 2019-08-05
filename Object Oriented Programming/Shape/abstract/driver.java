public class driver {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(15,10,"Rectangle");
        System.out.println("Name: " + r.name);
        System.out.println("Length: " + r.length);
        System.out.println("Breadth: " + r.breadth);
        System.out.println("Area: " + r.area());
    }
}