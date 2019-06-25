public class Main {

    public static void main(String[] args) {

        // Initialize new linked list
        LinkedList l = new LinkedList();

        // Insert elements into the linked list
        l.insert(10);
        l.insert(15);
        l.insert(20);

        // Searching for an element that exists
        System.out.println(l.search(20));

        // Searching for an element that does not exist
        System.out.println(l.search(25));

        // Show the linked list
        l.print();
    }

}
