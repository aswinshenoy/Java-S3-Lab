public class Stack extends LinkedList{


 	void push(int d) {
          insertAt(d,1);
    }

    int pop() {
	    if(head!=null)
	    {
	     	int key = head.data;
	     	// inherited from LinkedList, deletes element at position (here, at top or 1)
	     	delete(1);
	     	return key;		
	    }
	    else
	    	return -1;
    }

    boolean isEmpty() {
         if (head == null)
             return true;
         else 
             return false;
    }
}