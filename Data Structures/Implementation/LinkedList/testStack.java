public class testStack
{
    public static void main(String[] args){
        //Initialize a new Stack
        Stack s = new Stack();

        s.push(25);
        s.print();
        s.push(50);
        s.print();
        s.pop();
        s.print();
        System.out.println(s.isEmpty());
    }
}