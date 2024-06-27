package oops;

public abstract class abstractclass {
    abstract void sound();

    public static void main(String[] args) {
        //accessing child class from parent class
        dog cay = new dog();
        cay.sound();
    }
}
    class dog extends abstractclass{
        public void sound(){
            //over riding the method of parent class
            System.out.println("Bow-Bow");
    }

        public static void main(String[] args) {
            dog obj = new dog();
            obj.sound();
        }
}
class cat extends abstractclass{
    void sound(){
        System.out.println("Meow-Meow");
    }

    public static void main(String[] args) {
        abstractclass obj1 = new cat();
        obj1.sound();
    }
}
