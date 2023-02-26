package collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class UsePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue queue=new PriorityQueue();

        queue.add("Object 1");
        queue.add("Object 2");
        queue.add("Object 3");
        queue.add("Object 4");

        System.out.println("Peek which means not removing the element and get the head value : " + queue.peek());

        Iterator iterator=queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Poll which means removing  the head element "+ queue.poll());

        System.out.println("**************************************************");

        Iterator iterator2=queue.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
