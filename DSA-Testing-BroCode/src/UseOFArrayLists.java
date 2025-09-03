import java.util.LinkedList;

public class UseOFArrayLists {
    public static void main(String[] args) {
        // arraylists are suitable for searching but not for inserting or deleting
        // in linkedLists are good at insert and delete but bad at searching
        /* 
         * linkedList are singly and doubly linked list 
         * 1. singly linked list are have data and randomAddress Node<E> head = 124address;
         * 2. doubly linkedList are have previous address , data , next address 
         * in doubly linkedList is treverse easy cause it knows their revious and next nodes preciesly 
         * but it take mode space then singly linkedList 
         * 
         * for inserting in LinkedList you still need to treverse to find where it should go;;;
         * 
         */

         LinkedList <String> linkedList = new LinkedList<>();

         linkedList.offer("Faysal");
         linkedList.offer("Ahmed");
         linkedList.offer("Shrabon");
         linkedList.offer("Russell");

         linkedList.add(3,"hulala");

         linkedList.addFirst("UngaBunga");
         linkedList.addLast("Lastunga");

         System.out.println(linkedList.indexOf("Ahmed"));

         while (!linkedList.isEmpty()) {
            System.out.println(linkedList.poll());
         }
    }
}
