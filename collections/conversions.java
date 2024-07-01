package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class conversions {
    public static void main(String[] args) {
        Integer[] arr = {2,3,4,5,6,7}; Integer[] arr1 = {1,2,3,4,6,98,78};

        //converting arr to arraylist
        ArrayList<Integer> e = new ArrayList<>(Arrays.asList(arr));
        System.out.println(e);
        //converting arr2 to linkedlist
        LinkedList<Integer> w = new LinkedList<>(Arrays.asList(arr1));
        System.out.println(w);
        //convert linkedlist to hashset
        HashSet<Integer> q = new HashSet<>(w);
        System.out.println(q);

    }
}
