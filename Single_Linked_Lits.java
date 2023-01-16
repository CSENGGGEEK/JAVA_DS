package DSABASIC; // ignore this
// singly linked list with some basic operation
import java.util.LinkedList;

public class Single_Linked_Lits {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println("--------------------------------------------------------------");
        System.out.println("printing blank linked list ::"+linkedList);
        System.out.println("--------------------------------------------------------------");
       // insertion is just like stack and push is used 
        linkedList.push(" laxman ");
        linkedList.push(" Ram ");
        linkedList.push(" sita ");
        linkedList.push(" ravan ");
        System.out.println("after insertion linked list is::"+linkedList);
        System.out.println("--------------------------------------------------------------");
        // pop is used to deleting an element
        linkedList.pop(); 
        //deletion is done by front 
        System.out.println( " After deleting ravan from linkedlist :\n"+linkedList);
        System.out.println("--------------------------------------------------------------");
    }
}
