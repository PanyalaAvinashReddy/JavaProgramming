package exceptionhandling;

public class throwkey {
    public static void main(String[] args) {
        int num = -3;
        if(num < 1){
            throw new ArithmeticException("not a valid number");
        }else{
            System.out.println("the square of the number is :" + (num*num));
        }
    }
}
