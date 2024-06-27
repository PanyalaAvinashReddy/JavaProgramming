package collections;
import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.addFirst(20);
        arr.add(30);
        arr.addLast(40);
        arr.add(20);
        arr.add(50);
        arr.add(67);
        arr.add(98);
        arr.add(7,100);

        System.out.println("the removed element : " + arr.remove(1));
        Iterator ea = arr.iterator();
        while(ea.hasNext()){
            System.out.println(ea.next());
        }
        for(int i:arr){
            System.out.print(i);
        }
        //arr.clear() removes all the elements

        boolean b = arr.contains(20);
        System.out.print("\n" +b);

        System.out.print("\n"+arr.get(4));//gets the value at 4

        System.out.println("\n"+"The index of 100 in LL is : "+arr.indexOf(100)); //gives index of element

        Object c = arr.poll();//removes firrst element from LL and returns similarly can use polllast and pollstart
        System.out.println("Poll removes first element : " + c);

        System.out.println(arr.remove(0));//removes first element from LL

        arr.set(2,35);//adding elements using set method
        System.out.println("size of the array is :"+arr.size());

        Object a = arr.clone();//shows the output in a good format
        System.out.println("\n"+a);

        //adding all the linkedlist elements to array list
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(arr);
        System.out.println("Copied elements :" + arr2.clone());
    }

}
