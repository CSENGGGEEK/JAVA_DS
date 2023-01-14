package DSABASIC;
// Stack Program Using Java 
import java.util.*;
class Simple_Stack
{
    public static void main(String[] args) 
    {
        Stack stack = new Stack();
        System.out.println(" empty stack : ");
        System.out.println(stack);
        // .push is used to insert element in stack
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        System.out.println(" Stack After inserting element : ");
        System.out.println(stack);
        // .pop is used to delete element from stack from last ( LAST IN FIRST OUT)
        stack.pop();
        System.out.println(" Stack After deleting element : ");
        System.out.println(stack);
    }
}
