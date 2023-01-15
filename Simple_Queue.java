package DSABASIC; // Ignore this
// a queue program in java with some operation 
import java.lang.Package;
import java.util.LinkedList;
import java.util.Queue;
public class Simple_Queue {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();
        System.out.println("let's print our empty queue ::\n "+ queue);
        System.out.println(" check our queue is empty ::\n" +queue.isEmpty());
        // offer and add is used to add element in queue
        queue.offer(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        System.out.println("the original queue after insertion :: \n"+ queue);
        System.out.println(" head of the element is : \n"+ queue.element());
        // remove and poll is used to delete element from queue
        // it deletes from first item ( first in first out )
        queue.remove(); 
        queue.poll();
        System.out.println("the queue after deletion :: \n" + queue);
        System.out.println("check our queue contains element 33 ::\n"+ queue.contains(33)); 
    }
}
