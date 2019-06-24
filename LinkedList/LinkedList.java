public class LinkedList {
    Node head;

    public void show()
    {
        Node i = this.head;
        while(i.next!=null)
        {
            System.out.print(i.data + " ");
            i = i.next;
        }
        System.out.print(i.data + " ");

    }

    public void insert(int d)
    {
        Node n = new Node();
        n.data = d;
        if(head == null)
            head = n;
        else{
            Node i = this.head;
            while(i.next!=null){
                i = i.next;
            }
            i.next = n;
        }
    }
}

