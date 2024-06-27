package collections;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add(0,"banana");
        v.add("papaya");
        v.add("guava");
        v.add("Cane");
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.get(0));
        System.out.println(v.set(0,"grape"));
        v.add(0,"banana");
        System.out.println(v.isEmpty());
        System.out.println(v.removeElement("Apple")); //removes the sepecified element and returns true or false
        System.out.println("Do the list contain : "+v.contains("grape"));

        System.out.println(v);

        //convert vector to Arraylist

        ArrayList<String> arr = new ArrayList<>(v);
        for (String i:arr){
            System.out.println(i);
        }

        //convert vector to linkedlist
        LinkedList<String> arr1 = new LinkedList<>(v);
        for (String i:arr1){
            System.out.println(i);
        }

        //linkedlist to array
        ArrayList<String> v1 = new ArrayList<>();
        v1.addAll(arr1);
        System.out.println(v1);
    }
}
