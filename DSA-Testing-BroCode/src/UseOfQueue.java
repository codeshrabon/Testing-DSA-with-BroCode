import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue {
    public void useOfQueue(){

        // queue is a interface
        // queue is exteded by collection framework
        // you can not create an instance/object of an interface for that we need another class
        // those classes are LinkedList and priorityQueue but we use LinkedList
        // interfaces are, where you declare method
        Queue<String> queue = new LinkedList<String>();

        // add method and offer method are to add data into queue
        // adding data into queue
        queue.add("Faysal");
        queue.add("ahmed");
        queue.offer("Shrabon");
        if (!queue.isEmpty()){
            // remove() and poll() method are to remove/delete data from queue from first
            queue.poll();
            queue.remove();

            // peek() method is to see the first data of queue
            String queueData = queue.peek();

            System.out.println("Queue have the first data : " + queueData);

            System.out.println(queue.size());
        }else {
            System.out.println("Queue is Empty");
        }
    }
}
