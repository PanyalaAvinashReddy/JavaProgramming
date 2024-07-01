import java.util.ArrayList;
import java.util.List;

class laptop{
    int id;
    String model;
    static float price;
    public laptop(int id,String model,float price){
        this.id = id;
        this.model = model;
        laptop.price = price;
    }
}
public class filtering {
    public static void main(String[] args) {
        List<laptop> product = new ArrayList<laptop>();
        product.add(new laptop(101,"Dell",5234799f));
        product.add(new laptop(102,"HP",43876f));
        product.add(new laptop(103,"ASUS",32897f));

        List<Float> filtered = new ArrayList<>();
        for(laptop a:product){
            if(laptop.price >50000){
                filtered.add(laptop.price);
            }
        }
        System.out.println(filtered);
    }
}
