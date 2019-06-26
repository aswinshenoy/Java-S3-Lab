public class LinkedList {
    Node head;

    /*
     *   Function to print the linked list
     */
    public void print()
    {
        // make a copy of head for traversing
        Node i = this.head;
        // while end of list is not reached
        while(i!=null)
        {
            // print out the data of the node
            System.out.print(i.data + " ");
            // move to the next node
            i = i.next;
        }
        // prints blank line
        System.out.println();
    }

    /*
     *   Function to insert a node at the end of the linked list
     */
    public void insert(int d)
    {
        // New node is created
        Node n = new Node();
        // Data is saved to node
        n.data = d;

        // Checks if list is empty
        if(head == null)
            // if list is empty, current element is head
            head = n;
        // if list is not empty
        else{
            //make a copy of head for traversing
            Node i = this.head;
            // while end of list is not reached
            while(i.next!=null){
                // move to the next node
                i = i.next;
            }
            // add the current node as the next of the last node of the list
            i.next = n;
        }
    }
    
    /*
     *   Function to insert a node at a given position in the linked list
     */
    public void insert(int d, int pos)
    {
        // create a new node, and save data to it
        Node n = new Node();
        n.data = d;

        // make a copy of head to transverse
        Node curr = this.head;

        // if position to be inserted is not 1
        if(pos!=1){
            // transverse until the element before the position to be inserted
            for(int i=1; i<pos-1; i++)
                // move to the next node
                curr = curr.next;
            
            // set the next node of the new node as the node that was originally in that position
            n.next = curr.next;
            // set the next node of the node before position to the new node created 
            curr.next = n;
        }
        // if position to be inserted is 1
        else{
            // update next node of the new node to the old head
            n.next = this.head;
            // set the new node as the head of the linked list
            this.head = n;
        }

    }
    
    /*
     *   Function to insert a node into so as to 
     *   create a sorted linkedlist
     *   such that the previous node has lesser value 
     *   and the next node has higher value.
     */
    public void insertSort(int d)
	{
		// create a new node, and save data to it
        Node n = new Node();
        n.data = d;
        
        Node curr = this.head;
        
        // if the list is empty, add the element to the first position
		if(curr == null)
			// if list is empty, current element is head
			head = n;
		// else if element is smaller than the head of the list
		else if(curr.data>d)
		{
			//update the head
			n.next = this.head;
			this.head = n;
		}
		// else traverse through the list to find the position to insert
		else{
			while(curr!=null & curr.next!=null)
			{
			  //initializing a pointer and storing the previous node
			  Node prev = curr;
			  // moving curr pointer to the next node
			  curr = curr.next;
			  // check if curr point data is greater than insert data
			  if(curr.data>d)
			  {
				 // make the curr node as the next of the inserted node
				 n.next = curr;
				 // make the inserted node as the next of the previous node
				 prev.next = n;
				 // break the loop after inserting
				 break;
			  }
			}
		}  
	}


    /*
     *   Function to search a given element in a linked list,
     *   and return its position if found,
     *   else return -1
     */
    public int search(int d)
    {
        // make a copy of head to traverse
        Node n = this.head;
        // initialize a counter variable
        int i = 0;
        // while list has elements
        while(n!=null){
            // increment counter
            i++;
            // check if matching
            if(n.data==d)
                // return position
                return i;
            // move to next node
            n = n.next;
        }
        // if not found, return -1
        return -1;
    }
    
    
   /*
    *   Function to find the middle element
    *   of the linkedList in a single traversal
    */
    public int findMid()
    {
		//initializing fast pointer which will move 2 nodes at a time
		Node fast = this.head;
		//initializing slow pointer which will move 1 node at a time
		Node slow = fast;
		
		// while fast pointer has not reached the end (even & odd case)
		while(fast!=null && fast.next!=null)
		{
			// traversing the fast pointer twice
			fast = fast.next.next;

			// traversing the slow pointer once
			if(fast!=null)
				slow = slow.next;
		}
		/*
		 *  The slow pointer corresponds to the middle element 
		 *  when fast pointer points to null
		 */
 		return slow.data;
	}

}
