package oops;
import java.sql.SQLOutput;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        //creating a stack
//        Stack<Integer> a = new Stack<>();
//        // confirm that created stack is an empty tack
//        System.out.println("Stack is Empty : " + a.isEmpty());
//        //adding element to the stack
//        a.push(20);
//        a.push(30);
//        a.push(40);
//        System.out.println(a);
//        //removing the element from the stack
//        a.pop();
//        System.out.println(a);
//        // view the top element in the stack
//        int top = a.peek();
//        System.out.println(top);

        Stack<String> a1 = new Stack<>();
        System.out.println(a1.isEmpty());
        a1.push("Apple");
        a1.push("banana");
        a1.push("Papaya");
        a1.push("grapes");
        System.out.println("Stack : "+ a1);
        //size of  stack
        System.out.println(a1.size());
        //search in stack to get location of the element
        int loc = a1.search("Papaya");
        System.out.println(loc);

    }
}
