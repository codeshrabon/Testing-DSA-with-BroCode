import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayListsUse {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // we need start time 
        // end time 
        // elapsed time 
        long startTime ;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // **************LinkedList **************
        startTime = System.nanoTime();
        // after doing something 
        // till now we try to get element
        //int a_random_number = linkedList.get(5);
        //linkedList.get(500000);
        //linkedList.get(999999);

        // now time to remove some element 

        endTime = System.nanoTime();


        elapsedTime = endTime - startTime;

        System.out.println("LinkedList time :\t" + elapsedTime + " ns");
        System.out.println("LinkedList :\t" + a_random_number );


        // **************ArrayList **************

        startTime = System.nanoTime();
        // after doing something 
        // till now we try to get element
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);

        // now time to remove something from it 

        endTime = System.nanoTime();


        elapsedTime = endTime - startTime;

        System.out.println("ArrayList time :\t" + elapsedTime + " ns");


    }
}
