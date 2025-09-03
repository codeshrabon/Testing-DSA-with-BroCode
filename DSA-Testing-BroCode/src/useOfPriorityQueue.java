import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class useOfPriorityQueue {
    public static void main(String[] args) {
        // priority queue = A fifo data structure that serves elements 
        // with the hights priorities first before elements with lower priority 

        //while using LinkedList<>();
        //Queue<Double> queue = new LinkedList<>();
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(2.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        
    }
}
