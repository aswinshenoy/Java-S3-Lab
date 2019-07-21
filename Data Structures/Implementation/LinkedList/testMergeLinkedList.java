public class testMergeLinkedList {

  public static void main(String[] args) {

    LinkedList l1 = new LinkedList();
    l1.insertSort(5);
    l1.insertSort(15);
    l1.insertSort(25);
    l1.insertSort(35);
    l1.insertSort(45);
    l1.print();

    LinkedList l2 = new LinkedList();
    l2.insertSort(10);
    l2.insertSort(20);
    l2.insertSort(30);
    l2.insertSort(40);
    l2.insertSort(50);
    l2.print();

    LinkedList obj = new LinkedList(); 
    obj.merge(l1,l2);
    obj.print();
  }
}
