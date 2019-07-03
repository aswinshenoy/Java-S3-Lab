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
		LinkedList l2 = new LinkedList();
		
		// Inserting elements in random order using Insert sort
		l2.insertSort(25);
		l2.insertSort(15);
		l2.insertSort(10);
		l2.insertSort(20);
		
		// Printing list expecting sorted list
		l2.print();


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
