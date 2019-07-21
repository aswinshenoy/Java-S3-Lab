public class parenthesisBalance {

	/*
	*  Function to check if an array of parenthesis
	*  represented by 0 for ( and 1 for ) 
	*  is balanced or not.
	*/
	static boolean isBalanced(int a[])
	{
		Stack s = new Stack();
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0) s.push(0);
			else if (a[i]==1)
			{
			  if(!s.isEmpty()) s.pop();
			  else return false;
			} 
		}
		return s.isEmpty();
	}

    public static void main(String[] args) {

    	int[] ar1 = new int[]{ 0 };
    	System.out.println(isBalanced(ar1));

    	int[] ar2 = new int[]{ 0,1 };
    	System.out.println(isBalanced(ar2)); 

    	int[] ar3 = new int[]{ 0,1,1 };
    	System.out.println(isBalanced(ar3)); 
    }
}
