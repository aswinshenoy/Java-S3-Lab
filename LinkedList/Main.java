public class Main {

    public static void main(String[] args) {

        // Initialize new linked list
        LinkedList l = new LinkedList();

        // Insert elements into the linked list
        l.insert(10);
        l.insert(15);
        l.insert(25);

        // Searching for an element that exists
        System.out.println(l.search(25));

        // Searching for an element that does not exist
        System.out.println(l.search(20));

        // inserting at a position
        l.insert(20,3);
        l.insert(5,1);
        
         // Show the linked list
        l.print();
        
        // Showing middle of the linked list
		System.out.println(l.findMid());
		
		
		//Initialize a new list
		LinkedList s = new LinkedList();
		
		// Inserting elements in random order using Insert sort
		s.insertSort(25);
		s.insertSort(15);
		s.insertSort(10);
		s.insertSort(20);
		
		// Printing list expecting sorted list
		s.print();

    }

}
