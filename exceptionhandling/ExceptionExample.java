package exceptionhandling;

public class ExceptionExample {
    public static void main(String[] args) {
        // arthemetic exception
//        int a = 50/0;
//        System.out.println(a);
        // nullpointer exception
//        String b = null;
//        System.out.println(b.length());
        //number format
//        String c = "abc";
//        System.out.println(Integer.parseInt(c));
        //index out bound
//        int arr[] = {2,4};
//        arr[4] = 20;
//        System.out.println(arr.length);
        // try catch
//        try{
//            int data = 50/0;
//            System.out.println(data);
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println("our regular code");

//        try{
//            int data = 50/0;
//            System.out.println(data);
//        }catch (Exception e){
//            int data = 50/2;
//            System.out.println(data);
//        }

        // multiple catch blocks followed by try
//        int arr[] = new int[5];
//        try{
//            //arr[5] = 50/0;
//            String s = null;
//            System.out.println(s.length());
//        }catch(ArithmeticException e){
//            System.out.println("Arthmetic Exception");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array Index out of Bounds");
//        }catch(Exception avi){
//            System.out.println("parent exception" +"  " + avi);
//        }finally {
//            System.out.println("this is end of exception handling");
//        }

        // use of throw keyword
        int age = 13;
        if (age<18){
            throw new ArithmeticException("Person is not eligible for voting");
        }else{
            System.out.println("Eligible for voting");
        }
    }
}
