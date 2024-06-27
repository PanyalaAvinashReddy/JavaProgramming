package collections;
import java.util.Hashtable;
public class hashtable {
    public static void main(String[] args) {
        Hashtable<String,Integer> phone = new Hashtable<>();
        phone.put("bhanu",123456789);
        phone.put("avinash",123456789);
        System.out.println(phone.get("avinash"));
        System.out.println(phone.remove("bhanu"));
        System.out.println(phone.get("bhanu"));
        System.out.println(phone.contains("avinash"));
        System.out.println(phone.isEmpty());

    }
}
