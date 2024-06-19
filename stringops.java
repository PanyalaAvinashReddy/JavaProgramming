import java.util.*;
public class stringops {
    public static void main(String[] args) {
        String a = "Avinash";
        String d = "Avinash";
        String e = "avinash";
        String b = "reddy";
        String c = "Panyala";
        String end = "avinashreddy@infoservices.com";

        //Concatenation
        String con = a+" " +b+" "+c;
        System.out.println("Concatination by + operator :" + con);

        String con1 = a.concat(b);
        String con2 = con1.concat(c);
        System.out.println("concatination by concat() : " + con2);
        //concatination by string buffer
        StringBuilder sc = new StringBuilder("avinash");
        StringBuilder sc3 = sc.append("reddy");
        System.out.println("String buffer concatenation : " + sc3);


        //string Comparison
        System.out.println("Both the strings are : "+a.equals(d));
        System.out.println(con.equals(con2));
        System.out.println("After ignoring the case : " + a.equalsIgnoreCase(e));

        //substrings of a string
        String sub = c.substring(0,5);
        System.out.println("the substring : "+ sub);
        System.out.println(con2.substring(7));

        System.out.println("after trim :" + con2.trim());
        //to uppercase
        System.out.println("upper case :"+con2.toUpperCase());
        //to lowercase
        System.out.println("lower case :"+con2.toLowerCase());
        //contains
        System.out.println("contains keyword :"+con2.contains(a));
        boolean contain = a.contains(d);
        System.out.println(contain);

        if(end.contains("infoservices")){
            System.out.println("infoservices employee");
        }else{
            System.out.println("not an employee");
        }

        //endswith

        if(end.endsWith(".com")){
            System.out.println("Verified Email");
        }else{
            System.out.println("incorrect domain");
        }

        //indexof
        int str2 = end.indexOf(".com");
        System.out.println(str2);

        String str = "what is what which is which";
        System.out.println(str.indexOf("is",6));
        System.out.println(str.indexOf("what",6));

        //intern of
        String a1 = "";
        String a2 = "hello";
        String a3 = a1.intern(); //works as expected
        if(a1==a2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        //isEmpty
        System.out.println(a1.isEmpty());

        //join
        String s1 = String.join("/","14","06","2024");
        String s2 = String.join(":","05","33");
        System.out.println(s1+" "+s2);

        //length()
        int s = end.length();
        System.out.println("the length of string is : "+s);
        //reverse a string using length function
        int size = end.length();
        for(int i=0;i<size;i++){
            System.out.print(end.charAt(end.length()-i-1));
        }

        //

    }
}
