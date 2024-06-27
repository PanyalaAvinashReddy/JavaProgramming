package oops;

class encap{

    private String name;
    private int age;
    private String roll;

    public int getAge() {
        return age;
    }

    public String getRoll() {
        return roll;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        encap obj = new encap();
        obj.setName("Avinash");
        obj.setAge(22);
        obj.setRoll("T19");
        System.out.println("Name of Employee :"+obj.getName());
        System.out.println("Age of employee :"+obj.getAge());
        System.out.println("Id of Employee :"+obj.getRoll());
    }
}
