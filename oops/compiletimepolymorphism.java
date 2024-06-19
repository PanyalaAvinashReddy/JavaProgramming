package oops;

public class compiletimepolymorphism {

    //method overloading
    class arthematic {
        static int sum(int a, int b) {
            return a+b;
        }
        static double multi(double a , double b){
            return a*b;
        }
        static int sum(int a,int b,int c){
            return a+b+c;
        }
    }

    public static void main(String[] args) {
        System.out.println(arthematic.multi(10.5,10.2));
        System.out.println(arthematic.sum(10,20));
        System.out.println(arthematic.sum(10,30,40));
    }
}
