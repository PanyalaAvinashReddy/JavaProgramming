package oops;

public class stringbufferandbuilder {
    public static void main(String[] args) {
        //creating a string buffer
        StringBuffer a = new StringBuffer();
        a.append("avinash");
        System.out.println(a);
        a.insert(0,"P ");//space created will also have index
        System.out.println(a);
        a.replace(2,3,"A");
        System.out.println(a);
        System.out.println(a.indexOf("Avinash"));
        System.out.println(a.charAt(2));
        a.reverse();
        System.out.println(a);

        //using string buffer with existing variables
        String b = "Hello-World";
        StringBuffer b1 = new StringBuffer(b);
        System.out.println(b1);
        b1.delete(0,6);
        System.out.println(b1);


        //creating an string buffer having some specified capacity
        //default capacity of the String buffer is 16
        StringBuffer c = new StringBuffer(27);
        // capacity() to show the capacity
        System.out.println(c.capacity());

        StringBuilder c2 = new StringBuilder();
        c2.append("avinash reddy");
        System.out.println(c2);
        System.out.println(c2.capacity());
        System.out.println(c2.reverse());
        System.out.println(c2.indexOf("reddy"));
        System.out.println(c2.charAt(4));


    }
}
