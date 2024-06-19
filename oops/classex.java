package oops;

class classex {
    String name;
    int age;

    //creating a constructor
    classex(String name1, int age2){
        this.name = name1;
        this.age = age2;
    }

    public static void main(String[] args) {
        //creating a new object
        classex obj1 = new classex("avinash",22);
        classex obj2 = new classex("bhanu",23);
        System.out.println(obj1.name+" "+obj1.age);
        System.out.println(obj1.name+" "+obj2.name);
    }
}
