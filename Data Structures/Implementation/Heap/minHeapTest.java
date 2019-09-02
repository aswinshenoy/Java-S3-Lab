import java.util.Random;

class minHeapTest {

    public static void main(String[] args)
    {
//        Random r = new Random();
//        int[] keys = new int[10];
//        for(int i=0; i<10; i++)
//            keys[i] = r.nextInt(100);
        int[] keys = {10,20,30,40,50,60,80};
        MinHeap m = new MinHeap(keys);
        m.print();

        m.printInfo(0);
        m.printInfo(1);
        m.printInfo(2);
        m.printInfo(3);


        m.buildHeap();
        m.print();
    }

}