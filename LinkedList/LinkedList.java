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
}
