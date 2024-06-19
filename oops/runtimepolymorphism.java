package oops;


    class sum{
        void bike(){
            System.out.println("run run");
        }
    }
    class multi extends sum{
         void bike(){
             System.out.println("stop stop");
         }
    }
public class runtimepolymorphism {
    public static void main(String[] args) {
        sum b = new sum();

      multi a = new multi();
        a.bike();
    }
}
