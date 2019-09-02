public class MinHeap
{
    int[] arr;
    int size;

    MinHeap(int[] keys)
    {
        arr = keys;
        size = arr.length;
    }

    void print()
    {
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    void printInfo(int i)
    {
        System.out.print(i + " - ");
        System.out.print("ELEMENT: " + getValue(i) + " ");
        System.out.print("PARENT: " + getValue(getParent(i)) + " ");
        System.out.print("LEFT-CHILD: " + getValue(getLeftChild(i)) + " ");
        System.out.print("RIGHT-CHILD: " + getValue(getRightChild(i)) + "\n");
    }

    int getValue(int i)
    {
        if(i==-1)
            return i;
        else
            return arr[i];
    }

    int getParent(int i)
    {
        return (i-1)/2;
    }

    int getLeftChild(int i)
    {
        int index = 2*i+1;
        if(index<size)
            return index;
        else
            return -1;
    }

    int getRightChild(int i)
    {
        int index = 2*i+2;
        if(index<size)
            return index;
        else
            return -1;
    }

    void swap(int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int checkHeap(int i){

        int left = getLeftChild(i);
        int right = getRightChild(i);

        if (left == -1 && right == -1)
            return i;

        if (right == -1) {
            if (arr[i] < arr[left])
                return i;
            else
                return left;
        }

        if(arr[i] < arr[left] && arr[i] < arr[right])
            return i;

        if(arr[i] > arr[left]) return left;

        return right;
    }

    void fixHeap(int i)
    {
        int j = checkHeap(i);
        if(i==j)
            return;
        else {
            swap(i,j);
            fixHeap(j);
        }
    }

    void buildHeap()
    {
        for(int i = (arr.length-2)/2; i>=0; i--)
            fixHeap(i);
    }
}