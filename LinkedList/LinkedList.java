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
