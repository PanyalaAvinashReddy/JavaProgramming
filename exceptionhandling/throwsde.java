package exceptionhandling;

public class throwsde {
    public static int method(int a,int b) throws ArithmeticException{
        int c = a/b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        throwsde obj = new throwsde();
        try{
            method(20,0);
        }catch(ArithmeticException avi) {
            System.out.println(avi);
        }

    }
}
