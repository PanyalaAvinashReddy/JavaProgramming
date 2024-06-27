package oops;

public class inheritance {
    int a = 10;
    int b = 20;

    void cal(){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        inheritance c = new suminherit();
        c.cal();
        inheritance c1 = new subinherit();
        c1.cal();
        inheritance c2 = new multiinherit();
        c2.cal();
        inheritance c3 = new divinherit();
        c3.cal();
    }
}

class suminherit extends inheritance{
    @Override
    void cal() {
        System.out.println("addition of "+a+"&"+b+" : "+(a+b));
    }
}
class subinherit extends inheritance{
    @Override
    void cal() {
        System.out.println("subtraction of "+a+"&"+b+" : "+(a-b));
    }
}
class multiinherit extends subinherit{
    @Override
    void cal() {
        System.out.println("multiplication of "+a+"&"+b+" : "+(a*b));
    }
}
class divinherit extends multiinherit{
    @Override
    void cal() {
        System.out.println("division of "+a+"&"+b+" : "+(a/b));
    }
}

