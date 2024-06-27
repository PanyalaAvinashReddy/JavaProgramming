package collections;
import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.addFirst(20);
        arr.add(30);
        arr.addLast(40);

        for(int i:arr){
            System.out.println(i);
        }
    }

}
