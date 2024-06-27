package collections;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("banana ");
        arr.add("apple ");
        arr.add("papaya ");
        arr.add("gauva ");
        arr.add("pine-apple ");
        arr.add("mango ");
        arr.set(3,"promoganate"); // sets value of 3 to promoganate
        System.out.println(arr.get(3)); // gets the value
        Collections.sort(arr);//sorts alphabetically
        for(String i:arr){
            System.out.print(i+",");
        }

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1234);
        arr1.add(2289859);
        arr1.add(122);
        arr1.add(1000);
        arr.remove(1);
        arr1.add(0,1234);
        Collections.sort(arr1);//sort asscending
        for(int a:arr1){
            System.out.println(a);
        }

    }
}
