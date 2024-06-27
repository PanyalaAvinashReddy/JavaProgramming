package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

    class student{
        int id;

//        @Override
//        public String toString() {
//            return "student{" +
//                    "id=" + id +
//                    ", section=" + section +
//                    ", marks=" + marks +
//                    ", name='" + name + '\'' +
//                    ", sub='" + sub + '\'' +
//                    '}';
//        }

        int section;
        int marks;
        String name,sub;

        public student(int id,String name,int section,String sub,int marks){
            this.id = id;
            this.name = name;
            this.section = section;
            this.sub = sub;
            this.marks = marks;
        }
    }

public class linkedlist2 {
    public static void main(String[] args) {
        List<student> arr = new LinkedList<student>();

        student r1 = new student(1,"Avinash",2020,"Maths",35);
        student r2 = new student(2,"Bhanu",2020,"Maths",46);
        student r3 = new student(3,"Purvesh",2021,"english",23);

        arr.add(r1);
        arr.addFirst(r2);
        arr.addLast(r3);

//        Iterator se = arr.iterator();
//        while(se.hasNext()){
//            System.out.println(se.next());
//        }

        for (student i:arr){
            System.out.println("{"+i.id+i.section+" " +i.name+ " " +i.sub+"}");
        }
    }
}
