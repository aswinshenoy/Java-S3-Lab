public class Stack extends LinkedList{
	
	Node top;

 	void push(int d) {
          insert(d,1);
    }

    int pop() {
	    if(head!=null)
	    {
	     	int key = head.data; 	
	     	delete(1);
	     	return key;		
	    }
	    else
	    {
	    	return -1;
	    }
       	
    }

    boolean isEmpty() {
         if (head == null)
             return true;
         else 
             return false;
    }
}
