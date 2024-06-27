package oops;


    interface MyInterface{
        void animal();
        void bird();
    }
    interface abc{
        int a = 100;
    }
    interface rough{
        int a = 300;
    }
    interface example extends MyInterface{
        void mammel();
    }
    class avi implements example{
        @Override
        public void animal() {
            System.out.println("Animals Catogery");
        }

        @Override
        public void bird() {
            System.out.println("Birds catogery");
        }

        @Override
        public void mammel() {
            System.out.println("Mammels catogery");
        }

        public static void main(String[] args) {
            example a = new avi();
            a.animal();
            a.bird();
            a.mammel();

    }
}
class interfaces implements abc,rough{
    public static void main(String[] args) {
        System.out.println(abc.a);
        System.out.println(rough.a);
    }
}
