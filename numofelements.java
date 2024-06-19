import java.util.Arrays;

public class numofelements {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,1,2,0};
        int count = 0;
        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            count++;
        }
        System.out.println(count);
    }
}
