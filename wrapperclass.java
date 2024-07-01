import java.lang.*;

public class wrapperclass {
    public static void main(String[] args) {
        //converting primitive datatypen to obj
        int num = 100;
        Integer obj = Integer.valueOf(num);
        System.out.println(obj);
        // converting obj to primitive
        Integer avi = Integer.valueOf(200);
        int a = avi.intValue();
        System.out.println(a);
    }
}
