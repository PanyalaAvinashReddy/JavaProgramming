package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
        // using stream map() we can get squares of numbers
        List<Integer> number = Arrays.asList(2,7,5,4,6);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
        // using map() we can also convert lower case to uppercase
        List<String> list = Arrays.asList("apple","cat","ball","dog");
        List<String> upper = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);
        // use of filter() in streams
        List<String> filter = list.stream().filter(x->x.contains("a")).collect(Collectors.toList());
        System.out.println(filter);
        List<String> filter1 = list.stream().filter(x->x.isEmpty()).collect(Collectors.toList());
        System.out.println(filter1);
        List<Integer> order = number.stream().sorted().collect(Collectors.toList());
        System.out.println(order);
        List<String> sort = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        // reduce() sum of all even numbers
        List<Integer> collect = Arrays.asList(10,9,8,6,5);
        int res = collect.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(res);


    }
}
