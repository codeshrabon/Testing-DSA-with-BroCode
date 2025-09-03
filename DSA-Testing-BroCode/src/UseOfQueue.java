import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseOfQueue {
    public void useOfQueue(){

//         queue is a interface
//         queue is exteded by collection framework
//         you can not create an instance/object of an interface for that we need another class
//         those classes are LinkedList and priorityQueue but we use LinkedList
//         interfaces are, where you declare method
        Queue<String> queue = new LinkedList<String>();

        // add method and offer method are to add data into queue
        // adding data into queue
        queue.add("Faysal");
        queue.add("ahmed");
        queue.offer("Shrabon");
        if (!queue.isEmpty()){
            // remove() and poll() method are to remove/delete data from queue from first
            /*queue.poll();
            queue.remove();*/

            // peek() method is to see the first data of queue
            String queueData = queue.peek();

            System.out.println("Queue have the first data : " + queueData);
            System.out.println("Queue have the second data : " + queue.contains("Shrabon"));
            System.out.println(queue.size());
        }else {
            System.out.println("Queue is Empty");
        }
    }

    // priorityqueue that serve elements with the highest priorities first before elements with lower priority
    public void useOfPriorityQueueReverse() {
        PriorityQueue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());
        queue.offer("Faysal");
        queue.offer("ahmed");
        queue.offer("shrabon");
        queue.offer("russell");

        while (!queue.isEmpty()) {
            System.out.println("This shows queue in reverse order: "+queue.poll());
        }
    }

    public void useOfPriorityQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Z");
        queue.offer("D");
        queue.offer("A");
        queue.offer("C");
        queue.offer("moon");
        queue.offer("E");

        while (!queue.isEmpty()) {
            String queuePriority = queue.poll();
            System.out.println("Priority queue in order: "+ queuePriority);
        }

    }
}
